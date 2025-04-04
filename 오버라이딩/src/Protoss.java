public class Protoss {
    private String name;
    private int hp;
    private int speed;
    private int dps;

    public Protoss(String name, int hp, int speed, int dps) {
        this.name = name;
        this.hp = hp;
        this.speed = speed;
        this.dps = dps;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDps() {
        return this.dps;
    }

    public void setDps(int dps) {-
        this.dps = dps;
    }

    /**
     * Move the Protoss to a specific position.
     * @param position The destination position.
     */
    public void move(String position) {
        System.out.printf("%s가 %s까지 이동합니다.\n", this.name, position);
    }

    /**
     * Attack a target.
     * @param target The target to attack.
     */
    public void attack(String target) {
        System.out.printf("%s이(가) %s를 공격합니다. DPS: %d\n", this.name, target, this.dps);
    }

    @Override
    public String toString(){ //객체를 문자열로 표현
        return"{" +
        " name='" + getName() +"'" + //문자열을 연결하여 name= '질럿1호'
        ", hp ='" + getHp() + "'" +
        ", speed ='" + getSpeed() +"'" +
        ", dps='" + getDps() +"'" +
        "}";
        }
    }

