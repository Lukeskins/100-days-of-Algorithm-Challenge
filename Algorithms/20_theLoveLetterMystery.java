// The Love-Letter Mystery

import java.util.Scanner;

public class Solution {

public static void main(String[] args) {

								Scanner in = new Scanner(System.in);

								int tc = in.nextInt();

								while (tc > 0) {

																String word = in.next();

																System.out.println(rotations(word));

																--tc;
								}

								in.close();
}

public static int rotations(String word) {
								char[] arr = word.toCharArray();

								int count = 0;
								int j = word.length() - 1;

								for(int i = 0; i < arr.length / 2; i++, j--) {
																count += Math.abs((int)(arr[i] - arr[j]));
								}

								return count;
}

}
