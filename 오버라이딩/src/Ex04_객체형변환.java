public class Ex04_객체형변환 {
    public static void main(String[] args) {
        Protoss p0 = new Protoss("프로브1호", 50, 30, 2);

        Zilot z = new Zilot("질럿1호", 300, 150, 120);
        Protoss p1 = z;

        Protoss p2 = new Dragun("드라군1호", 280, 120, 170);

        p0.move("저그 본진");
        p0.attack("저그 본진");
        System.out.println("-------");

        p1.move("저그본진");
        p1.attack("저그본진");
        System.out.println("-----");

        p2.move("저그본진");
        p2.attack("저그 본진");
        System.out.println("------");

        Zilot rz = (Zilot) p1;
        Dragun rd = (Dragun) p2;
        rz.swardAttack("저그 본진");
        rd.fireAttack("저그 본진");
    }
}
