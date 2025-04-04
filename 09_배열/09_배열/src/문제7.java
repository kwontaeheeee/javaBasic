public class 문제7 {
    public static void main(String[] args) {
        int[]price ={228000, 80000, 53700, 89500};
        int max = price[0];
        for(int i =1; i<price.length; i++){
            System.out.printf("max=%d, data[%d]=%d\n", max ,i, price[i]);
            if(max < price[i]){
               
                max = price[i];
            }
        }
    }
}
