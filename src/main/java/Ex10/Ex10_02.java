package Ex10;

public class Ex10_02 {
    public static void main(String[] args) {
        int[] aa = new int[3];
        try {
            aa[2] = 100 / 0; // 0으로 나누는 오류가 발생한다
            aa[3] = 100;
        /* } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 첨자가 배열 크기보다 커요");
            System.out.println("에러메시지 : " + e);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누는 등의 오류에요"); // 0으로 나누는 오류 둥 수식 오류가 발생하면 10행을 실행한다
            System.out.println("에러 메시지 : " + e); */
        } catch (Exception e) { // catch는 순서대로 실행 되기에 Exception 함수는 맨 아래에 있어야 한다.
            System.out.println("자바 오류계의 시조"); // 모든 오류를 잡아낸다.
            System.out.println("에러 메시지 : " + e);
        } finally {
            System.out.println("이부분은 무조건 나와요"); // 오류 발생 여부와 관계없이 실행한다.
        }
    }
}
