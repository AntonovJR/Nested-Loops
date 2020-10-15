
import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();  //филм или Finish

        int countTotalTickets = 0;
        int countStandardTickets = 0;
        int countStudentTickets = 0;
        int countKidTickets = 0;

        while (!command.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            String type = scanner.nextLine();
            int busySeats = 0;
            while (!type.equals("End")) {
                switch (type) {
                    case "standard":
                        countStandardTickets++;
                        break;
                    case "student":
                        countStudentTickets++;
                        break;
                    case "kid":
                        countKidTickets++;
                        break;
                }
                countTotalTickets++;
                busySeats++;
                if(freeSeats == busySeats){
                    break;
                }
                type = scanner.nextLine();
            }


            double percent = busySeats * 1.0 / freeSeats * 100;
            System.out.printf("%s - %.2f%% full.%n", command, percent);

            command = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n", countTotalTickets);
        double percentStudent = countStudentTickets * 1.0 / countTotalTickets * 100;
        System.out.printf("%.2f%% student tickets.%n", percentStudent);


        double percentStandard = countStandardTickets * 1.0 / countTotalTickets * 100;
        System.out.printf("%.2f%% standard tickets.%n", percentStandard);


        double percentKid = countKidTickets * 1.0 / countTotalTickets * 100;
        System.out.printf("%.2f%% kids tickets.%n", percentKid);


    }
}