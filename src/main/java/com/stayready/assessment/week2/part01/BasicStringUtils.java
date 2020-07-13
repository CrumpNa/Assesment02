package com.stayready.assessment.week2.part01;

//import sun.security.util.Length;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    //test("The", "Quick", "TheQuick");
    public static String concatentate(String string1, String string2) {
        String concatString="";  //will be the final concatenated string 
        concatString=string1+string2; //concatenate the 2 strings into concatString 
        return concatString;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
    int len=string1.length(); //take length of the string 
    String reversed=""; 
    //test("The", "ehT");
    for (int i=len-1; i>-1;i--){
      //the for loop will run thru the entire string 
      //starting at the end of the string
     reversed=reversed+string1.charAt(i);// will add to the the last char to the beginning of reversed 
     //and continue to go backwards thru string1, adding it to reversed  
      
        }
        return reversed;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
    // test("The", "Quick", "ehTkciuQ");
    int len=string1.length(); //take length of the strings
    int len2=string2.length(); 
    String reversed1=""; //the final reversed strings 
    String reversed2=""; 
    String concat=""; //final concatenated strings 
    
    for (int i=len-1; i>-1;i--){
      //the for loop will run thru the entire string 
      //starting at the end of the string
     reversed1=reversed1+string1.charAt(i);// will add to the the last char to the beginning of reversed 
     //and continue to go backwards thru string1, adding it to reversed  
    
    }
     //do same with second string 
    for (int i=len2-1; i>-1;i--){
      reversed2=reversed2+string2.charAt(i);
    }
    concat=reversed1+reversed2; //concatenate them into concat 
      

        return concat;
        
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
    //test("racecar", "r", "aceca");
    String finalString="";
    finalString=string.replaceAll(charactersToRemove, "");
        
    
    return finalString;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        return null;
    }
}
