package Arrays;

import java.util.*;

public class Question_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		// Input array
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] == 10) {
				arr[i] = 0;
			}
		}
		int index = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
				index++;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]);
			if (i < n - 1) {
				System.out.print(",");
			}
		}
		sc.close();
	}
}