// Find Digits

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
								Scanner in = new Scanner(System.in);
								int t = in.nextInt();
								for(int i = 0; i < t; i++) {
																int n = in.nextInt();
																String s = Integer.toString(n);
																int count = 0;
																for (int j = 0; j < s.length(); j++) {
																								int tmp = Character.getNumericValue(s.charAt(j));
																								if (tmp != 0 && n % tmp == 0) {
																																count++;
																								}
																}
																System.out.println(count);
								}


								in.close();
}
}
