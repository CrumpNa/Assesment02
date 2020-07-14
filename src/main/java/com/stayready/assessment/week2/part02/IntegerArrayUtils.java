package com.stayready.assessment.week2.part02;
import java.util.ArrayList; //so I can use an arraylist 

public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        ArrayList<Integer> newArray = new ArrayList<Integer>(); //initialize arraylist 
        for(int i=0;i<=integerArray.length; i++){
            newArray.add(integerArray[i]); //add each of the elements in the original array 
    
        }
        newArray.add(valueToBeAdded); //add new integer 
        Integer[] finalArray = newArray.toArray(new Integer[0]);
        //Object[] finalArray = newArray.toArray();//convert array list to int array
        return finalArray;
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {

        return null;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        int integer=integerArray[indexToFetch];
        return integer;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        for (int i=0;i<=integerArray.length;i++){
            if(integerArray[i]%2==0){//if even 
                integerArray[i]=integerArray[i]+1;//increment by one 
            }else{//if odd 
                integerArray[i]=integerArray[i]-1;//increment by one 
            }
        }
        return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        return null;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        return null;
    }
}
