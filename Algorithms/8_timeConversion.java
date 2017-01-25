// Time Conversion

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputTime = input.nextLine();
        String[] arr = inputTime.split(":");
        String h = arr[0];
        String m = arr[1];
        String s = arr[2].substring(0, 2);

        int tempHours;

        if (arr[2].substring(2, 4).equalsIgnoreCase("PM")) {
                if (Integer.parseInt(h) < 12) {
                        tempHours = Integer.parseInt(h);
                        tempHours += 12;
                        h = Integer.toString(tempHours);
                }
        }
        if (arr[2].substring(2, 4).equalsIgnoreCase("AM")) {
                if (Integer.parseInt(h) == 12) {
                        h = "00";
                }
        }
        System.out.println(h + ":" + m + ":" + s);
}
}
