public class Ex03_구구단 {
    public static void main(String[] args) {
        for(int i =2; i <10; i++){
            for(int j =1; j<10; j++){
                System.out.printf("%d x %d = %2d\n", i , j, i*j);
            }
            if(i + 1 <10){ // 마지막9단에는 출력선이 표시되지않도록한다.
                System.out.println("-----------");
            }
        }
    }
}
//print는 줄바꿈을 하지않는다.
//println은 줄바꿈을 한다.
//printf는 format을 지정한다.