import java.util.HashMap;
import java.util.List;

import com.test.AccountModule;

public class ThirdLargestInArrayExample {
	public static int getThirdLargest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[a.length - 3];
	}

	public static void main(String args[]) {
		int a[] = { 4,3,2,1};
		int b[] = { 44, 66, 99, 77, 33, 22, 55 };
		System.out.println("Third Largest: " + getThirdLargest(a, 4));
		System.out.println("Third Largest: " + getThirdLargest(b, 7));
	}
}