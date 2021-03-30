package lesson_09;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] randomArray;

        int[] numberArray = new int[10];
        randomArray = new int[20];
        randomArray[1] = 2;

        String[] stringArray = {"Just", "Random", "Words"};
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = i;
        }

        // draws 41 lines on the screen
        int k = 1;
        while (k <= 41){
            System.out.print('-');
            k++;
        }
        System.out.println();

        // cycles through all of the boxes int the array and prints them
        for(int j=0;j< numberArray.length;j++)
        {
            System.out.print("| "+j+" ");
        }
        System.out.println("|");

        // draws 41 lines on the screen
        k = 1;
        while (k <= 41){
            System.out.print('-');
            k++;
        }
        System.out.println();

        String[][] multiDArray = new String[10][10];

        for(int i=0;i< multiDArray.length; i++)
        {
            for(int j =0;j< multiDArray[1].length; j++)
            {
                multiDArray[i][j] = i + " " + j;
            }
        }

        // draws 61 lines on the screen
        k = 1;
        while (k <= 61){
            System.out.print('-');
            k++;
        }
        System.out.println();

        for(int i=0;i< multiDArray.length; i++) {
            for (int j = 0; j < multiDArray[i].length; j++) {
                System.out.print("| " + multiDArray[i][j] + " ");
            }
            System.out.print("|");
        }

        // draws 61 lines on the screen
        k = 1;
        while (k <= 61){
            System.out.print('-');
            k++;
        }
        System.out.println();

        // for(itemDataType tempVariable : arrayNAme)
        for(int row : numberArray)
        {
            System.out.print(row);
        }
        System.out.println("\n");

        // for(dataType[] varForRow : arrayName)

        for(String[] rows : multiDArray)
        {
            for(String column : rows)
            {
                System.out.print("| " + column + " ");
            }
            System.out.println("|");
        }

        // you can copy an array in a couple of ways
        // Arrays.copyOf(arrayToCopy, numberToCopyFromBeginning);
        int[] numberCopy = Arrays.copyOf(numberArray, 5);
        for(int num: numberCopy)
        {
            System.out.print(num);
        }
        System.out.println("\n");

        // Ypu can copy an array from one index to another with copyOfRange
        // int[] numberCopy = Arrays.copyOf(numberArray, 1, 5);

        // you can print out the whole Array with toString
        System.out.println(Arrays.toString(numberCopy));

        int[] moreNumbers = new int[100];
        Arrays.fill(moreNumbers, 2);

        char[][] boardGame = new char[10][10];
        for(char[] row : boardGame)
        {
            Arrays.fill(row, '*');
        }

        // you can sort an array using sort()
        int[] numsToSort = new int[10];

        // generate array full of random numbers
        for(int i =0;i<10;i++)
        {
            numsToSort[i]=(int) (Math.random() * 100);
        }

        //sort the array in ascending order
        Arrays.sort(numsToSort);

        System.out.println(Arrays.toString(numsToSort));

        // binarySearch returns the index for the searched for the value
        // if it doesn't find it it returns a negative number

        int whereIs50 = Arrays.binarySearch(numsToSort, 50);
        System.out.println(whereIs50);

    }
}
