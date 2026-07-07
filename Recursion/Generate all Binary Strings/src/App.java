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
 * This is a work in progress
*/

import java.util.Scanner;
public class App {

    public static void binaryString(int n, String pass) {
        if (n == 1) {
            IO.println(pass+"0");
            IO.println(pass+"1");
        } else {
            binaryString(n-1, pass + "0");
            binaryString(n-1, pass + "1");
        }
        
    }

    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        binaryString(sc.nextInt(), "");
    }
}
