public class 문제4{
        public static void main(String[] args) {
                
             int[] arr1 = { 1, 9, 4, 2, 5 };
            int[] arr2 = { 5, 8, 6, 3, 1 };
            System.out.println(compareArray(arr1, arr2));  
            }
        
        public static int compareArray(int[] arr1, int[] arr2) {
        int count = 0;  
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {  
                    count++;  
                    break;  
                    //이미 일치하는 값이 발견되면 더이상 arr2의 다른값을 비교할 필요가없음.
            }
                }
                }
            return count;  
         }
    }
            
            

        
        