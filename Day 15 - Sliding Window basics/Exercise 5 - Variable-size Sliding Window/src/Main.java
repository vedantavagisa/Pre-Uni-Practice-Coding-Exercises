/**
 * Purpose: Given an int[] arr consisting of positive ints and an int k, output the largest window whose sum is less than or equal to int k.
 * Note: the first time I saw this problem, I came up with a two-pointer algorithm to solve it. However, that had horrible time complexity and GPT explained how to make it sliding windows and therefore O(n)*/

public static int slidingWindow(int[] arr, int k) {
    int left = 0;
    int right = 0;
    int sum = 0;
    int answer = 0;
    int temporary = 0;
    while (left <= right && right < arr.length) {
        if (sum <= k) {
            sum += arr[right];
            right++;
            temporary++;
        } else {
            sum -= arr[left];
            left++;
            temporary--;
        } if (temporary > answer) {
            answer = temporary;
        }
    } return answer;
}

public static void main(String[] args) {
    int[] arr = {2, 1, 5, 1, 3, 2};
    int k = 7;
    System.out.println("The biggest subarray whose elements' sum is less than or equal to k is " + slidingWindow(arr, k));
}