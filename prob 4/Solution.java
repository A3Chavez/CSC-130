/**
* Simply added a new variable called shifts to count amount of shifts done.
* Used code from prob 3 as stated to do so in the problem 4 and modified to problem 4's requirements.
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

    // Complete the runningTime function below.
    static int runningTime(int[] arr) {
        int shifts = 0;
        for(int i = 1; i < arr.length; i++){
            int value = arr[i];
            int j = i - 1;
            while(j > -1 && arr[j] > value){
                arr[j + 1] = arr[j];
                j = j - 1;
                shifts++;
            }
            arr[j + 1] = value;
        }
        return shifts;
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

        int result = runningTime(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
