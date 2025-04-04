public class Ex01_프로토스객체 {
    public static void main(String[] args) {
        
        Protoss p1 = new Protoss("프로브1", 100, 20, 10);
        p1.move("테란본진");
        p1.attack("테란본진");
        System.out.println(p1.toString());
        System.out.println("-----------");

        Zilot z1 = new Zilot("질럿1", 500, 300, 120);
        z1.move("테란본진");
        z1.attack("테란본진");
        z1.swardAttack("테란본진");
        System.out.println(z1.toString());
        System.out.println("--------");

        Dragun d1 = new Dragun("드라군1", 450, 250, 200);
        d1.move("테란의 본진");
        d1.attack("테란의본진");
        d1.fireAttack("테란의본진");
        System.out.println(d1.toString());
        System.out.println("----------");
    }
}
