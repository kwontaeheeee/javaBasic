

public class Dragun extends Protoss {
    public Dragun(String name, int hp, int speed , int dps){
        super(name, hp, speed, dps);
    }

    @Override
    public void attack(String target){
        super.attack(target);
        System.out.println(">>>>원거리 공격을 위한 폭탄 발사 ~!!!! ");
    }

    @Override
    public void move(String position){
        super.move(position);
        System.out.println(">>>>지정된 우치까지 지상으로 이동~!!!!!!");
    }
    /**
    
     * @param target
     */
    public void fireAttack(String target){
        System.out.printf("[드라군의 고유 스킬] %s가 %s에게 폭탄을 발사합니다.", this.getName(), target);

    }
    }
