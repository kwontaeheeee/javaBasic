public class Ex13_For_Continue {
    public static void main(String[] args) {
        int x = 0;
        for(int i = 0; i <10; i++){
            if(i%2==0){
                continue;
            }
            x += i;
            System.out.println(x);
        }
    }
}
