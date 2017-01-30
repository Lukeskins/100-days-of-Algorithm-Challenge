// Viral Advertising

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int liked = 0;
        int start = 5;
        for(int i = 0; i < n; i++) {
                int dayLiked = start / 2;
                int received = dayLiked * 3;
                liked += dayLiked;
                start = received;
        }
        System.out.println(liked);
        in.close();
}
}
