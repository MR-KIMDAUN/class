package Ex10;

public class Ex10_01 {
    public static void main(String[] args) {
        int[] aa = new int[3]; // 크기 3의 배열을 선언한다.
        try{
            aa[3] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 첨자가 배열 크기보다 커요 ~~"); // ArrayIndexOutOfBoundsException 예외가 발생하면 실행
            System.out.println("에러 메시지 : " + e);
        }
    }
}
