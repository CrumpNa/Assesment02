package com.stayready.assessment.week2.part01;

public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        String onePad=" "; //one space 
        String finalString=""; //final string 
        int spaces=amountOfPadding/2; //number of spaces to add 

        // in for loop add pads first finalString=pads+stringToBePadded; 
         //then add the string to the end 
        for(int i=0;i<=spaces+1;i++){
            finalString+=onePad; }

        finalString+=stringToBePadded; //add the string 
        return finalString; 
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        return null;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String output = ""; //string to output with repetitions
        for (int i = 0; i <= numberOfTimeToRepeat-1; i++) {
            output += stringToBeRepeated;


        }
        return output;
    }
    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alphabetic a-z characters
     */
    public static Boolean isAlphaString(String string) {
        boolean ifAlpha=false;

        for (int i=0;i<string.length();i++){
            char s=string.charAt(i);  //each character
        if(!(s>='A' && s<='Z') && !(s>='a' && s<='z')){
            ifAlpha=false;
        }else{
            ifAlpha=true ;
        }
    }
        return ifAlpha;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {

        boolean ifNumeric=false;
        for(int i=0;i<string.length()-1;i++){ //run thru entrie string 
        char s=string.charAt(i);  //change to character 
        if(Character.isDigit(s)){
            ifNumeric=true;
        }else{
            System.out.print("hi");
            ifNumeric=false;
        }
    }
        return ifNumeric;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        boolean ifSpecial=false;
        String specialChars = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
        for(int i=0;i<string.length()-1;i++){ //run thru entrie string 
        char s=string.charAt(i);  //change to character 
        if(specialChars.contains(String.valueOf(s))){
            ifSpecial=true;
        }else{
            ifSpecial=false;
        }
    }
    return ifSpecial;
    
    }
    }

