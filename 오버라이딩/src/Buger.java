public class Buger extends MenuItem{
    public Buger(String name, int price){
        super(name, price);
    }
    @Override
    public String toString(){
    return "치즈버거: 패티와 빵이 조화를 이루는 메뉴";
    }

    @Override
    public String addOption(){
        return "치즈추가";
    }
}
    

