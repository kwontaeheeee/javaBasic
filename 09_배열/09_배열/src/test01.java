//정수 한개를 입력받아서 그수가 3의배수인지 판단해보자

import java.util.Scanner;
public class test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요");
        int num = sc.nextInt();



        if (num % 3 == 0) {
            System.out.println("입력하신 정수는 3의 배수입니다.");
        } else {
            System.out.println("입력하신 정수는 3의 배수가 아닙니다.");
        }
        
        
    }
}

