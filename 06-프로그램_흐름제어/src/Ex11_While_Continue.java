public class Ex11_While_Continue {
    public static void main(String[] args) {
        int x = 0;
        while(x<10){
            x++;
            if(x%2==0){
                continue;
            }
            System.out.println(x);
        }
    }
    
}
