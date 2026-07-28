/**
 * Purpose: Reverse an array IN PLACE using two pointers. I chose to do this recursively, the iterative version is also available.
 *
 * My original reverse method was not written with two pointers but rather with only one. It is shown below:

        public static void reverse(int[] arr, int i) {
        if (i >= arr.length - i - 1) {
        return;
        } int left = arr[i];
        int right = arr[arr.length - i - 1];
        arr[i] = right;
        arr[arr.length - i - 1] = left;
        reverse(arr, i+1);
        }

 * */

public static void reverse(int[] arr, int left, int right) {
    if (left >= right) {
        return;
    } int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;
    reverse(arr, left + 1, right - 1);
    return;
}

public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
//  reverse(arr, 0);
    reverse(arr, 0, arr.length - 1);
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}