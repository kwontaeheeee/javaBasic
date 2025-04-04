public class Ex04_DoubleFor {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++){
            System.out.println("i에 대한 반복수행 >> i=" + i);
        
            for(int j = 0; j < 5; j++){
                System.out.printf("\ti=%d, j=%d\n", i, j);
            }
            System.out.println("i에 대한 반복 수행종료 >> i=", + i);
        }
    }
}
