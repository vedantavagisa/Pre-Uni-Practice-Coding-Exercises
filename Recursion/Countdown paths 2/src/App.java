/**
 * Note: I'm reuploading this since IntelliJ malfunctioned
 * 
 * Purpose: Given an int n and the option to subtract 1 or 2, recursively output every possible way to reach 0.
     * Example output for countDown(3):
        3 2 1 0
        3 2 0
        3 1 0
*/
import java.util.Scanner;
public static void countDown(int n, String path) {
    if (n == 1) {
        IO.println(path + "1 0");
    } else if (n == 0) {
        IO.println(path + "0");
    } else {
        countDown(n-1, path + n + " ");
        countDown(n-2, path + n + " ");
    }
} public static void main(String[] args) {
    IO.println("Value of n?");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    countDown(n, "");
}
