public class for문 {
    public static void main(String[] args) {
        
        // for문의 무한루프
        for (int i = 0; i < 5; i++) {  // 5번만 반복하도록 수정
            System.out.println("for문의 무한루프");
        }
        
        // while문의 무한루프
        int count = 0;
        while (count < 5) {  // 5번만 반복하도록 수정
            System.out.println("while문의 무한루프");
            count++;  // 반복 횟수 증가
        }
        
        // 1부터 10까지의 합을 구하는 코드
        int sum = 0; // 합계를 구할 때 0으로 초기화
        for (int i = 1; i <= 10; i++) {
            sum += i;  // i를 sum에 더함
        }
        System.out.println("1부터 10까지의 합: " + sum);
    }
}
