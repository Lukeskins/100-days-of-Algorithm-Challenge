// Caesar Cipher

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = Integer.parseInt(in.nextLine());
        String text = in.nextLine();
        int shift = Integer.parseInt(in.nextLine());
        int charNum = 0;


        for (int i = 0; i < len; i++) {
                char encrypted = text.charAt(i);
                if ((((int) encrypted >= 65) && ((int) encrypted <= 90)) || (((int) encrypted >= 97) && ((int) encrypted <= 122))) {
                        if (((int) encrypted >= 65) && ((int) encrypted <= 90)) {
                                charNum = 1;
                        }
                        else if (((int) encrypted >= 97) && ((int) encrypted <= 122)) {
                                charNum = 2;
                        }
                        for (int k = 0; k < shift; k++) {
                                encrypted++;
                                if (charNum == 1) {
                                        if (encrypted > 90) {
                                                encrypted = 65;
                                        }
                                }
                                else if (charNum == 2) {
                                        if (encrypted > 122) {
                                                encrypted = 97;
                                        }
                                }
                        }
                }
                System.out.print(encrypted);
        }
}
}
