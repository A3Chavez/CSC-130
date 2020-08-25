import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SolutionInitial {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        boolean yes = true;     // all required words make the note
        boolean found = false;  // required word found during a pass

        String[][] checklist = new String[magazine.length][magazine.length];

        checklist = fillChecklist(magazine, checklist);

        for(int i = 0; i < note.length; i++) {
            found = false;
            for(int j = 0; j < magazine.length; j++) {
                if(note[i].equals(magazine[j])) {
                    if(checklist[j][1].equals("Taken")) {
                        yes = false;
                        continue;
                    }
                    yes = true;
                    found = true;
                    checklist[i][1] = "Taken";
                    break;
                } else {
                    yes = false;
                }
            }
            if(!yes || !found) {
                System.out.println("No");
                break;
            }
        }
        if(yes) 
            System.out.println("Yes");
    }

    static String[][] fillChecklist(String[] magazine, String[][] checklist) {
        for(int i = 0; i < magazine.length; i++) {
            checklist[i][0] = magazine[i];
            checklist[i][1] = "Not Taken";
        }
        return checklist;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
