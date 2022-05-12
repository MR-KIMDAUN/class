import java.util.*;

public class ListMapExam {
    public static void main(String[] args) {
        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> map = new HashMap<>();

        //이협건 정보 저장하기
        map.put("name", "이협건");
        map.put("email", "hglee67@kopo.ac.kr");
        map.put("addr", "서울");
        map.put("dept", "데이터분석과");

        list.add(map); // 앞서 등록한 이협건 정보를 list에 저장하기

        map = null; // 메모리에 데이터를 지우는 방식으로 이협건 정보를 삭제하기

        //기존 map 객체의 값을 새롭게 생성하기
        map = new HashMap<>();

        //홓길동 정보 저장하기
        map.put("name", "홍길동");
        map.put("email", "g.d.hong@kopo.ac.kr");
        map.put("addr", "경기");
        map.put("dept", "시각디자인과");

        list.add(map); // 앞서 등록한 홍길동 정보를 list에 저장하기

        map = null; // 메모리에 데이터를 지우는 방식으로 이협건 정보를 삭제하기

        // List에 데이터 수 구하기
        int listSize = list.size();

        // List 객체에 저장된 값 출력하기
        // 여러 데이터가 저장되기 때문에 내용을 확인하기 위해서는 반복문을 사용함


        //우리가 지난 시간에 배운 방법
        for (int i = 0; i < listSize; i++) {

            Map rMap = list.get(i);

            System.out.println("-------------------------------------------");

            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("addr : " + rMap.get("addr"));
            System.out.println("dept : " + rMap.get("dept"));

        }
        // foreach문으로 조회 /  자바 1.8버전 부터 활용
        for (Map<String, String> rMap : list) {

            System.out.println("-------------------------------------------");

            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("addr : " + rMap.get("addr"));
            System.out.println("dept : " + rMap.get("dept"));

        }
        // 최근 개발자들에게 인기 높은 컬렉션 객체를 조회하는 방법
        // 람다식 : 자바 1.8버전부터 정상적으로 지원
        // 단, 적용 가능한 경우가 제한적임
        list.forEach(rMap -> {

                System.out.println("-------------------------------------------");

                System.out.println("name : " + rMap.get("name"));
                System.out.println("email : " + rMap.get("email"));
                System.out.println("addr : " + rMap.get("addr"));
                System.out.println("dept : " + rMap.get("dept"));

            }
        );
        // 람다식 이전까지 사용된 반복문 처리 방법
        // 자바 1.7버전 이전에 많이 활용됨

        //Iterator 를 활용한 방법 -> 개발 유지보수에 좋음
        Iterator<Map<String, String>> it = list.iterator();

        while (it.hasNext()) {
            Map<String, String > rMap = it.next();

            System.out.println("-------------------------------------------");

            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("addr : " + rMap.get("addr"));
            System.out.println("dept : " + rMap.get("dept"));

            // System.out.println("-------------------------------------------");
        }
    }
}
