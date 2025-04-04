public class 단항연산자 {

    public static void main(String[] args) {
        int x= 1;
        x = x+2;
        System.out.printf("x=%d\n",x);
        int y =1;
        y+=2;
        System.out.printf("y=%d\n", y);

        int a=1;
        a+=10;
        System.out.println(a);

        int b =10;
        b-=5;
        System.out.println(b);

        int c =5;
        c*=2;
        System.out.println(c);

        int d =5;
        d/=2;
        System.out.println(d);

        int e =5;
        e%=2;
        System.out.println(e);
    }
}
//and가 or 우선이다.