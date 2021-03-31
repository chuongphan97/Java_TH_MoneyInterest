import java.util.Scanner;

public class MoneyInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money, interest_rate;
        int month;
        System.out.println("Input investment amount: ");
        money = scanner.nextDouble();

        System.out.println("Input number of months: ");
        month = scanner.nextInt();

        System.out.println("Input annual interest rate in percentage: ");
        interest_rate = scanner.nextDouble();

        double total_interest=0;
        for (int i=0;i < month;i++){
            total_interest += money * (interest_rate / 100) / 12 * month;
        }
        System.out.printf("Total interest: %f",total_interest);
    }
}
