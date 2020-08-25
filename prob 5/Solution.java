/**
* Can't compile and run in this IDE, this program still passed the tests on HackerRank, please see success screen for proof.
*
* Author: Anthony Chavez
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the quickSort function below.
    static int[] quickSort(int[] arr) {
        int pivot = arr[0];
        int[] left = {};
        int[] right = {};
        int[] sorted = new int[arr.length];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < pivot) {
                left = fillArray(left, arr[i]);    // add to left array
            } else if(arr[i] > pivot) {
                right = fillArray(right, arr[i]);   // add to right array
            }
        }

        for(int i = 0; i < left.length; i++)
            sorted[i] = left[i];

        sorted[left.length] = pivot;

        for(int i = 0; i < right.length; i++)
            sorted[left.length+i+1] = right[i];

        return sorted;
    }

    // Fill array with values
    static int[] fillArray(int[] arr, int value) {
        int[] newArray = new int[arr.length+1];
        for(int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }

        newArray[newArray.length-1] = value;

        return newArray;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = quickSort(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
