/**
 * Solution to insertionSort 2. Solution was written and tested
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

    // Complete the insertionSort2 function below.
    static void insertionSort2(int n, int[] arr) {
        int j = 0;                  // container to store i
        boolean sorted = false;     // pass sorted
        boolean check = false;      // backtrack checking

        if(arr.length == 1) {
            System.out.println(print(arr));
            return;
        }
        for(int i = 0; i < arr.length-1; i++) {
            sorted = false;
            check = false;
            j = i;
            while(!sorted) {
                if(arr[i+1] < arr[i] && !check) {
                    arr = swap(i, i+1, arr);
                    check = true;
                } else if(check) {
                    if(j-1 == -1) {
                        check = false;
                        break;
                    } if(arr[j] < arr[j-1]) {
                        arr = swap(j-1, j, arr);
                        j--;
                    } else {
                        check = false;
                        break;
                    }
                } else {
                    sorted = true;
                }
            }
            System.out.println(print(arr));
        }
    }

    // Swap two values given the indexes
    static int[] swap(int lo, int hi, int[] arr) {
        int temp = arr[hi];
        arr[hi] = arr[lo];
        arr[lo] = temp;
        return arr;
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

        insertionSort2(n, arr);

        scanner.close();
    }
}
