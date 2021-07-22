package com.numberconversions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumerals {
    //Write a method to convert an integer to a Roman Numeral
    /*
    * Character | Numerical Value
    * I = 1
    * V = 5
    * X = 10
    * L = 50
    * C = 100
    * D = 500
    * M = 1000
    *
    * Rules:
    * In most cases, roman numerals are written highest to lowest from left to
    * right, except special cases where the left character is less than the right.
    * For example, 'IV' is 4 not 'IIII', and 'IX' is equivalent to '9'
    *
    * Exceptions:
    * I can be placed before V or X, represent subtract one. IV (5-1) = 4,
    * IX (10-1)=9
    * X can be placed before L or C, represents subtract ten (i.e. XL = (50-40)
    * and XC (100-10) = 90
    * C placed before D or M represents subtract hundred, co DC (500-100)=400 and
    * CM (1000-100) = 900
    *
    * Examples:
    * Integer: 25, Roman: XXV
    * Integer: 36, Roman: XXXVI
    * Integer: 1023, Roman: MXXIII
    * Integer: 542, Roman: DXLII
    * Integer: 1552, Roman; MDLII
    * Integer: 40, Roman: XL
    *
    * */
    public static String intToRomanNumeral(int num){
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanLiterals ={"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V" , "IV", "I"};

        StringBuilder roman = new StringBuilder();

        for(int i=0; i<values.length;i++) {
            while (num >= values[i]) {
                num -= values[i];
                roman.append(romanLiterals[i]);
            }
        }

        return roman.toString();
    }

    private static int romanValue(char roman){
        if (roman == 'I')
            return 1;
        if (roman == 'V')
            return 5;
        if (roman == 'X')
            return 10;
        if (roman == 'L')
            return 50;
        if (roman == 'C')
            return 100;
        if (roman == 'D')
            return 500;
        if (roman == 'M')
            return 1000;

        return -1;
    }

    public static int romanNumeralToInt(String roman){
        int result = 0;

        for (int i=0; i<roman.length(); i++){
            int s1 = romanValue(roman.charAt(i));

            if (i+1 < roman.length()){
                int s2 = romanValue(roman.charAt(i+1));
                if (s1 >= s2){
                    result += s1;
                } else{
                    result += (s2-s1);
                    i++;
                }
            }else{
                result += s1;
            }

        }
        return result;
    }

    @Test
    public void intToRomanNumeralTest(){
        assertEquals("IV",intToRomanNumeral(4));
        assertEquals("VIII",intToRomanNumeral(8));
        assertEquals("CML",intToRomanNumeral(950));
        assertEquals("CMLXII",intToRomanNumeral(962));
    }

    @Test
    public void romanValueTest(){
        assertEquals(1, romanValue('I'));
        assertEquals(5, romanValue('V'));
        assertEquals(10, romanValue('X'));
        assertEquals(50, romanValue('L'));
        assertEquals(100, romanValue('C'));
        assertEquals(500, romanValue('D'));
        assertEquals(1000, romanValue('M'));
    }

    @Test
    public void romanNumeralToIntTest(){
        assertEquals(942, romanNumeralToInt("CMXLII"));
        assertEquals(67, romanNumeralToInt("LXVII"));
    }
}
