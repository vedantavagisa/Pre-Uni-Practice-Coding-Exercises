/**
 * Purpose: find the sum of a contiguous subarray of k elements using a sliding window.
 * Note:
     * I didn't read "contiguous subarray" and misinterpreted the problem:
     * I thought the problem asked me to find the greatest sum of any k elements in the array.
     * I also thought that of coming up with a solution that did not use sorting, since sorting would make the problem trivial.
     * My solution (attempted, debugging needed) is below: */
//import java.util.ArrayList;
//public static int windowidk(int[] arr, int k) {
//    int temp = 0;
//    int sum = 0;
//    ArrayList<Integer> usedIndices = new ArrayList<>();
//    for (int i = 0; i < k; i++) {
//        for (int j = 0; j < arr.length; j++) {
//            if (i == 0 && arr[j] > sum) {
//                sum = arr[j];
//                usedIndices.add(j);   //for each next iteration, investigate only indices that are NOT part of this subarray to prevent just adding 5 three times and saying that the greatest sum is 15
//            } else if (i > 0){
//                if (!usedIndices.contains(j) && arr[j] > temp) {
//                    temp = arr[j];
//                    useddIndices.add(j);
//                }
//            }
//        } sum += temp;
//    } return sum;
//}


public static int slidingWindow(int[] arr, int k) {
    int sum = 0;
    int tempSum = 0;
    for (int i = 0; i <= arr.length - k; i++) {
        tempSum = 0;
        for (int j = 0; j < k; j++) {
            tempSum += arr[i+j];
        } if (tempSum > sum) {
            sum = tempSum;
        }
    } return sum;
}

public static void main(String[] args) {
    int[] arr = {2, 1, 5, 1, 3, 2};
    int k = 3;
    System.out.println(slidingWindow(arr, k));
}