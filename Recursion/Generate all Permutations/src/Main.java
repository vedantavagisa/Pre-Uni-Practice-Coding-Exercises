import java.util.Scanner;
public static void generatePermutations (String ogStr, String output) {
    if (ogStr.length()==1) {
        System.out.println(output + ogStr);
    } else {
        for (int i = 0; i < ogStr.length(); i++) {
            generatePermutations(ogStr.replaceFirst(String.valueOf(ogStr.charAt(i)), ""), output + ogStr.charAt(i));
        }
    }
} public static void main(String[] args) {
    System.out.println("Enter the String of which you would like to see all permutations.");
    Scanner sc = new Scanner(System.in);
    generatePermutations(sc.nextLine(), "");
}