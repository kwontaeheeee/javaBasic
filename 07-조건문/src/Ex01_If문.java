import java.util.Scanner;

public class Ex01_If문 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.printf("점수를 입력하세요:");
        int score = reader.nextInt();
        reader.close();

        if (score >= 60) {
            System.out.println("합격입니다");
        }
        System.out.println("시험 끝");
    }
}
