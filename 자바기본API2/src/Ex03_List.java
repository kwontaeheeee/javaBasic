import java.util.List;
import java.util.ArrayList;

public class Ex03_List {

    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<Integer>();

        numberList.add(10);
        numberList.add(20);
        numberList.add(40);
        numberList.add(30);
        numberList.add(30);
        numberList.add(30);
        numberList.add(30);

        int count = numberList.size();
        System.out.println("데이터크기:" + count);

        int value = numberList.get(40);
        System.out.println("4번째요소이 값:" + value);

        numberList.remove(4);

        count = numberList.size();
        System.out.println("데이터 크기:" + count);

        value = numberList.get(4);
        System.out.println("4번째 요소의 값: " + value);

        numberList.add(4,123);
        value = numberList.get(4);
        System.out.println("4번째 요소의 값" + value);

        count = numberList.size();
        System.out.println("데이터크기" + count);

        for(int i =0; i<numberList.size(); i++){
            Integer number = numberList.get(i);
            System.out.printf("%d번째 데이터 >> %d\n", i , number);
        }

        numberList.clear();
        count = numberList.size();
        System.out.println("데이터 크기:" + count);


        }
    }
