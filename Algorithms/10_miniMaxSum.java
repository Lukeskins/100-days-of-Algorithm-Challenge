// Mini-Max Sum

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long sum = 0;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        while(in.hasNext()) {
                long n = in.nextLong();
                sum += n;
                if (n < min) {
                        min = n;
                }
                if (n > max) {
                        max = n;
                }
        }

        in.close();

        System.out.println((sum - max) + " " + (sum - min));
}
}
