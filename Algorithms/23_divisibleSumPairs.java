// Divisible Sum Pairs

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
        int arr[] = new int[n];
        for(int i=0; i < n; i++) {
                arr[i] = in.nextInt();
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                        if ((arr[i] + arr[j]) % k == 0) {
                                count++;
                        }
                }


        }
        System.out.println(count);
        in.close();
}
}
