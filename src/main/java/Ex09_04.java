public class Ex09_04 {
    public static void main(String[] args) {
        String str = "Java 를 공부하는 중, Java는 재밌어요.^^";

        System.out.println("문자열 ==> " + str);

        System.out.print("제일 처음 나오는 Java 위치 ==> ");
        System.out.println(str.indexOf("Java"));
        System.out.print("마지막에 나오는 Java위치 ==> ");
        System.out.println(str.lastIndexOf("Java"));

        /*
        // 문자열을 바꿔주는 replace()
        String str1 = "Java를 공부 중...Java는 즐겁습니다. ^^";
        String str2 = str1.replace("Java", "자바");

        // 일부 문자열을 추출하는 substring()
        String str3 = "Java를 공부 중...Java는 즐겁습니다. ^^";
        String str4 = str3.substring(0, 4);

        // 문자열을 분리하는 split()
        String str5 = "IT,CookBook,Java";
        String str6[] = str5.split(",");
         */
    }
}
