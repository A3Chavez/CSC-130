import java.util.*;
/**
 * Problem 3
 * This Program finds the smallest and the largest decimal value of the characters partitioned from the input String.
 * The character with the smallest decimal value will be at the top of the Min Heap.
 */

public class prob4 {
    public static void main(String[] args) {
        String input = "lvvva";
        int min = findMin(input);
        
        System.out.println("The smallest decimal value is: " + min);
    }
    
    public static int findMin(String input) {
        int[] heap = new int[input.length()+1];
        int size = 0;
        if(input.length()==0)
            return -1;
        for(int i=0; i<input.length(); i++) {
            if(size==0) {
                size++;
                heap[size] = input.charAt(i);
            } else {
                size++;
                heap[size] = input.charAt(i);
                reorder(heap, size);
            }
            System.out.println(Arrays.toString(heap));
        }
        return heap[1];
    }
    
    public static void reorder(int[] heap, int size) {
        int parent = 0;
        boolean done = false;
        while(!done) {
            parent = size / 2;
            if(heap[size] < heap[parent]) {
                int tmp = heap[parent];
                heap[parent] = heap[size];
                heap[size] = tmp;
            }
            size -= 2;
            if(parent - 1 == 0)
                done = true;
        }
        return;
    }
    
}