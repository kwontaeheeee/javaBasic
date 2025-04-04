public class Q3 {
    
        public static void main(String[] args) {
            MenuItem[] menuItems = new MenuItem[3];
            menuItems[0] = new Burger("치즈버거", 8000);
            menuItems[1] = new Pizza("페퍼로니 피자", 7000);
            menuItems[2] = new Salad("그린 샐러드", 4000);
    
            int totalPrice = 0;
    
            for (MenuItem item : menuItems) {
                System.out.println(item.toString());
                totalPrice += item.getPrice();
    
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

//ctrl + . 부모생성자호출