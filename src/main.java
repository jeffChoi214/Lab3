import java.util.Scanner;
import java.util.Formatter;

/*
 * Created by Jeff Choi on 2/1/2017
 * Lab 3
*/

public class main {
    public static void printHeader() {
        System.out.format("%15s%15s%15s", "Number", "Squared", "Cubed");
        System.out.println("");
        System.out.format("%15s%15s%15s", "=======", "=======", "=======");
        System.out.println("");
    }

    public static int calculateSquared(int input) {
        return input * input;
    }

    public static int calculateCubed(int input) {
        return input * input * input;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput;

        System.out.println("Learn your squares and cubes!");
        System.out.println("");

        while (true) {
            System.out.print("Enter an integer: ");
            userInput = sc.nextInt();
            sc.nextLine();

            printHeader();

            for (int i = 1; i <= userInput; i++) {
                System.out.format("%15d%15d%15d", i, calculateSquared(i), calculateCubed(i));
                System.out.println("");
            }
            
            System.out.println("");
   
            char toContinue;
            boolean goodAnswer = false;

            while (true) {
                System.out.print("Continue?(y/n): ");
                toContinue = sc.next().charAt(0);
                if (toContinue == 'n' || toContinue == 'N') {
                    break;
                }
                else if (toContinue == 'y' || toContinue == 'Y') {
                    break;
                }
                else {
                    System.out.println("Please enter y or n!");
                }
            }

            if (toContinue == 'n' || toContinue == 'N') {
                break;
            }
            else if (toContinue == 'y' || toContinue == 'Y') {

            }
        }
    }
}
