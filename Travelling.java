import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!command.equals("End")){
            double budget = Double.parseDouble(scanner.nextLine());
            int sum = 0;
            while (sum < budget) {
                double saved = Double.parseDouble(scanner.nextLine());
                sum += saved;

            }
            if(sum >= budget){
                System.out.printf("Going to %s!%n", command);
            }

            command = scanner.nextLine();

        }


    }
}