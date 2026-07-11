/**
 * Purpose: Given a String, check if it's palindromic by recursion.
 */

import java.util.Scanner;
public class App {
    
    public static boolean check(String str, int index) {
        if (str.charAt(index)==str.charAt(str.length()-index-1) && (index < str.length()/2)) {
            return check(str, index+1);
        } if (index >= str.length()/2) {
            return true;
        } return false;
    }
    
    public static void main(String[] args) {
        System.out.println("Please enter a String.");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (check(str, 0)) {
            System.out.println("This string is palindromic.");
        } else {
            System.out.println("This string is not palindromic.");
        }
    }
}
