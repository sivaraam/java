
import java.util.Arrays;

/*
 * This program finds the number of inversoin in an array
 * using merge sort
 *
 * https://stackoverflow.com/a/6424847/5614968
 */
// one class needs to have a main() method
public class ArrayInversionCount
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    int[] testArray = new int[] { 7, 1, 3, 2, 4, 5, 6};

    System.out.println(invCount(testArray));

    for (int a : testArray) {
      System.out.print(a);
      System.out.print(' ');
    }

    System.out.println();
  }
  
  static long merge(int[] arr, int[] left, int[] right) {
    int i = 0, j = 0, count = 0;

    System.out.print("merge: ");

    for (int a : left) {
      System.out.print(a);
      System.out.print(' ');
    }

    System.out.print("; ");

    for (int a : right) {
      System.out.print(a);
      System.out.print(' ');
    }

    System.out.print("; ");

      while (i < left.length || j < right.length) {
        if (i == left.length) {
            arr[i+j] = right[j];
            j++;
        } else if (j == right.length) {
            arr[i+j] = left[i];
            i++;
        } else if (left[i] <= right[j]) {
            arr[i+j] = left[i];
            i++;
        } else {
            arr[i+j] = right[j];
            count += left.length-i;
            j++;
        }
    }

      for (int a : arr) {
        System.out.print(a);
        System.out.print(' ');
      }

      System.out.println();
      return count;
  }

  static long invCount(int[] arr) {
      if (arr.length < 2)
          return 0;

      int m = (arr.length + 1) / 2;
      int left[] = Arrays.copyOfRange(arr, 0, m);
      int right[] = Arrays.copyOfRange(arr, m, arr.length);

      System.out.print("invCount: ");

      for (int a : left) {
        System.out.print(a);
        System.out.print(' ');
      }

      System.out.print("$ ");

      for (int a : right) {
        System.out.print(a);
        System.out.print(' ');
      }

      System.out.print("$ ");

      for (int a : arr) {
        System.out.print(a);
        System.out.print(' ');
      }

      System.out.println();

      return invCount(left) + invCount(right) + merge(arr, left, right);
  }
}
