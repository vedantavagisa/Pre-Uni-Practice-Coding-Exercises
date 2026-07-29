/**
 * Purpose: find the sum of a contiguous subarray with k elements, but do this in a proper sliding window fashion, i.e. don't recompute sums.
 * */

public static double slidingWindow(int[] arr, int k) {
    double avg = Double.MIN_VALUE;
    double tempAvg = 0;
    double sum = 0;
    for (int i = 0; i < k; i++) {
        sum += arr[i];
    } tempAvg = sum/k;
    avg = tempAvg;
    for (int i = 0; i < arr.length - k; i++) {
        sum = sum + arr[i + k] - arr[i];
        tempAvg = sum/k;
        if (tempAvg > avg) {
            avg = tempAvg;
        }
    } return avg;
}

public static void main(String[] args) {
    int[] arr = {1 , 12, -5, -6, 50, 3};
    int k = 4;
    System.out.println(slidingWindow(arr, k));
}