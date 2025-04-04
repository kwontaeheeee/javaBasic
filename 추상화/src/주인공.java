public class 주인공 extends Unit implements IFight, IMove, IMovement {
    
    public 주인공(String name, int hp, int speed, int dps) {
        super(name, hp, speed, dps);·
    }

    @Override
    public void pickUpItem() {
        System.out.printf("[주인공] %s가 %d의 속력으로 걷습니다\n", this.getName(), this.getSpeed());
    }

    @Override
    public void talkNpc() {
        System.out.printf("[주인공] %s가 NPC와 대화를 합니다.\n", this.getName());
    }

    @Override
    public void walk() {
        System.out.printf("[주인공] %s가 걸어갑니다.\n", this.getName());
    }

    @Override
    public void run() {
        System.out.printf("[주인공] %s가 달려갑니다\n", this.getName());
    }

    @Override
    public void jump() {
        System.out.printf("[주인공] %s가 점프합니다.\n", this.getName());
    }

    @Override
    public void attack() {
        System.out.printf("[주인공] %s가 %d의 힘으로 몬스터를 공격합니다.\n", this.getName(), this.getDps());
    }

    @Override
    public void defense() {
        System.out.printf("[주인공] %s가 상대의 공격을 방어합니다.\n", this.getName());
    }

    @Override
    public void evasion() {
        System.out.printf("[주인공] %s가 상대의 공격을 회피합니다\n", this.getName());
    }
}
