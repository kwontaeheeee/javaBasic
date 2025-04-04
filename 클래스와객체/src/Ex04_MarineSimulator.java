class Marine{
    String name;
    int hp;

    Marine(String name, int hp){
        this.name = name;
        this.hp = hp;
        System.out.printf("[%s] You wnna plece of me, boy?%n", this.name);
    }

    void state(){
        System.out.printf("[%s] hp: %d\n, name, hp");
    }

    void levelUp(){
        hp+=5;
        System.out.printf("[%s]레벨업을 하여 체력(+5)이 증가합니다. %n", name);
    }

    void attacked(int enemyAttack){
        hp -= enemyAttack;
        System.out.printf("[%s]적의 공격을 받아 hp가 %d 감소합니다. %n", name, enemyAttack);
    }
}

public class Ex04_MarineSimulator {
    public static void main(String[] args) {
        Marine m1 = new Marine("마린", 100);
        Marine m2 = new Marine("마린2", 100);

        m1.state();
        m2.state();
    
    m1.attacked(30);
    m2.attacked(20);

    m1.state();
    m2.state();

    m1.levelUp();
    m2.levelUp();
    m1.state();
    m2.state();
}
}
