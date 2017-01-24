// Diagonal Difference

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }

        int first = 0;
        int second = 0;

        // calculate the first diagonal
       for (int row = 0; row < n; row++) {
           int col = row;
           first += a[row][col];
       }
       // calculate the second diagonal
       int secondCol = n - 1;
       for (int row = 0; row < n; row++) {
           second += a[row][secondCol];
           secondCol--;
       }

        int diff = first - second;
        diff = Math.abs(diff);

       System.out.println(diff);
    }
}
