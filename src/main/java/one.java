import java.util.Scanner;     // Scanner를 사용하기 위해서 임포트(자바에 dlc를 꼽는거)
public class one {
    public static void main(String[] args){
        // 목표 : 이름과 나이를 입력()했을때 이름은 같고 나이는 19세 이상이면 구구단을 사용할 수 있게하기. (Scanner사용하기)(if문 사용하기)(for문 사용하기)
        Scanner in = new Scanner(System.in); // 입력하는 변수 " in " 를 사용하겠다 선언, 후 Scanner를 데이터에 저장하라는 new를 사용   (System.in)은 데이터에 저장하는거
        System.out.print("이름을 입력해주세요 : ");    // 이름을 입력해주세요 출력
        String i = in.nextLine();//  이름 저장받는 변수인  " i " 생성
        String k = "김다운";   // 이 이름과 같은 이름을 입력해야지 구구단이 작동
        // 이름 저장 완료
        if(k.equals(i)){    // (기준).eqauls(넣는값) : 기준과 넣는 값이 같을 때 true
            System.out.print("나이를 입력해주세요 : ");  // 나이를 입력해주세요 출력
            int j = in.nextInt();  // ※ carmel 표기법으로 중간에 대문자 넣어주기
            if(j>=20)
            { System.out.println("성인입니다. 구구단 프로그램 사용허가완료\n"); // 19세 이상이면 출력
                System.out.print("구구단 몇단 : ");
                int l = in.nextInt(); // 구구단 몇 단 뒤에 입력한 숫자를 기준으로 구구단 생성
                System.out.println( l + "단" );  // (입력한 값)단
                int h;
                for( h = 1; h <= 8; h++ )
                { System.out.println( l + " x " + h + " = " + (l*h)); }
                System.out.println( l + " x " + h + " = " + (l*h) + "\n"); // 증감자를 안써주는 이유는 for문의 조건 끝dp h++에서 1 증가돼서 나오기 때문
                System.out.println("구구단 프로그램 종료");
            }
            else{ System.out.println("미성년자 로그인 실패"); } //
        }
        else{ System.out.println("이름 불일치 로그인 실패"); }  //
    }}