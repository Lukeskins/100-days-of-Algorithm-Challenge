// Staircase

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int line = 1; line <= n; line++) {
                for (int sp = n - line; sp > 0; sp--) {
                        System.out.print(" ");
                }
                for (int sym = 0; sym < line; sym++ ) {
                        System.out.print("#");
                }
                System.out.println("");
        }
}
}
