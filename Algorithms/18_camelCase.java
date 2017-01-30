// CamelCase

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        int cap = 0;
        for (int i = 0; i < s.length()-1; i++) {
                char check = s.charAt(i);
                if (check >= 65 && check <= 90) {
                        cap++;
                }
        }

        System.out.println(cap+1);
}
}
