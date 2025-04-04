public class Ex02_배열의원소의합계 {
    public static void main(String[] args) {
        int[] worktime = {7,5,5,5,5,10,7};

        int pay=0;
        for(int i =0; i<worktime.length; i++){
            pay += worktime[i];
        }
        System.out.println("일주일간의 총급여:"+worktime+"원");
    }
}
