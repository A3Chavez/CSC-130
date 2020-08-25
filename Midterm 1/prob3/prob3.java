import java.util.*;
/**
 * Problem 3
 * This Program finds the smallest decimal value of the characters partitioned from the input String.
 * All spaces in the String will be omitted.
 * The character with the smallest decimal value will be at the top of the Min Heap.
 */

public class prob3 {
    public static void main(String[] args) {
        String input = "The Brown Fox A";
        int min = findMin(input);
        
        System.out.println("The smallest decimal value is: " + min);
    }
    
    /**
     * Find the minimum ASCII value of the input String
     * 
     * @param input String that will be partitioned
     * @return int min ASCII value of the character with the smallest value
     */
    public static int findMin(String input) {
        int[] heap = new int[input.length()+1];
        int size = 0;
        if(input.length()==0)
            return -1;
        for(int i=0; i<input.length(); i++) {
            if(size==0 && input.charAt(i) != 32) {
                size++;
                heap[size] = input.charAt(i);
            } else if(input.charAt(i) != 32){
                size++;
                heap[size] = input.charAt(i);
                reorder(heap, size);
            }
            System.out.println(Arrays.toString(heap));
        }
        return heap[1];
    }
    
    /**
     * Reorders the heap to have the smallest value at index 1
     * and bubble up the inserted value to the appropriate index.
     *
     * @param heap Single row array to hold the values of the characters from the input string
     * @param size index of the recently inserted value
     */
    public static void reorder(int[] heap, int size) {
        boolean done = false;
        while(!done) {
            if(heap[size] < heap[size/2]) {
                int tmp = heap[size/2];
                heap[size/2] = heap[size];
                heap[size] = tmp;
            }
         
            size -= 1;
            if(size - 1 == 0)
                done = true;
        }
        return;
    }
    
}