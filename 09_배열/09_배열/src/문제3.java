public class 문제3 {
    public static void main(String[] args) {
        int[]arr= {1,9,4,2,5};
        for(int i =0; i <arr.length/2; i++){
            int k = arr.length-i-1;

            int tmp = arr[i];
            arr[i] = arr[k];
            arr[k] = tmp;
        }
    
            for(int i =0; i<arr.length; i++){
                System.out.print(arr[i] + "");
        }
    }
}
