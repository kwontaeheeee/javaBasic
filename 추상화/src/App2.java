public class App2 {
    public static void main(String[] args) {
        몬스터 m = new 몬스터("골램", 500, 30, 200);
        주인공 j = new 주인공("가사", 1200,120,320);

        m.walk();
        m.run();
        m.jump();

        j.walk();
        j.run();
        j.jump();

        m.attack();
        j.defense();
        j.attack();
        m.evasion();
        m.attack();
        j.evasion();
        j.pickUpItem();
        j.talkNpc();
    }
}
