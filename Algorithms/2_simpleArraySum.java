// Simple Array Sum

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++) {
                arr[arr_i] = in.nextInt();
        }
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
                total += arr[i];
        }
        System.out.println(total);
}
}
