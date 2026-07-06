/**
 * Purpose: Output numbers recursively. The method should be void.
*/

import java.util.Scanner;
public class App {

    public static void printNum(int n) {
        if (n > 0) {
            printNum(n-1);
            System.out.println(n);
            //printNum(n-1);        //uncomment this part if you want them in descending order
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of integers you would like to output.");
        printNum(sc.nextInt());
    }
}
