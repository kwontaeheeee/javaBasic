public class Dragun extends Protoss {

    public Dragun(String name, int hp, int speed, int dps) {
        super(name, hp, speed, dps);
    }

    @Override
    public void move(String position) {
        System.out.printf("[Dragun] %s(가) %s까지 천천히 이동합니다.\n", 
        this.getName(), position);
    }

    @Override
    public void attack(String target) {
        System.out.printf("[Dragun] %s(이) %s에 폭탄을 발사합니다. >>데미지:%d\n", 
        this.getName(), target, this.getDps());
    }
}
