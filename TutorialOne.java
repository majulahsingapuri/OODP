import java.util.Scanner;

public class TutorialOne {
    public static void main(String[] args){

        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of integers to be sorted");
        n = scanner.nextInt();

        int[] numberArray = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the integer value for element no.%d: ", i+1);
            numberArray[i] = scanner.nextInt();
        }

        BubbleSort(numberArray, n);

        System.out.print("The final sorted Array is: ");
        for (int i = 0; i < numberArray.length; i++) {
            System.out.printf("%d", numberArray[i]);
        }
        System.out.print("\n");
        scanner.close();
    }

    public static void BubbleSort(int[] arr, int n) {
        
        int t;

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (arr[j] > arr[j+1]) {
                    t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
    }
}