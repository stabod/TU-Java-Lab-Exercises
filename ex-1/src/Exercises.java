import java.util.Scanner;

public class Exercises {
    
    //1
    public static void sumArray(Scanner myscanner) {
        
        int[] arr = new int[5];
        int sum = 0;
        int even = 0;
        int odd = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Input element at index #" + i + " ");
            arr[i] = myscanner.nextInt();
        }

        for(int e : arr) {
            sum += e;
            if (e % 2 == 0) { even += e; }
            else { odd += e; }
        }

        System.out.println("Sum: " + sum + " Even: " + even + " Odd: " + odd);
    }

    //2
    public static void reverseArray(Scanner myscanner) {

        int[] arr = new int[10];
        int tmp = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Input element at index #" + i + " ");
            arr[i] = myscanner.nextInt();
        }

        for(int e : arr) {
            System.out.print(e + " ");
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            tmp = arr[9-i];
            arr[9-i] = arr[i];
            arr[i] = tmp;
        }

        for(int e : arr) {
            System.out.print(e + " ");
        }
    }

    //3
    public static void findMinMaxArray(Scanner myscanner) {

        int[] arr = new int[5];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            System.out.println("Input element at index #" + i + " ");
            arr[i] = myscanner.nextInt();
            if (max < arr[i]) { max = arr[i]; }
            if (min > arr[i]) { min = arr[i]; }
        }
        System.out.println("Max: " + max + " Min: " + min);

    }

    //4
    public static void isPrime(Scanner myscanner) {

        System.out.println("Enter number: ");
        int num = myscanner.nextInt();
        boolean isprime = true;

        for (int i = 2; i < num/2; i++) {
            if (num % i == 0) { isprime = false; }
        }
        if (num == 2) { isprime = true; }

        if (isprime) { System.out.println(num + " is prime."); }
        else { System.out.println(num + " is not prime."); }

    }

    //5
    public static void sumMatrix(Scanner myscanner) {
        int[][] arr = new int[3][3];
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter element at index[" + i + "][" + j + "]: ");
                arr[i][j] = myscanner.nextInt();
                if (i == j) { sum += arr[i][j]; } 
                if (i + j == 2) { sum += arr[i][j]; }
            } 
        }

        System.out.println("Sum of diagonals: " + sum);
        System.out.println("Sum of diagonals without repeat: " + (sum - arr[1][1]));
        
    }

    //6
    public static void drawTriangle(Scanner myscanner) {

        System.out.println("Enter height of triangle: ");
        int height = myscanner.nextInt();
        for (int i = 1; i < height+1; i++) {
            System.out.println("* ".repeat(i));
        }
    }


}
