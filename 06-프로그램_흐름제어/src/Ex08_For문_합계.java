public class Ex08_For문_합계 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i < 11; i++){
            sum += i;
            System.out.printf("i=%d, sum=%d\n", i, sum);
        }
    }
}
