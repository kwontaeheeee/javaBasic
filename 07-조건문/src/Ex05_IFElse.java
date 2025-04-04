import java.util.Scanner;

public class Ex05_IFElse {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.printf("점수를 입력하세요:");
        int score = reader.nextInt();
        reader.close();
        System.out.println("시험시작");

        if(score >= 60){
            System.out.println("합격입니다");
        } else{
            System.out.println("불합격입니다");
        }
    }
}
