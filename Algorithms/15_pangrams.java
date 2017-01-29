// Pangrams

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
private static int count;
public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        str = str.trim().toLowerCase();
        int[] alphabet = new int[28];
        char[] charSent = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
                if(charSent[i]>=97 && charSent[i]<=122) {
                        alphabet[charSent[i]-97]++;
                }

        }

        for (int i = 0; i < alphabet.length; i++) {
                if(alphabet[i]>0) {
                        count++;
                }
        }
        if(count==26) {
                System.out.println("pangram");
        }
        else {
                System.out.println("not pangram");
        }
}
}
