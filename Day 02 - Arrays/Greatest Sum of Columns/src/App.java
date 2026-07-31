public class App {
    public static void main(String[] args) throws Exception {

        //because im not taking input, i need to actually create the array.
        System.out.println("Array:");
        System.out.println("{");
        double[][] arr = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Math.random();
                System.out.print(arr[i][j] + ", ");
            } System.out.println();
        } System.out.println("}");

        double sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum += arr[j][i];
            } System.out.println("Column " + i + " sum: " + sum);
            sum = 0;
        } 
    }
}