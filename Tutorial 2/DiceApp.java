import java.util.Scanner;

public class DiceApp {
    
    public static void main(String[] args) {
        
        int total = 0;
        Scanner sc = new Scanner(System.in);
        Dice die = new Dice();

        System.out.println("Press Enter to roll the first dice");
        sc.nextLine();

        die.setDiceValue();
        die.printDiceValue();
        total += die.getDiceValue();

        System.out.println("Press Enter to roll the Second dice");
        sc.nextLine();

        die.setDiceValue();
        die.printDiceValue();
        total += die.getDiceValue();

        System.out.println("Your total is: " + total);
        sc.close();
    }
}