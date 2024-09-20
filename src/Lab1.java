import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double purchasePrice;
        double salesTax;
        final double TAX_RATE= 0.05;

        System.out.print("Enter the price of the purchase: $");
        purchasePrice= input.nextDouble();

        salesTax= purchasePrice * TAX_RATE;

        System.out.printf("The price of your purchase is $%.2f\n", purchasePrice);
        System.out.printf("The total sales tax is $%.2f\n", salesTax);
    }
}
