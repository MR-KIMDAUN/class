import java.util.HashMap;
import java.util.Map;

public class MapExam {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        //값 저장하기
        map.put("name", "이협건");
        map.put("email", "hglee67@kopo.ac.kr");
        map.put("dept", "데이터분석과");

        //값 불러오기
        System.out.println("-------------------------------------------");

        System.out.println("name : " + map.get("name"));
        System.out.println("email : " + map.get("email"));
        System.out.println("dept : " + map.get("dept"));

        System.out.println("-------------------------------------------");
    }
}
