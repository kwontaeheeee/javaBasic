class MenuItem {
    private String name;
    private int price;

    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "이름: " + name + " 메뉴 설명";
    }

    public String addOption() {
        return "옵션 추가 기능은 각 음식에 따라 다릅니다.";
    }
}

// Burger 클래스
class Burger extends MenuItem {
    public Burger(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "치즈버거: 패티와 빵이 조화를 이루는 메뉴";
    }

    @Override
    public String addOption() {
        return "치즈 추가";
    }
}

// Pizza 클래스
class Pizza extends MenuItem {
    public Pizza(String name, int price) {
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

// Salad 클래스
class Salad extends MenuItem {
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

// Main 클래스
public class FoodOrderApp {
    public static void main(String[] args) {
        MenuItem[] menuItems = new MenuItem[3];
        menuItems[0] = new Burger("치즈버거", 8000);
        menuItems[1] = new Pizza("페퍼로니 피자", 7000);
        menuItems[2] = new Salad("그린 샐러드", 4000);

        int totalPrice = 0;

        for (MenuItem item : menuItems) {
            System.out.println(item.toString());
            totalPrice += item.getPrice();

            // instanceof로 객체 타입을 확인하고, addOption() 호출
            if (item instanceof Burger) {
                System.out.println("옵션 적용: " + ((Burger) item).addOption());
            } else if (item instanceof Pizza) {
                System.out.println("옵션 적용: " + ((Pizza) item).addOption());
            } else if (item instanceof Salad) {
                System.out.println("옵션 적용: " + ((Salad) item).addOption());
            }
        }

        System.out.println("총 가격: " + totalPrice + "원");
    }
}

