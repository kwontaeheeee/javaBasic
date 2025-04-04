public class Ex10_삼항연산자 {
    public static void main(String[] args) {
        int a =10;
        int b= 5;
        int c = a >b ? 1:2;
        System.out.printf("c=%d\n",c);
        boolean k =true;
        int r = k ?100:0;
        int s = !k ? 100:0;
        System.out.printf("r=%d, s=%d\n", r,s);
        int x = 10;
        int y = 20;
        int z = x>y ? x+y:x-y;
        System.out.printf("z=%d\n",z);
    }
    
}
