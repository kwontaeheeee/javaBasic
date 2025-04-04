public class CircleTest {
    public static void main(String[] args) {
        Point point = new Point();
        point.setX(5);
        point.setY(10);

        Circle circle = new Circle();
        circle.setPoint(point);
        circle.setRadius(7);

        System.out.println(circle.toString());
    }
}
