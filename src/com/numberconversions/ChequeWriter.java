package com.numberconversions;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ChequeWriter {
    /*
    Write a simple program to write a cheque
    Assume Two decimal number between 0.00-9999.99
    Assume Dollars and Cents
    Assume all inputs are validated to two decimal places
    Assume the English language is used

     */

    private static final String[] tensNames = {
            "",
            "Ten ",
            "Twenty ",
            "Thirty ",
            "Forty ",
            "Fifty ",
            "Sixty ",
            "Seventy ",
            "Eighty ",
            "Ninety ",
    };

    private static final String[] numsNames = {
            "Zero ",
            "One ",
            "Two ",
            "Three ",
            "Four ",
            "Five ",
            "Six ",
            "Seven ",
            "Eight ",
            "Nine ",
            "Ten ",
            "Eleven ",
            "Twelve ",
            "Thirteen ",
            "Fourteen ",
            "Fifteen ",
            "Sixteen ",
            "Seventeen ",
            "Eighteen ",
            "Nineteen "
    };

    private static BigDecimal getDollars(BigDecimal value){
        return value.setScale(0,RoundingMode.DOWN);
    }

    private static BigDecimal getCents(BigDecimal value){
        return value.subtract(getDollars(value)).movePointRight(2);
    }

    //Recursive method, O(nlogn) time, doesn't matter since n (number of digits) won't get huge anyway
    public static String convert(int input){
        StringBuilder output = new StringBuilder();
        if (input < 20){
            output.append(numsNames[input]);
        }
        else if (input < 100){
            output.append(tensNames[input/10]);
            input %= 10;
            output.append(convert(input));
        }
        else if (input < 1000){
            output.append(numsNames[input/100]);
            output.append("Hundred ");
            input %= 100;
            output.append(convert(input));
        }
        else if (input < 1000000){
            output.append(convert(input/1000));
            output.append("Thousand ");
            input %= 1000;
            output.append(convert(input));
        }
        else if (input < 1000000000){
            output.append(convert(input/1000000));
            output.append("Million ");
            input %= 1000000;
            output.append(convert(input));
        }
        return output.toString();
    }

    public static void printCheque(String input){
        BigDecimal amount = new BigDecimal(input);
        BigDecimal dollars = getDollars(amount);
        BigDecimal cents = getCents(amount);

        System.out.println(amount);
        if (cents.intValue() == 0)
            System.out.println(convert(dollars.intValue()) + "dollars only");
        else
            System.out.println(convert(dollars.intValue()) + "dollars and " + convert(cents.intValue()) + "cents");
    }

    public static void main(String[] args) {
        printCheque("1.00");
        printCheque("12.00");
        printCheque("123.00");
        printCheque("1234.00");
        printCheque("12345.00");
        printCheque("123456.00");
        printCheque("1234567.00");
        printCheque("12345678.00");
        printCheque("123456789.00");
    }
}
