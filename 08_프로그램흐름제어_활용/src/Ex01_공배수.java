import java.util.Scanner; //스캐너는 사용자의 입력을 받기위한 클래스이다.
public class Ex01_공배수 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("x를 입력하세요(2~9):");
        int x = reader.nextInt();

        System.out.print("y를 입력하세요(2~9)");
        int y = reader.nextInt(); //사용자로부터 정수 값을 입력받아서 변수x에 저장한다.

        reader.close();
        
        int sum = 0;
        for(int i =1; i <=100; i++){ //i를 1부터 100까지 증가시키며 반복문을 실행한다.
            if(i%x==0 && i % y==0){ // 각각 x와 y로 나누어떨어지면 공배수입니다.
                System.out.printf("%3d는 공배수입니다.\n", i);
                //i값은 3자리로 나옴
                sum +=i; //i가 공배수라면 그값을 sum에 더한다.
            }
        }
        System.out.printf("i~100까지의 범위안에서 %d와 %d의 공배수는 총 합은 %d입니다.\n"
        , x ,y ,sum);
    }
}