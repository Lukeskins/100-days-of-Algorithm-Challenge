// Compare the Triplets

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a[] = triplet(scan);
        int b[] = triplet(scan);

        int alice = 0;
        int bob = 0;
        for (int i = 0; i < a.length; i++) {
                if (a[i] > b[i]) {
                        alice++;
                } else if (a[i] < b[i]) {
                        bob++;
                }
        }
        System.out.println(alice + " " + bob);

        scan.close();
}

static int[] triplet(Scanner scan) {
        int[] x = new int[3];
        for (int i = 0; i < x.length; i++) {
                x[i] = scan.nextInt();
        }
        return x;
}
}
