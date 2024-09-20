public class Lab3 {
    public static void main(String[] args) {
        double initialBalance = 5000.00;
        double annualInterestRate = 17.0;
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        double firstMonthInterest = initialBalance * monthlyInterestRate;
        double firstMonthBalance = initialBalance + firstMonthInterest;
        double secondMonthInterest = firstMonthBalance * monthlyInterestRate;
        double secondMonthBalance = firstMonthBalance + secondMonthInterest;

        System.out.printf("Initial Balance: $%.2f%n", initialBalance);
        System.out.printf("Interest after 1 month: $%.2f%n", firstMonthInterest);
        System.out.printf("Balance after 1 month: $%.2f%n", firstMonthBalance);
        System.out.printf("Interest after 2 months: $%.2f%n", secondMonthInterest);
        System.out.printf("Balance after 2 months: $%.2f%n", secondMonthBalance);
    }
}