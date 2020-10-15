import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int sumprime = 0;
        int sumnoprime = 0;

        while (!input.equals("stop")) {
            boolean isprime = true;
            int n = Integer.parseInt(input);
            if (n < 0) {
                n = 0;
                System.out.println("Number is negative.");

            } else if (n == 1) {
                isprime = false;
            } else {
                for (int count = 2; count <= n; count++) {
                    if (n % count == 0 && count != n) {
                        isprime = false;

                        break;
                    }
                }

            }
            if (isprime) {
                sumprime += n;
            } else if (!isprime) {
                sumnoprime += n;
            }
            input = scanner.nextLine();
        }
        if (input.equals("stop")) {
            System.out.printf("Sum of all prime numbers is: %d",sumprime);
            System.out.printf("%nSum of all non prime numbers is: %d",sumnoprime);
        }
    }
}

