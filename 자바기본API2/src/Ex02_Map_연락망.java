import java.util.Map;
import java.util.HashMap;

public class Ex02_Map_연락망 {
    public static void main(String[] args) {
        Map<String, Member> map = new HashMap<String, Member>();

        Member mem1 = new Member("010-1234-5678","dasiy1203");
        map.put("철수",mem1);

        map.put("수현", new Member("010-2345-6789", "dasiy1203"));
        map.put("석훈", new Member("010-23445-6899", "dasiy1203"));
        map.put("민영", new Member("010-4567-5678", "dasiy1203"));
        map.put("호영", new Member("010-5678-6897", "dasiy1203"));

        Member output = map.get("호영");
        System.out.println(output.toString());
    }
}
