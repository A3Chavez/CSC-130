public class prob2 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 7;
        int OuterLoop = 0;
        int InnerLoop = 0;
  
        for (int i = 0; i < n; i++) {
            OuterLoop++;
            System.out.println("Outer loop " + OuterLoop);
            for (int j = 0; j < i*i; j++) {
                InnerLoop++;
                System.out.println("Inner loop executed "+ InnerLoop + " for OuterLoop increment " + OuterLoop);
                if (j > 2) {
                    System.out.println("Break executed at InnerLoop " + InnerLoop + " and OuterLoop " + OuterLoop);
                    break;
                }
                sum++;
                System.out.println("Sum = " + sum);
            }

        }
    }
}