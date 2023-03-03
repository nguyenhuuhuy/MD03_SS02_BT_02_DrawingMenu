import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Tam Giác Cân");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Tam Giác Cân");
                    int n = 5;
                    for (int i = 1; i <= n; i++) {
                        for (int j = n - i; j >= 1; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                case 2:
                    System.out.println("Tam Giác vuông");
                    for (int i = 1; i < 7; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*"+" ");
                        }
                        System.out.println();
                    }
                case 0:
                    System.exit(0);

                default:
                    System.out.println("No choice!");

            }
        }
    }
}