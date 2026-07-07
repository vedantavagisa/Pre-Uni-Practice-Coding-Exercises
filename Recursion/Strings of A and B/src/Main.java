/**
 * Purpose: Given an int n, return all binary Strings of length.
 * Example: if given n = 3, output:
     AAA
     AAB
     ABA
     ABB
     BAA
     BAB
     BBA
     BBB
 */

import java.util.Scanner;
public class Main {

    public static void binaryString(int n, String pass) {
        if (n == 1) {
            IO.println(pass+"A");
            IO.println(pass+"B");
        } else {
            binaryString(n-1, pass + "A");
            binaryString(n-1, pass + "B");
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        binaryString(sc.nextInt(), "");
    }
}
