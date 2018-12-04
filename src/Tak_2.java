import java.util.Scanner;

public class Tak_2 {
    public static void main(String[] args) {
        int factorial;
        boolean legalInput;
        int result;


        do {
            System.out.println("Enter the value of factorial n!");
            Scanner input = new Scanner(System.in);
            factorial = input.nextInt();
            legalInput = (factorial >= 1);
        } while (!legalInput);


        int n = 1;
        while (factorial > getFactorial(n)) {
            n++;
        }
        result = getFactorial(n);

        if (result > factorial){
            System.out.println("Entered value is not factorial of an integer.");
        }
        if (result == factorial){
            System.out.println(factorial + " is the factorial of " + n);
        }
    }


    public static int getFactorial(int n) {
        int factorial = 1;

        for (int i = 1; i < n; i++) {
            factorial = factorial * (i + 1);
        }
        return factorial;
    }
}
