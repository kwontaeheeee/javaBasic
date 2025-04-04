public class Ex10_For문_증감식설정 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i < 100; i+= 10){
            sum += i;
            System.out.printf("i=%d, sum=%d\n", i ,sum);
        }
    }
}


//자바에서 스캐너를 쓰는이유
//Java 코드에서 Scanner를 사용하는 이유는 사용자로부터 입력을 받을 때 사용하기 위해서입니다. 
//Scanner는 키보드나 파일 등에서 데이터를 읽어올 수 있는 유용한 클래스입니다. 주로 콘솔에서 사용자로부터 데이터를 입력받을 때 사용되죠.
//예를 들어, 사용자에게 숫자나 문자열을 입력받고 그 값을 프로그램에서 처리하려면 Scanner 클래스를 사용합니다. 
//Scanner는 입력값을 쉽게 읽을 수 있도록 여러 메서드를 제공합니다. 예를 들어 nextInt(), nextLine(), nextDouble() 
//등을 사용해서 각각 정수, 문자열, 실수 등을 입력받을 수 있습니다.

