package com.stayready.assessment.week2.part02;
import java.util.Arrays;  

public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        int len=arrayToBeSpliced.length; //length of the array 
        int size=len-2; //minus the start and indexes 
        String [] newArray= new String[size]; //new array without the start and end indexes
        int n=len-1;
        newArray=Arrays.copyOfRange(arrayToBeSpliced,0,len); //len-1 bc is len-1=last index and its exclusive so it will give the second to last index
        return newArray;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        int len=arrayToBeSpliced.length; //length of the array 
        int size=len-2; //minus the start and indexes 
        String [] newArray= new String[size]; //new array without the start and end indexes
        //int n=len-1;
        newArray=Arrays.copyOfRange(arrayToBeSpliced,1,len); //len-1 bc is len-1=last index and its exclusive so it will give the second to last index
        return newArray;

    }
}
