/**
 * Purpose: Reverse an array IN PLACE using two pointers. This version does it iteratively.
 * */

public static void reverse(int[] arr) {
    int left = 0;
    int right = arr.length - 1;
    int temp;
    while (left < right) {
        temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    } return;
    /** Here is another way to do this but with a for loop (it technically only uses one pointer, though)
     * for (int i = 0; i < arr.length/2; i++) {
        left = arr[i];
        right = arr[arr.length - i - 1];
        arr[i] = right;
        arr[arr.length - i - 1] = left;
    }*/
}

public static void main(String[] args) {
    int[] arr = {};     //insert array here
    reverse(arr);
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}