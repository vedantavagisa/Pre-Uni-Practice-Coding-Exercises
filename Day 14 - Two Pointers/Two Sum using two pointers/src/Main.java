/**
 * Purpose: Solve the famous two-sum problem using two pointers.
 * Note: I love recursion so I decided to write the method recursively as follows:

     public static int[] twoSum(int[] arr, int target, int left, int right) {
         int[] ans = {-1, -1};
         if (left >= right) {
            return ans;
         } int sum = arr[left] + arr[right];
         if (sum > target) {
            return twoSum(arr, target, left, right - 1);
         } else if (sum < target) {
            return twoSum(arr, target, left + 1, right);
         } else {
             ans[0] = left;
             ans[1] = right;
             return ans;
         }
     }

 * */


public static int[] twoSum(int[] arr, int target) {
    int[] ans = {-1, -1};
    int left = 0;
    int right = arr.length - 1;
    int sum = arr[left] + arr[right];
    while (left < right) {
        if (sum > target) {
            right--;
        } else if (sum < target) {
            left++;
        } else {
            ans[0] = left;
            ans[1] = right;
            return ans;
        }
    } return ans;
}

public static void main(String[] args) {
    int[] arr = {1, 3, 4, 6, 8, 11, 15};    //change the array here
    int target = 10;     //change the target here
    int[] ans = twoSum(arr, target);
    if (ans[0]==-1) {
        System.out.println("There are no integers that sum up to " + target);
    } else {
        System.out.println("Indices " + ans[0] + " and " + ans[1] + " sum up to " + target);
    }
}