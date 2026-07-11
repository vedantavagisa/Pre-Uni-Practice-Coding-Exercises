/**
 * Purpose: Given an int n, recursively output all possible ways to roll n dice.
 * */

import java.util.Scanner;
public static void rollDice(int n, String pass) {
    if (n == 1) {
        System.out.println(pass+"1");
        System.out.println(pass+"2");
        System.out.println(pass+"3");
        System.out.println(pass+"4");
        System.out.println(pass+"5");
        System.out.println(pass+"6");
    } else {
        rollDice(n-1, pass+"1");
        rollDice(n-1, pass+"2");
        rollDice(n-1, pass+"3");
        rollDice(n-1, pass+"4");
        rollDice(n-1, pass+"5");
        rollDice(n-1, pass+"6");
    }
}

public static void main(String[] args) {
    System.out.println("Enter the number of dice");
    Scanner sc = new Scanner(System.in);
    rollDice(sc.nextInt(), "");
}
