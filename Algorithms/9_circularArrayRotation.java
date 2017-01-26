// Circular Array Rotation

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] val = new int[n];
        int[] index = new int[n];
        for(int i=0; i < n; i++) {
                val[i] = in.nextInt();
                index[i] = i;
        }

        for (int i = 0; i < n; i++) {
                index[i] = (index[i]+k) % n;
        }

        for (int i = 0; i < q; i++) {
                int m = in.nextInt();
                for (int j = 0; j < n; j++) {
                        if (index[j] == m) {
                                System.out.println(val[j]);
                                break;
                        }
                }
        }
}
}
