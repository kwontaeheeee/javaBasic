public class Ex09_논리연산자 {

    public static void main(String[] args) {
        boolean a = !true;
        boolean b = !false;
        boolean c = !a;
        boolean d = !b;
        boolean e =!!true;
        System.out.printf("a=%s, b=%s, c=%s, d=%s, e=%s\n", a,b,c,d,e);

        boolean f = true && true;
        boolean g = true && false;
        boolean h = false && true;
        boolean i = false && false;
        System.out.printf("f=%s, g=%s, h=%s, i=%s\n", f,g,h,i);

        boolean j = true || true;
        boolean k = true || false;
        boolean l = false || true;
        boolean m = false || false;
        System.out.printf("j=%s, k=%s, l=%s, m=%s\n", j,k,l,m);
    }
}