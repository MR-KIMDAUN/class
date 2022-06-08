package Ex10;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Ex10_09 {
    public static void main(String[] args) throws Exception { // FileInputStream의 예외를 처리하기 위해 throws Exception문을 추가한다
        FileInputStream fis = new FileInputStream("/TEST/data.txt"); // FileInputStream을 준비하고 파일을 연다
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);

        int ch;

        while ( (ch = fis.read()) != -1) // 파일에서 문자 하나를  read()로 읽어온다. 파일의 끝일 경우 -1을 반환한다.
            System.out.print((char) ch); // 문자를 출력한다.

        fis.close(); // 파일의 모든 내용을 처리한 후 파일을 닫는다.
    }
}
