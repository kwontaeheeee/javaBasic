public class Ex07_스코프3 {
    public static void main(String[] args) {
        int target = 100;
        if(target == 100){  // 비교 연산자 ==로 수정
            int num = target + 100;
            System.out.println(num);
        } else{
            int num = target - 100;
            System.out.println(num);
        }
    }
}

