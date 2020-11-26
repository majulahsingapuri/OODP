import java.util.Scanner;

public class VendingMachine {

    Scanner sc = new Scanner(System.in);
    
    public VendingMachine() {}

    public double selectDrink() {

        int choice;

        System.out.println("Please enter selection:");
        choice = sc.nextInt();
        
        if (choice == 1) {
            return 3.0;
        } else if (choice == 2) {
            return 1.0;
        } else if (choice ==  3) {
            return 2.0;
        } else {
            return 0.0;
        }
    }

    public double insertCoins(double drinkCost) {

        double amount = 0;
        String choice;

        System.out.println("Please insert coins:");
        System.out.println("Enter Q for 10 cents");
        System.out.println("Enter T for 20 cents");
        System.out.println("Enter F for 50 cents");
        System.out.println("Enter N for 1 dollar");

        while (amount < drinkCost){
            choice = sc.next();
            if (choice.equals("Q")) {
                amount += 0.1;
            } else if (choice.equals("T")) {
                amount += 0.2;
            } else if (choice.equals("F")) {
                amount += 0.5;
            } else if (choice.equals("N")) {
                amount += 1.0;
            } else {
                System.out.println("Error input");
            }
            System.out.printf("Coins inserted: %.2f\n", amount);
        }
        return amount;
    }

    public void checkChange(double amount, double drinkCost) {
        System.out.printf("Change: $ %.2f\n", amount - drinkCost);
    }

    public void printReceipt() {
        System.out.println("Please collect your drink\nThank You!");
        sc.close();
    }
}
