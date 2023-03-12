import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = 10;
        int B = 5;
        double sumAB = A + B;
        double discountAmount = sumAB * 0.1;
        double discountedCost = sumAB - discountAmount;

        System.out.print("product A: ");
        A = scanner.nextInt();
        System.out.print("product B: ");
        B = scanner.nextInt();

        System.out.println("Discounted sum A+B:" + discountedCost);
        System.out.println("Discount:" + discountAmount);

    }
}