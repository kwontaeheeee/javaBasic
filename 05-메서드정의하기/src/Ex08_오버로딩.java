public class Ex08_오버로딩 {
    public static void main(String[] args) {
        display(10);
        display(10,20);
        display(10, 3.14);
        display(10, 'a');
    }
    public static void display(int num1) {
        System.out.println(num1);
    }
    public static void display(int num1, int num2){
        System.out.println(num1 * num2);
    }
    public static void display(int num1, double num2){
        System.out.println(num1+num2);
    }
}
