public static int partition(int[] arr, int left, int right) {
    int wall = left;
    int pivotIndex = right;
    int pivot = arr[pivotIndex];
    int temporary;
    for (int i = left; i < right; i++) {
        if (arr[i]<pivot) {
            temporary = arr[i];
            arr[i]=arr[wall];
            arr[wall]=temporary;
            wall++;
        } if (i == right-1) {
            temporary = arr[wall];
            arr[wall] = pivot;
            arr[pivotIndex] = temporary;
        }
    }
    return wall;
    
} public static int[] quickSort(int[] arr, int left, int right) {
    int pivotIndex;
    if (left >= right) {
        return arr;
    } else {
        pivotIndex = partition(arr, left, right);
        quickSort(arr, left, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, right);
    } return arr;
}

public static void main(String[] args) {
    int[] arr = {7, 2, 9, 4, 5};
    quickSort(arr, 0, arr.length - 1);
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}