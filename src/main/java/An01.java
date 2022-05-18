import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class An01 {
    public static void main(String[] args) {
        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> map = new HashMap<>();
        map.put("name", "이협건");
        map.put("dept", "데이터분석");

        list.add(map);

        map = null;

        map = new HashMap<>();
        map.put("name", "홍길동");
        map.put("dept", "정보보안");

        list.add(map);

        map = null;

        List<String> list2 = new ArrayList<>();
        list2.add("이협건");
        list2.add("홍길동");

        for (String name : list2) {
            System.out.println("name : " + name);
        }

        list2.forEach(name -> System.out.println("name : " + name));

        int listSize = list2.size();

        for (int i = 0; i < listSize; i++) {
            System.out.println("name : " + list2.get(i));
        }
        list.forEach(rMap -> {
            System.out.println("name : " + rMap.get("name"));
            System.out.println("dept : " + rMap.get("dept"));
        });

    }
}
