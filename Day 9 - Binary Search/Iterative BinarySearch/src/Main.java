/**
 * Purpose: Familiarize myself with binarySearch - this project does so in an iterative way. */
import java.util.Scanner;
public static int binarySearch(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;
    while (left <= right) { //I initially had left==right, but GPT suggested that I replace it with what I have right now
        int middle = (left + right)/2;  //GPT suggested that I use int middle = left + (right - left) / 2; for large ints to avoid overflowing
        if (arr[middle] == target) {
            return middle;
        } else if (arr[middle] > target) {
            right = middle - 1;
        } else if (arr[middle]< target) {
            left = middle + 1;
        } /* What I had initially when I coded it was this:
        if (target > arr[right] || target < arr[left]) {
            return -1;
        }* This is unnecessary because the left<= right condition already handles anything that would lead to that case
*/  } return -1;
} public static void main(String[] args) {
    int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    Scanner sc = new Scanner(System.in);
    System.out.println("The array consists of the first 10 positive integers from 0 to 9 inclusive.");
    System.out.println("Please input the number whose index you would like to search.");
    System.out.println(binarySearch(arr, sc.nextInt()));
}
