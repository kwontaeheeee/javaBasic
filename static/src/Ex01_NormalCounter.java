class NormalCounter{
    private int count = 0;

    public NormalCounter(){
        count++;
    }
    public int getCount(){
        return count;
    }
}

public class Ex01_NormalCounter {

    public static void main(String[] args) {
        NormalCounter c1 = new NormalCounter();
        NormalCounter c2 = new NormalCounter();

        System.out.printf("c1의 count:%d\n", c1.getCount());
        System.out.printf("c2의 count: %d\n",c2.getCount());
    }
}

//static 변수는 클래스에 속하므로 모든 객체가 공유한다.
//count는 첫 번째 객체 생성 시 1로 증가하고, 
//두 번째 객체 생성 시 다시 1이 증가하여 최종적으로 2가 출력됩니
//static빆에선 staticcounter.count

//싱글톤패턴 - static