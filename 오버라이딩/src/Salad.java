public class Salad extends MenuItem{
    public Salad(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "그린 샐러드: 신선한 채소로 만든 건강식";
    }

    @Override
    public String addOption() {
        return "드레싱 선택: 발사믹";
    }
}
