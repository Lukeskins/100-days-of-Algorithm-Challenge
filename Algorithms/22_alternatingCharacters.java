// Alternating characters

import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int count = 0; count < T; count++) {
                char arr[] = in.next().toCharArray();
                int alter = 0;
                for(int i = 0; i < arr.length - 1; i++) {
                        if(arr[i] == arr[i+1]) {
                                alter++;
                        }
                }
                System.out.println(alter);
        }
        in.close();
}
}
