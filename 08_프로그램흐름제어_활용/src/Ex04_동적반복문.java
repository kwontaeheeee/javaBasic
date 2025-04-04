public class Ex04_동적반복문 {

    public static void main(String[] args) {
        for(int i=0; i <5; i++){
            for(int j = 0; j <i+1; j++){
                System.out.printf("i=%d, j=%d\n", i ,j); //\n은 줄바꿈을 의미
            }
            if(i + 1 <5){
                System.out.println("----");
            }
        }
    }
}
