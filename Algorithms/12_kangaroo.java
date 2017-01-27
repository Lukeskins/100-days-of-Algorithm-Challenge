// Kangaroo

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        int first = x1;
        int second = x2;
        boolean meets = false;

        for (int i = 0; i < 10000; i++) {
                if (first == second) {
                        System.out.println("YES");
                        meets = true;
                        break;
                }
                first+=v1;
                second+=v2;
        }

        if (meets == false) {
                System.out.println("NO");
        }

}
}
