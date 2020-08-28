import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int choice;
        Circle circle = new Circle(0);;

        System.out.println("Circle computation\n 1. Create a new circle\n 2. Print Area\n 3. Print Circumference\n 4. Quit");
        
        while (true) {

            System.out.println("Choose option (1-3)");;
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter radius to compute the area and circumference");
                circle.setRadius(sc.nextInt());
                System.out.println("A new circle is created");
            } else if (choice == 2) {
                System.out.println("Area of circle");
                System.out.println("Radius: " + circle.getRadius());
                circle.printArea();;
            } else if (choice == 3) {
                System.out.println("Circumference of circle");
                System.out.println("Radius: " + circle.getRadius());
                circle.printCircumference();
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid Choice select again");
            }
        }
        sc.close();
        System.out.println("Thank you");
    }
}