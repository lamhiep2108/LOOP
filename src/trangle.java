import java.util.Scanner;

public class trangle {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                for (int i = 1; i < 4; i++) {
                    for (int j = 1; j < 8; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }break;
            case 2:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }break;
            case 3:
                for (int i = 6; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 4:
                for (int i = 0; i <= 8; i += 2) {
                    for (int j = 10; j > i; j -= 2) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k <= i; k++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;

        }
    }
       }

