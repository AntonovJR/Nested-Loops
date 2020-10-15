import java.util.Scanner;

public class EqualSumsEvenOddPosition2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        for (int i = firstNum; i <= secondNum; i++) {
            int evenSum = 0;
            int oddSum = 0;
            int copyNumber = i;
            String num = copyNumber + "";

            for (int j = 0; j <num.length() ; j++) {
                char currentDigit = num.charAt(j);
                int digit = Integer.parseInt(currentDigit+ "");
                if (j%2==0){
                    oddSum+=digit;
                }else{
                    evenSum+=digit;
                }


            }

            if (evenSum == oddSum) {
                System.out.printf("%d ",i);
            }
        }
    }
}
