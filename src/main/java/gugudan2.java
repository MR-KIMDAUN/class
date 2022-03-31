import java.util.Scanner;

public class gugudan2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.printf("몇단을 출력 하시겠습니까?");
        int i = num.nextInt();

        for( int a = 1; a <= 9; a++) {

            System.out.println(i + "*" + a + "=" + (a*i));
        }

    }
}
