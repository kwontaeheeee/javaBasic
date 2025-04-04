public class App {
    public static void main(String[] args) throws Exception {
        Zilot z = new Zilot("질럿1호", 150, 130, 100);
        z.move("저그멀티");
        z.attack("저그 멀티");
        System.out.println("---------");

        Dragun d = new Dragun("드라군1호", 200, 150, 100);
        d.move("저그멀티");
        d.attack("저그멀티");
        System.out.println("---------");

    }
}
