// Plus Minus

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int next = in.nextInt();
        int arr[] = new int[next];
        for(int arr_i=0; arr_i < next; arr_i++) {
                arr[arr_i] = in.nextInt();
        }

        double positive = 0;
        double negative = 0;
        double zero = 0;
        int len = arr.length;
        for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                        positive++;
                } else if (arr[i] < 0) {
                        negative++;
                } else {
                        zero++;
                }
        }

        double p = positive/next;
        double n = negative/next;
        double z = zero/next;

        System.out.println(p + "\n" + n + "\n" + z);
}
}
