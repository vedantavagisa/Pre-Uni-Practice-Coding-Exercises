/**
 * Purpose: Familiarize myself with binarySearch - this project does so in an iterative way. */

public static int binarySearch(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;
    while (left != right) {
        int middle = (left + right)/2;
        if (arr[middle] == target) {
            return middle;
        } else if (arr[middle] > target) {
            
        }
    } return -1;
}

public static void main(String[] args) {
    IO.println(String.format("Hello and welcome!"));
}
