// Designer PDF Viewer

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h[] = new int[26];
        for(int i=0; i < 26; i++) {
                h[i] = in.nextInt();
        }
        String word = in.next();

        int maxHeight = Integer.MIN_VALUE;

        for(int i = 0; i < word.length(); i++) {
                int charIndex = word.charAt(i) - 'a';
                int height = (int) h[charIndex];
                if(height > maxHeight) {
                        maxHeight = height;
                }
        }

        long area = word.length() * maxHeight;
        System.out.println(area);
}
}
