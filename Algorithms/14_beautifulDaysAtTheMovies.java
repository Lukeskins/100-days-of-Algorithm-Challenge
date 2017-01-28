// Beautiful Days at the Movies

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
public static int reversed(int x) {
        int reverse = 0;
        while(x != 0 ) {
                reverse = reverse * 10;
                reverse = reverse + x%10;
                x = x/10;
        }
        return reverse;
}

public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int i = in.nextInt();
        int j = in.nextInt();

        int k = in.nextInt();

        int beautifulDays = 0;

        for (int day = i; day <= j; day++) {
                int reverse = reversed(day);
                if ( (Math.abs(day - reverse)) % k == 0) {
                        beautifulDays++;
                }
        }

        System.out.println(beautifulDays);
}
}
