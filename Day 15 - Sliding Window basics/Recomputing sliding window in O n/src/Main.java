/**
 * Purpose: find the sum of a contiguous subarray with k elements, but do this in a proper sliding window fashion, i.e. don't recompute sums.
 * */

public static int slidingWindow(int[] arr, int k) {
    int sum = 0;
    int tempSum = 0;
    for (int i = 0; i < k; i++) {
        tempSum += arr[i];
    } sum = tempSum;
    for (int i = 0; i < arr.length - k; i++) {
        tempSum += arr[i + k];
        tempSum -= arr[i];
        if (tempSum > sum) {
            sum = tempSum;
        }
    } return sum;
}

public static void main(String[] args) {
    int[] arr = {2, 1, 5, 1, 3, 2};
    int k = 3;
    System.out.println(slidingWindow(arr, k));
}