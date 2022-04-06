public class Ex06_07_1 {
    public static void main(String[] args) {
        int gop= 1;

        for (int i = 5; i > 0; i--) {
            gop *= i;
        }
        System.out.printf("5에서 1까지의 곱(5!) : %d \n", gop);
    }
}
