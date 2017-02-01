// Mars Exploration

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        char str[] = S.toCharArray();
        int altered = 0;

        for (int i = 0; i < str.length; i++) {
                if(i%3==0) {
                        if(str[i]!='S') {
                                altered++;
                        }
                }
                if(i%3==1) {
                        if(str[i]!='O') {
                                altered++;
                        }
                }
                if(i%3==2) {
                        if(str[i]!='S') {
                                altered++;
                        }
                }
        }
        System.out.println(altered);
}
}
