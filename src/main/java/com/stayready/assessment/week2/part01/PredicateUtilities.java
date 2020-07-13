package com.stayready.assessment.week2.part01;

public class PredicateUtilities {
    /**
     * @param value - the value to be evaluated
     * @return true if `value` is a multiple of 2
     */
    public static Boolean isEven(Integer value) {
        //test(0, true);
        boolean isTrue=false; 
        if(value%2==0){
            isTrue=true;
        }else{
            isTrue=false;
        }

        return isTrue;
    }

    /**
     * @param value - the value to be evaluated
     * @return true if `value` is not a multiple of 2
     */
    public static Boolean isOdd(Integer value) {//test(0, true);
        boolean isTrue=false; 
        if(value%2==1){
            isTrue=true;
        }else{
            isTrue=false;
        }

        return isTrue;
    
    }

    /**
     * @param value - the value to be evaluated
     * @return true if `value` is a multiple of 3
     */
    public static Boolean isMultipleOf3(Integer value) {
        boolean isTrue=false; 
        if(value%3==0){
            isTrue=true; 
        }else{
           isTrue=false; 
        }
        return isTrue;
    }

    /**
     *
     * @param value - the value to be evaluated
     * @param multiple - the multiple to test `value` against
     * @return true if `value` is a multiple of `multiple`
     */
    public static Boolean isMultipleOfN(Integer value, Integer multiple) { 
        boolean isTrue=false; 
        if(value%multiple==0){
            isTrue=true; 
        }else{
           isTrue=false; 
        }
        return isTrue;
    }

    /**
     * @param string - the string to be evaluated
     * @return true if `string` starts with a capital letter
     */
    public static Boolean startsWithCapitalLetter(String string) {
        boolean isTrue = false;
        Character firstLetter = string.charAt(0); //first letter
        if (Character.isUpperCase(firstLetter)) {
            isTrue = true;
        } else {
            isTrue = false;
        }
        return isTrue;

    }
}
