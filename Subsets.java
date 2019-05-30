import java.io.*;

public class Subsets {
	static void subsetGen(int[] arr) {
		int len = arr.length;

		System.out.println("All subsets of arr: ");
		for (int i = 0; i < Math.pow(2, len); i++) {
			int count = 0;
			for (int j = 0; j < len; j++) {
				if ((i & (1 << j)) > 0) {
					System.out.print(arr[j] + " ");
				}
			}
			System.out.println();
		}

		System.out.println("\nAll subsets of length 3");
		for (int i = 0; i < Math.pow(2, len); i++) {
			int count = 0, currPos = 0;
			int[] positions = new int[3];
			for (int j = 0; j < len; j++) {
				if ((i & (1 << j)) > 0) {
					count++;

					// save the first 3 positions
					// as we want them for the 3 element
					// subsets
					if (count <= 3)
						positions[currPos++] = j;
				}
			}

			if (count == 3) {
				for (int j = 0; j < 3; j++) {
					System.out.print(arr[positions[j]] + " ");
				}
				System.out.println();
			}
		}
	}

	public static void main (String[] args) {
		int[] setVals = { 2, 6, 1, 4 };

		subsetGen(setVals);
	}
}
