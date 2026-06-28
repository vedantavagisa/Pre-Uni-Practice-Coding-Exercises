/**
 * Purpose: Given an int array and an int, count the number of times that int shows up in the array
 */

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class App {

    public static int count(int[] arr, int index, int num, int occurrences) {
        if (arr[index] == num) {
            occurrences++;
        } if (index < arr.length - 1) {
            return count(arr, index + 1, num, occurrences);
        } else {
            return occurrences;
        }
    }

    public static void main(String[] args) {
        
        int[] arr = new int[10];
        System.out.print("The Array is [");
        for (int i = 0; i < 10; i++) {
            if (i != 0) {
                System.out.print(", ");
            } arr[i] = ThreadLocalRandom.current().nextInt(1, 4);
            System.out.print(arr[i]);
        } System.out.println("]");

        System.out.println("Please enter a number from 1 to 3 whose occurences you would like to count.");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        //ok now all of that is done
        System.out.println("The number of occurrences is " + count(arr, 0, target, 0));


    }
}
