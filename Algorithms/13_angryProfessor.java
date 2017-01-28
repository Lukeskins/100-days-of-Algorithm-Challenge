// Angry Professor

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for(int num = 0; num < testCases; num++) {
                int students = in.nextInt();
                int threshold = in.nextInt();
                int arrivalTime[] = new int[students];
                for(int i=0; i < students; i++) {
                        arrivalTime[i] = in.nextInt();
                }

                boolean canceled = true;
                int total = 0;
                for (int i = 0; i < arrivalTime.length; i++) {
                        if (arrivalTime[i] <= 0) {
                                total+=1;
                        }
                        if (total >= threshold) {
                                canceled = false;
                                break;
                        }
                }

                if (canceled == true) {
                        System.out.println("YES");
                } else {
                        System.out.println("NO");
                }
        }


}
}
