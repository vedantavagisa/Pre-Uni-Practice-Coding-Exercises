/**
 * Purpose: Familiarize myself with binarySearch - this project does so in an iterative way. */
import java.util.Scanner;
public static int binarySearch(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;
    while (left != right) {
        int middle = (left + right)/2;
        if (arr[middle] == target) {
            return middle;
        } else if (arr[middle] > target) {
            right = middle - 1;
        } else if (arr[middle]< target) {
            left = middle + 1;
        } if (target > arr[right] || target < arr[left]) {
            return -1;
        }
    } return -1;
} public static void main(String[] args) {
    int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    Scanner sc = new Scanner(System.in);
    System.out.println("The array consists of the first 10 positive integers from 0 to 9 inclusive.");
    System.out.println("Please input the number whose index you would like to search.");
    System.out.println(binarySearch(arr, sc.nextInt()));
}
