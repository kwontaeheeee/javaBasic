public class CalcSingleTon {
    private static CalcSingleTon current;
    //클래스 레벨에서 하나의 객체만 존재

    public static CalcSingleTon getInstance(){
        if(current == null){ //조건문은 아직 객체가 생성되지않을때만 새로운 객체를 만들도록한다.
            current = new CalcSingleTon();
        }
        return current;
    }

    private CalcSingleTon(){
        System.out.println("CalcSingleTon에 대한 current 객체가 생성");
    }

    public int plus(int x, int y){return x + y;}
    public int minus(int x, int y){return x - y;}
    public int times(int x, int y){return x * y;}
    public int divied(int x, int y){return x / y;}
}

