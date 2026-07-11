/**
 * Purpose: Recursively implement BinarySearch
 * */
import java.util.Scanner;
public static int binarySearch(int[] arr, int left, int right, int target) {
    int middle = left + (right - left)/2;
    if (left <= right) {
        if (arr[middle]==target) {
            return middle;
        } else if (target > arr[middle]) {
            return binarySearch(arr, middle + 1, right, target);
        } else if (target < arr[middle]) {
            return binarySearch(arr, left, middle - 1, target);
        }
    } return -1;
}

/// ChatGPT actually recommended this, which I find sleek and beautiful:
/**public static int binarySearch(int[] arr, int target) {
    return binarySearch(arr, 0, arr.length - 1, target);
}

private static int binarySearch(int[] arr, int left, int right, int target) {
    if (left > right) {
        return -1;
    }

    int middle = left + (right - left) / 2;

    if (arr[middle] == target) {
        return middle;
    } else if (target < arr[middle]) {
        return binarySearch(arr, left, middle - 1, target);
    } else {
        return binarySearch(arr, middle + 1, right, target);
    }
}*/

public static void main(String[] args) {
    int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    Scanner sc = new Scanner(System.in);
    System.out.println("The array consists of the first 10 positive integers from 0 to 9 inclusive.");
    System.out.println("Please input the number whose index you would like to search.");
    System.out.println("The number is located at index " + binarySearch(arr, 0, arr.length - 1, sc.nextInt()));
}
