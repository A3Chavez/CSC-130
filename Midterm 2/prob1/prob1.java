public class prob1 {
    public static void main(String[] args) {
        int n = 16;
        int q = 1;
        int ifExecutedTimes = 0;
        int whileExecutedTimes = 0;
        
        for (int i = n; i > 0; i -= 2) {
            if (i % 2 == 0) {
                q = i;
                ifExecutedTimes++;
                System.out.println("q = " + q + " and if executed "+ifExecutedTimes++);
            }
            while (q != 0) {
                q -= 2;
                System.out.println("q = " + q + " and while executed "+whileExecutedTimes++);
            }
        }
    }
}