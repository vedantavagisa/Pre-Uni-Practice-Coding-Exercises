/**
 * Purpose: Given an integer, return the sum of its digits using recursion and without loops nor converting the number into a string 
 */

import java.util.Scanner;
public class App {

    private static int addDigits(int num, int sum) {
        int lastDigit = num%10;
        sum += lastDigit;               
        num = (num - lastDigit)/10;    
        if (num != 0) {
            return addDigits(num, sum);     //lol the first time i wrote this code i forgot that i needed "return" to get the function to work another time
        } return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer.");     //i dont really care about try/catch

        System.out.println("The sum of its digits is " + addDigits(Integer.parseInt(sc.nextLine()), 0));
    }
}
