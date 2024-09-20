import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double springCost, summerCost, fallCost, winterCost, totalCost;

        System.out.print("Enter the maintenance cost for the Spring Season:$");
        springCost = input.nextDouble();
        System.out.print("Enter the maintenance cost for the Summer Season:$");
        summerCost = input.nextDouble();
        System.out.print("Enter the maintenance cost for the Fall Season:$");
        fallCost = input.nextDouble();
        System.out.print("Enter the maintenance cost for thr Winter Season:$");
        winterCost = input.nextDouble();

        totalCost = springCost + summerCost + fallCost + winterCost;

        System.out.println("\nYour Home Maintenance Costs are as follows:");
        System.out.println("Spring: $" + springCost);
        System.out.println("Summer: $" + summerCost);
        System.out.println("Fall: $" + fallCost);
        System.out.println("Winter: $" + winterCost);
        System.out.println("\nYour Total Yearly Maintenance Cost is: $" + totalCost);

    }
}