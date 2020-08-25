/**
 * Solution to insertionSort 1. Solution was written and tested
 * in the Hackerrank.com IDE. Please see picture for success 
 * screen.
 *
 * To run:
 * 1. Enter a number between 1 to 1000, this number will be the number of 
 *    elements that will be entered, hit enter
 * 2. Enter the numbers separated by a space with respect to the number you 
 *    previously entered. -10000 <= arr[i] <= 10000, hit enter.
 * 3. Hit enter one more time and the algorithm will start sorting.
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

    // Complete the insertionSort1 function below.
    static void insertionSort1(int n, int[] arr) {
        n--;    // n is one less than original n value
        int value = arr[n];     // value to be placed properly
        boolean found = false;

        while(!found) {
            if(n-1 == -1) {
                arr[n] = value;
                found = true;
                System.out.println(print(arr));
            }
            else if(arr[n-1] > value) {
                arr[n] = arr[n-1];
                n--;
                System.out.println(print(arr));
            } else {
                found = true;
                arr[n] = value;
                System.out.println(print(arr));
            }
        }
    }

    // Builds a String representation of current array
    static String print(int[] arr) {
        String s = "";
        for(int i = 0; i < arr.length; i++) {
            s = s + arr[i] + " ";
        }
        s.substring(0, s.length()-2);   // delete extra space at end
        return s;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort1(n, arr);

        scanner.close();
    }
}
