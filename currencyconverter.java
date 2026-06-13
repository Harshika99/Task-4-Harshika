import java.util.Scanner;

public class currencyconverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double usd = 1.0;
        double inr = 83.0;
        double eur = 0.92;
        double gbp = 0.79;

        System.out.println("Currencies:");
        System.out.println("1. USD");
        System.out.println("2. INR");
        System.out.println("3. EUR");
        System.out.println("4. GBP");

        System.out.print("Select Source Currency: ");
        int source = sc.nextInt();

        System.out.print("Select Target Currency: ");
        int target = sc.nextInt();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        double sourceRate = 0;
        double targetRate = 0;

        switch(source) {
            case 1: sourceRate = usd; break;
            case 2: sourceRate = inr; break;
            case 3: sourceRate = eur; break;
            case 4: sourceRate = gbp; break;
        }

        switch(target) {
            case 1: targetRate = usd; break;
            case 2: targetRate = inr; break;
            case 3: targetRate = eur; break;
            case 4: targetRate = gbp; break;
        }

        double usdAmount = amount / sourceRate;
        double convertedAmount = usdAmount * targetRate;

        System.out.printf("Converted Amount: %.2f\n", convertedAmount);

        sc.close();
    }
}