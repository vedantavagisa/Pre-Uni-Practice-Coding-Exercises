/**
 * Purpose: Given an int n, return all binary Strings of length.
 * Example: if given n = 3, output:
     * 000
     * 001
     * 010
     * 011
     * 100
     * 101
     * 110
     * 111
 * This is a work in progress.
 */

import java.util.Scanner;
public class App {

    public static void binaryString(int n) {
        if (n == 1) {
            System.out.println(0);
            System.out.println(1);
        } else {
            System.out.print(0);
            binaryString(n-1);
            System.out.print(1);
            binaryString(n-1);  //this is what Matthew recommended but it doesn't work. The pseudocode that he suggested, however, seems to work.
        }
        
    }

    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        binaryString(sc.nextInt());
    }
}
