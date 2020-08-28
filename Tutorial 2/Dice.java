import java.util.Random;

public class Dice {
    
    private int valueOfDice;

    public Dice(){}

    public void setDiceValue() {
        Random random = new Random();
        valueOfDice = random.nextInt(7);
    }

    public int getDiceValue() {
        return valueOfDice;
    }

    public void printDiceValue() {
        System.out.println("Current Value is: " + getDiceValue());
    }
}