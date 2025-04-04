public class 문제5 {
    public static void main(String[] args) {
        int[] workHours = {7, 5, 5, 5, 5, 10, 7}; 
        
        int[] hourlyWage = {4500, 4500, 4500, 4500, 5200, 5200, 5200}; // 월~일 시급

        int pay = 0;

  
        for (int i = 0; i < 7; i++) {
            pay += workHours[i] * hourlyWage[i]; 
        }

        
        System.out.println("일주일간 총 급여: " + pay + "원");
    }
}
