public class Ex08_비교연산자 {
    public static void main(String[] args) {
        int x =1;
        int y =2;
        boolean a = x == y;
        boolean b = x != y;
        System.out.printf("x==y->%s\n",a);
        System.out.printf("x !=y -> %s\n",b);

        System.out.println(x < y);
        System.out.println(x <=y);
        System.out.println(x > y);
        System.out.println(x >=y);
    }
    
}
