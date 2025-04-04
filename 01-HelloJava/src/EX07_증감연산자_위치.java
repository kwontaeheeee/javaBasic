public class EX07_증감연산자_위치 {

    public static void main(String[] args) {
        int x =1;
        int y = 100+ ++x;
        System.out.printf("x=%d\n",x);
        System.out.printf("y=%d\n",y);
        int a =1;
        int b = 100 + a++;
        System.out.printf("a=%d\n",a);
        System.out.printf("b=%d\n",b);
    }
}