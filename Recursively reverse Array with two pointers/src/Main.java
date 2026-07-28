/**
 * Purpose: Reverse an array IN PLACE using two pointers. I chose to do this recursively, the iterative version is also available.
 * */

public static void reverse(int[] arr, int i) {
    if (i >= arr.length - i - 1) {
        return;
    } int left = arr[i];
    int right = arr[arr.length - i - 1];
    arr[i] = right;
    arr[arr.length - i - 1] = left;
    reverse(arr, i+1);
}

public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    reverse(arr, 0);
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}