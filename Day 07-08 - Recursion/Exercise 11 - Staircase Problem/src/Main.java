/**
 * Purpose: Given an int n representing the number of stairs in a staircase and given the option to jump either 1 or 2 stairs, output all possible ways to ascend the staircase
 * */
import java.util.Scanner;
public static void stairCase(int n, String pass) {
    if (n > 1) {
        stairCase(n-1, pass+"1");
        stairCase(n-2, pass+"2");
    } else if (n == 1) {
        System.out.println(pass+"1");
    } else if (n == 0) {
        System.out.println(pass);
    }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of stairs");
    stairCase(sc.nextInt(), "");
}
