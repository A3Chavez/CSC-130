import java.util.*;

/**
 * Runtime: O(n^2)
 */
public class prob5 {
    public static void main(String[] args) {
        String signs = "IXMVDKIXMV";
        int length = signs.length();
        int min = findLocation(length, signs);
        System.out.println("The min number of signs is: " + min);
    }
    
    /**
     * Parse through the String to find a unique sequence.
     *
     * @param N length of the String n
     * @param n String to be parsed through
     * @return int min number of signs to create a uniqe sequence
     */
    public static int findLocation(int N, String n) {
        String tmp = "";
        int min = 0;
        boolean found = false;
        try {
            for(int i=1; i<=N; i++) {
                found = false;
                tmp = n.substring(0, i);
                for(int j=i; j<N; j++) {
                    min = i;
                    if(tmp.equals(n.substring(j,j+i))) {
                        found = true;
                        break;
                    }
                }
            } 
        } catch (StringIndexOutOfBoundsException e) {
            if(!found)
                return min;
        }
          return 1;
    }
}