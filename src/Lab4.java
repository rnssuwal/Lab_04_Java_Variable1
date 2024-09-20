import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number = scanner.nextInt();
        int modResult = number % 2;

        if (modResult == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
        scanner.close();
    }
}
