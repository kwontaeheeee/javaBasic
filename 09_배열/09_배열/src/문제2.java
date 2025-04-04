public class 문제2 {
    public static void main(String[] args) {
        
        int[] arr = { 1, 9, 4, 2, 5 };

        int[] copy = new int[arr.length];

        
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }

        
        System.out.print("copy 배열의 내용: ");
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
    }
}
