import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        // 3의 배수, 5의 배수, 3과 5의 배수
        Scanner sc = new Scanner(System.in);
        System.out.printf("숫자를 입력하세요 \n");

        int n = sc.nextInt();

        if (n % 3 == 0) {
        System.out.printf("3의 배수입니다. \n");
        }else {
            System.out.printf("3의 배수가 아닙니다. \n");
        }
    }
}
