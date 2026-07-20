/**
 * Purpose: Derive the mergeSort algorithm from first principles.
 * Note: Preparing this project consisted of many small "thinking" exercises and roadblocks. Check the README file for more information.
 * */

//public static int[] mergeSort(int[] left, int[] right) {
//    if (left.length > 1)  {
//        left = mergeSort(Arrays.copyOfRange(left, 0, left.length/2), Arrays.copyOfRange(left, left.length/2, left.length));
//    } if (right.length > 1) {
//       right = mergeSort(Arrays.copyOfRange(right, 0, right.length/2), Arrays.copyOfRange(right, right.length/2, right.length));
//    } return merge(left, right);
//}
public static int[] mergeSort(int[] arr) {
    int[] left;
    int[] right;
    if (arr.length > 1) {
        return merge(mergeSort(Arrays.copyOfRange(arr, 0, arr.length / 2)), mergeSort(Arrays.copyOfRange(arr, arr.length / 2, arr.length)));
    } else {
        return arr;
    }
}

private static int[] merge(int[] left, int[] right) {
    int leftPointer = 0;
    int rightPointer = 0;
    int mergedPointer = 0;
    int[] merged = new int[left.length + right.length];
    Boolean proceed = true;
    while (proceed) {
        if (left[leftPointer]<right[rightPointer]) {
            merged[mergedPointer] = left[leftPointer];
            mergedPointer++;
            leftPointer++;
        } else {
            merged[mergedPointer]=right[rightPointer];
            mergedPointer++;
            rightPointer++;
        } proceed = leftPointer < left.length && rightPointer < right.length;
    } if (rightPointer <= right.length - 1) {
        for (int i = mergedPointer; i < merged.length; i++) {
            merged[i] = right[rightPointer];
            rightPointer++;
        }
    } else if (leftPointer <= left.length - 1) {
        for (int i = mergedPointer; i < merged.length; i++) {
            merged[i] = left[leftPointer];
            leftPointer++;
        }
    } return merged;
}

public static void main(String[] args) {
    //Put in some random array of unsorted integers below
    int[] arr = {1, 5 ,2, 7, 35, 8, 32, 4};
//    int[] merged = mergeSort(Arrays.copyOfRange(arr, 0, arr.length/2), Arrays.copyOfRange(arr, arr.length/2, arr.length));
    int[] merged = mergeSort(arr);
    for (int i = 0; i < merged.length; i++) {
        System.out.println(merged[i]);
    }

}