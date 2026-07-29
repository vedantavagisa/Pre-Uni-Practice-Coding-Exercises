/**
 * Purpose: find the sum of a contiguous subarray with k elements, but do this in a proper sliding window fashion, i.e. don't recompute sums.
 * */

public static double slidingWindow(int[] arr, double k) {
    double avg = Double.MIN_VALUE;
    double tempAvg = 0;
    for (int i = 0; i < k; i++) {
        tempAvg += (1/k)*arr[i];
    } avg = tempAvg;
    for (int i = 0; i < arr.length - k; i++) {
        tempAvg += arr[i + (int)k]*(1/k);
        tempAvg -= arr[i]*(1/k);
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