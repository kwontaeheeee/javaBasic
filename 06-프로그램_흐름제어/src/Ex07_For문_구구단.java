import java.util.Scanner;

public class Ex07_For문_구구단 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("숫자를 입력하세요(2~9):");
        int x = reader.nextInt();
        reader.close();

        for(int y =1; y <10; y++){
            System.out.printf("$d x %d = %d\n",x,y,x*y);
        }
 }
}
