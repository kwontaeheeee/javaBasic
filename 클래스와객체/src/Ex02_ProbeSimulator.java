class Probe{
    void move(int x, int y){
        System.out.printf("좌표 (%d,%d)로 이동합니다.\n" , x,y );
    }

    int mineral(){
        System.out.println("광물을 채집합니다.(+10)");
        return 10;
    }
}

public class Ex02_ProbeSimulator {
    
}
