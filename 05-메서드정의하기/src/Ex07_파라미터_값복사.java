public class Ex07_파라미터_값복사 {
    public static void main(String[] args) {
        int a =10;
        System.out.println("main >>" + a);
        foo(a);
        System.out.println("main>>" +a);
        bar(a);
        System.out.println("main >>" + a);
    }
    public static void foo(int a){
        a += 100;
        System.out.println("foo >>" + a);
    }
    public static void bar(int x){
        x+=200;
        System.out.println("bar >>" + x);
    }
}
