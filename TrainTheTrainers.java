import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfJudges = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        double finalScore = 0;
        int counter = 0;
        while (!input.equals("Finish")) {
            double results = 0;
            double average = 0;
            for (int currentJudge = 0; currentJudge < numberOfJudges; currentJudge++) {
                double currentMark = Double.parseDouble(scanner.nextLine());
                results += currentMark;

            }
            counter++;
            average = results / numberOfJudges;

            finalScore += average;
            System.out.printf("%n%s - %.2f.", input, average);
            input = scanner.nextLine();


        }

        System.out.printf("%nStudent's final assessment is %.2f.", finalScore/counter);
    }

}
