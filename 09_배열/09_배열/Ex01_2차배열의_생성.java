public class Ex01_2차배열의_생성 {
    public static void main(String[] args) {
        // 1차원 배열 생성 및 초기화
        int[] hello = {10, 20, 30};
        int[] world = {40, 50, 60};

        // 2차원 배열 선언
        int[][] arr1 = new int[2][];
        
        // 2차원 배열에 1차원 배열 할당
        arr1[0] = hello;
        arr1[1] = world;

        // 2차원 배열 선언 및 크기 지정
        int[][] arr2 = new int[2][3];
        
        // 1차원 배열을 2차원 배열에 할당
        arr2[0] = hello;
        arr2[1] = world;

        // arr2 배열의 값 출력
        System.out.println(arr2[0][0]); // 10
        System.out.println(arr2[0][1]); // 20
        System.out.println(arr2[0][2]); // 30
        System.out.println(arr2[1][0]); // 40
    }
}
