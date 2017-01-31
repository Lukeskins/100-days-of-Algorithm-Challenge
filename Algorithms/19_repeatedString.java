// Repeated String

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String s = in.next();

        long n = in.nextLong();
        long num = n / s.length();
        long rem = n % s.length();

        long count = 0;
        for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a') {
                        count+=num;
                        if (i < rem) {
                                count++;
                        }
                }
        }
        System.out.println(count);
}
}
