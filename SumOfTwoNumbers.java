
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        int validCombinations = 0;
        int total = 0;
        for (int i = firstNum; i <= secondNum; i++) {
            for (int j = firstNum; j <= secondNum; j++) {
                validCombinations++;
                total = i + j;
                if (total == magicNum) {
                    System.out.printf("Combination N:%d ", validCombinations);
                    System.out.printf("(%d + %d = %d)", i, j, magicNum);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d", validCombinations, magicNum);
    }
}