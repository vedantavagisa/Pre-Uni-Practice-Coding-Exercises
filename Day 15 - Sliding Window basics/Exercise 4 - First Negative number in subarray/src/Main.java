/**
 * Purpose: Using a sliding window, output the first negative number in each window of size k
 * This was cool! I learned how queues worked.
 */


public static int[] slidingWindow(int[] arr, int k) {
    int[] negatives = new int[arr.length - k + 1];
    Queue<Integer> queue = new LinkedList<>();
    int leftBoundary, index, answerIndex;
    for (int j = 0; j < k; j++) {
        if (arr[j] < 0) {
            queue.add(j);
        }
    } if (queue.isEmpty()) {
        negatives[0] = 0;
    } else {
        negatives[0] = arr[queue.peek()];
    } for (int i = k; i < arr.length; i++) {
        answerIndex = i - k + 1;
        leftBoundary = i - k + 1;
        if (arr[i] < 0) {
            queue.add(i);
        } if (queue.isEmpty()) {
            negatives[answerIndex] = 0;
        } else {
            index = queue.peek();
            if (index < leftBoundary) {
                queue.remove();
                if (queue.isEmpty()) {
                    negatives[answerIndex] = 0;
                } else {
                    negatives[answerIndex] = arr[queue.peek()];
                }
            } else {
                negatives[answerIndex] = arr[queue.peek()];
            }
        }
    } return negatives;
}

public static void main(String[] args) {
    int[] arr = {12, -1, -7, 8, -15, 30, 16, 28}; //12, -1, -7, 8, -15, 30, 16, 28
    int k = 3;
    int[] negatives = slidingWindow(arr, k);
    for (int i = 0; i < negatives.length; i++) {
        System.out.println(negatives[i]);
    }
}