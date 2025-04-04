public class Ex04_배열뒤집기 {
    public static void main(String[] args) {
        int [] data = {1,5,2,4,3};
//i는 배열의 앞부분, k는 배열의 뒷부분
        for(int i =0; i<data.length/2; i++){
            int k = data.length - i -1; //뒷부터 시작하는 인덱스 i가 증가->k감소

            int tmp = data[i];
            data[i] = data[k];
            data[k] = tmp;}

            for(int i =0; i<data.length; i++){
                System.out.print(data[i] + "\t");
            }
        }
    }

