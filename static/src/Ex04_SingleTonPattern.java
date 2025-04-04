public class Ex04_SingleTonPattern {
    public static void main(String[] args) {
        int x =100;
        int y = 50;

        Calc c1 = new Calc();
        System.out.printf("%d + %d = %d\n", x, y, c1.plus(x,y));

        Calc c2 = new Calc();
        System.out.printf("%d - %d = %d\n", x, y, c2.minus(x,y));

        Calc c3 = new Calc();
        System.out.printf("%d + %d = %d\n", x, y, c3.times(x,y));

        Calc c4 = new Calc();
        System.out.printf("%d + %d = %d\n", x, y, c4.divided(x,y));

        Calc c5= new Calc();
        System.out.printf("%d + %p = %d\n", x, y, c5.plus(x, y));
         System.out.printf("%d - %d = %d\n", x, y, c5.minus(x, y));
        System.out.printf("%d * %d = %d\n", x, y, c5.times(x, y));
        System.out.printf("%d / %d = %d\n", x, y, c5.divied(x, y));
        System.out.println(" -----");

    }
}
