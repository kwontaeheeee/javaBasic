class Dragoon{
    int speed;
    int hp;
    int attack;
    int defense;

}
public class Ex01_DragoonSimulator {
    public static void main(String[] args) {
        Dragoon dg1 = new Dragoon();
        dg1.speed = 10;
        dg1.hp =100;
        dg1.attack = 20;
        dg1.defense = 5;

        String tpl = "speed:%d, hp:%d, attack: %d, defense: %d\n";
        System.out.printf(tpl,dg1.speed, dg1.hp, dg1.attack, dg1.defense);

        dg1.speed +=1;
        dg1.hp +=10;
        dg1.attack +=2;
        dg1.defense +=1;

        dg1.hp -=10;
        System.out.printf(tpl, dg1.speed, dg1.hp, dg1.attack, dg1.defense);
         Dragoon dg2 = new Dragoon();

         dg2.speed = 12;
         dg2.hp = 120;
         dg2.attack = 22;
         dg2.defense = 7;

         System.out.printf(tpl,dg1.speed, dg1.hp, dg1.attack, dg1.defense);
         System.out.printf(tpl, dg2.speed, dg2.hp, dg2.attack, dg2.defense);
    }
    
}