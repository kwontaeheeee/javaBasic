import java.util.Scanner;

public class Ex04_While문_반복범위 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("숫자를 입력하세요(2~9):");
        int x = reader.nextInt();
        reader.close();

        int y = 1;
        while (y<10) {
            System.out.printf("%d x %d = %d\n", x, y, x*y);
            y++;
        }
    }
}