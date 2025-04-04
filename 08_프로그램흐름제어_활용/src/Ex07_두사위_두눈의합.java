public class Ex07_두사위_두눈의합 {
    public static void main(String[] args) {
        int count = 0;
        for(int i=1; i<7; i++){
            for(int j=1; j<7; j++){
                if(i+j==6){
                    System.out.printf("[%d,%d]\n", i,j);
                    count++;
                }
            }
        }
        System.out.printf("경우의수는 %d개입니다.\n",count);
    }
}
