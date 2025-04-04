import java.util.Map;
import java.util.HashMap;
//hashmap - 키와 값의 쌍으로 데이터를 저장하는 맵의 한구현체이다.
//빠른속도와 키기반의 데이터접근이 특징이다. 내부적으로는 해시테이블을 사용하여
//데이터를 저장하고 키를 해시값으로 변환하여 빠르게 데이터를 검색가능하다.
//null값이 허용된다. 

public class Ex01_Map {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("나이",21);
        map.put("키", 175);
        map.put("몸무게", 80);

        System.out.printf("저장된 데이터의 수: %d\n", map.size());

        System.out.printf("AGE: %d\n", map.get("나이"));
        System.out.printf("HEIGHT: %d\n", map.get("키"));
        System.out.printf("WEIGHT: %d\n", map.get("몸무게"));
    }
}