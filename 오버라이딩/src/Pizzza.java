public class Pizzza extends MenuItem{

    


    public Pizzza(String name, int price){
        super(name, price);
    }

    @Override
    public String toString() {
        return "페퍼로니 피자: 치즈 듬뿍, 모두의 인기 메뉴";
    }

    @Override
    public String addOption() {
        return "엣지 변경: 치즈 크러스트";
    }
}
