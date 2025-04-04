class StaticCounter2{
    static int count = 0;
    boolean created = false;

    public StaticCounter2(){
        count++;
        created = true;
    }

    public int getNormal(){
        created = true;
        return count;
    }

    public static int getStatic(){
        return count;
    }

    public class Ex03_StaticMethod {
    
        public static void main(String[] args) {
            System.out.printf("전체 객체의 수: %d\n", StaticCounter2.count); //0 아무객체도 안만듬
            System.out.println("--------");

            StaticCounter2 c1 = new StaticCounter2(); //1로증가
            StaticCounter2 c2 = new StaticCounter2(); //2로 증가

            System.out.printf("c1의 getNormal() 리턴값:%d\n", c1.getNormal()); //count는 모든 객체가 공유하는 변수이기때문에 2로반환
            System.out.printf("c2의 getNormal() 리턴값: %d\n", c2.getNormal());
            System.out.println("----------");

            System.out.printf("c1의 getStatic() 리턴값: %d\n", StaticCounter2.getStatic());
            System.out.printf("c1의 getStatic() 리턴값: %d\n", StaticCounter2.getStatic());
        }
    }
}
