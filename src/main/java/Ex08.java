import java.util.ArrayList;
import java.util.List;

public class Ex08 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("이협건");
        list.add("홍길동");
        list.add("임꺽정");
        list.add("고길동");

        int listSize = list.size();

        for (int i = 0; i < listSize; i++){
            System.out.println("이름 : " + list.get(i));
        }
    }
}
