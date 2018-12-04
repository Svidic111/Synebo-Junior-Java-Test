import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        int n;
        boolean legalInput;
        int matchesNumber = 0;

        do {
            System.out.println("Enter the number of squares N:");
            Scanner inputAction = new Scanner(System.in);
            n = inputAction.nextInt();
            legalInput = (n >= 1);
        } while (!legalInput);

        int a = (int) Math.sqrt(n); // defining size of the largest possible square that consists of less than N elementary squares
        int b = n - a * a; // defining number of elementary squares left to place outside the a-sized square
        double k = (double) b / a;
        int c = (int) Math.ceil(k);

        if (n == a * a) matchesNumber = 2 * a * (a + 1);

        if (k > 0 & k < 1) matchesNumber = 2 * a * (a + 1) + 2 * b + 1;

        if (c >= 1 & c < 4) matchesNumber = 2 * a * (a + 1) + 2 * b + c;


        System.out.println("The minimum number of matches to make " + n + " squares with one-match side equals " + matchesNumber);
    }
}
