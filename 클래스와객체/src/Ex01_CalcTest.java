
class CalcParent {

    public int plus(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }
}


class CalcChild extends CalcParent {
  
    public int times(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b != 0) {
            return a / b; 
        } else {
            System.out.println("Cannot divide by zero.");
            return 0; 
        }
    }
}


public class Ex01_CalcTest {
    public static void main(String[] args) {
      
        CalcParent parent = new CalcParent();
        System.out.println(parent.plus(100, 50));  
        System.out.println(parent.plus(100, 50));  
        System.out.println(parent.minus(100, 50)); 
        System.out.println("-------");

        // Create an instance of CalcChild (which inherits from CalcParent)
        CalcChild child = new CalcChild();
        System.out.println(child.plus(200, 100));   
        System.out.println(child.minus(200, 100));  
        System.out.println(child.times(200, 100));  
        System.out.println(child.divide(200, 100)); 
    }
}
