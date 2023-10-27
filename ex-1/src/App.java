import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner myscanner = new Scanner(System.in);
        while (true) {
            int command = -1;
            System.out.println("1. Sum array");
            System.out.println("2. Reverse array");
            System.out.println("3. Find min max array");
            System.out.println("4. Check if prime");
            System.out.println("5. Sum matrix");
            System.out.println("6. Draw triangle");
            System.out.println("0. Exit");
            System.out.print("Input command: ");
            command = myscanner.nextInt();
            switch (command) {
                case 0:
                    myscanner.close();
                    System.exit(0);
                    break;
                case 1:
                    Exercises.sumArray(myscanner);
                    break;
                case 2:
                    Exercises.reverseArray(myscanner);
                    break;
                case 3:
                    Exercises.findMinMaxArray(myscanner);
                    break;
                case 4:
                    Exercises.isPrime(myscanner);
                    break;
                case 5:
                    Exercises.sumMatrix(myscanner);
                    break;
                case 6:
                    Exercises.drawTriangle(myscanner);
                    break;
                default:
                    System.out.println("No such command!");
                    break;
            }
        }

    }
}
