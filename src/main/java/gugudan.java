public class gugudan{
    public static void main(String[] args) {
        int i = 2;

        System.out.printf("2단 \n");
        for( int a = 1; a <= 9; a++) {

            System.out.println(i + "*" + a + "=" + (a*i));
            System.out.printf("%d * %d = %d \n", i, a, (i * a));
        }

    }
}
