class Zealot{
    int hp;
    int dps;

    void state(){
        System.out.printf("상태확인 >>> hp: %d, dps:%d\n" , hp,dps);
    }

    void levwlUp(){
        hp+=10;
        dps+=2;
        System.out.println("레벨업을 하여 체력(+10), 공격력(+2)이 증가합니다.");
    }

    void attacked(int enemyAttack)//파라미터
    {
        hp -=enemyAttack;
        System.out.printf("%d의 공격을 받아 hp가 %d만큼 감소합니다.%n" ,enemyAttack,hp);
    }
}


public class Ex03_ZealotSimylator {
    public static void main(String[] args) {
        Zealot zealot1 = new Zealot();
        zealot1.hp=100;
        zealot1.dps=20;

        zealot1.state();
        zealot1.attacked(30);
        zealot1.state();
        zealot1.levwlUp();
        zealot1.state();
    }
}
