import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // 내가 입력한 숫자가 홀인지 짝인지 출력해주는 프로그햄
        // 10 -> 짝입니다. 11 -> 홀입니다.
        Scanner sc = new Scanner(System.in);
        System.out.printf("숫자를 입력하세요. \n");

        int n = sc.nextInt();


        if (n % 2 == 0) {
            System.out.printf("짝입니다.");
        }else {
            System.out.printf("홀입니다.");
        }
    }
}
