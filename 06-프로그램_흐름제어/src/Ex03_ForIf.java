import java.util.Scanner;

public class Ex03_ForIf {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.printf("숫자를 입력하세요: ");
        int max = reader.nextInt();
        reader.close();

        int oddSum = 0;
        int evenSum = 0;

        // Fix: Use semicolon in the for loop, not a comma
        for (int i = 1; i <= max; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d는 짝수\n", i);
                evenSum += i;
            } else {
                System.out.printf("%d는 홀수\n", i);
                oddSum += i;
            }
        }

        System.out.printf("1~%d까지 홀수들의 합: %d\n", max, oddSum);
        System.out.printf("1~%d까지 짝수들의 합: %d\n", max, evenSum);
    }
}
