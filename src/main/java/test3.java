import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("숫자를 입력 하시오. \n");
        int n = sc.nextInt();

        if (n % 3 == 0 && n % 5 == 0) {
            System.out.printf("3과 5의 배수입니다. \n");
        } else if (n % 3 == 0) {
            System.out.printf("3의 배수입니다. \n");
        } else if (n % 5 == 0) {
            System.out.printf("5의 배수 입니다 \n");
        }
    }
}
