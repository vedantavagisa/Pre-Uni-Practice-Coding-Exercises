/**
 * Purpose: Given a sorted array, count the number of distinct pairs that sum to a given target value.
 * */

public static int countPairs(int[] arr, int target) {
    int count = 0;
    int left = 0;
    int right = arr.length - 1;
    int sum;
    int leftValue;
    int rightValue;
    while (left < right) {
        sum = arr[left] + arr[right];
        if (sum < target) {
            left++;
        } else if (sum > target) {
            right--;
        } else {
            leftValue = arr[left];
            rightValue = arr[right];
            while (leftValue == arr[left] && left < arr.length - 1) {
                left++;
            } while (rightValue == arr[right] && right > 0) {
                right--;
            } count++;
        }
    } return count;
}

public static void main(String[] args) {
    int[] arr = {1, 1, 3, 3};
    int target = 4;
    System.out.println("The number of distinct pairs that sum to the target is " + countPairs(arr, target));
}