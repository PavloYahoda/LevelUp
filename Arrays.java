import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        boolean isContinue = true;
        while (isContinue) {
            System.out.println("Select part of homework:\n" +
                    "1 - Fill array from 0 to 99\n" +
                    "2 - Fill array from 100 to 0\n" +
                    "3 - Fill step array\n" +
                    "Q - for exit\n");

            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();

            switch (userInput) {
                case "1":
                    part1();
                    break;
                case "2":
                    part2();
                    break;
                case "3":
                    part3();
                    break;
                case "Q":
                case "q":
                    isContinue = false;
                    System.out.println("By!");
                    break;
                default:
                    System.out.println("Please, make the right selection.");
            }
        }
    }
    public static void part1(){
        int[] array1 = new int[100];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = i;
        }
        System.out.println(java.util.Arrays.toString(array1));
        System.out.println("\nNext part?");
    }
    public static void part2(){
        int[] array2 = new int[100];

        for (int j = array2.length; j > 0; j--) {
            array2[array2.length - j] = j;
        }
        System.out.println(java.util.Arrays.toString(array2));
        System.out.println("\nNext part?");
    }
    public static void part3(){
        int[][] array3 = new int[5][];
        int c = 1;

        for (int i = 0; i < array3.length; i++) {
            array3[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                array3[i][j] = c++;
            }
            System.out.println(java.util.Arrays.toString(array3[i]));
            System.out.println("\nNext part?");
        }
    }
}
