package chap_03;

public class _03_Stringcompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); // 문자열 내용이 같으면 true, 다르면 false

        // 대소문자 구분없이 내용만 같으면 true
        System.out.println(s2.equalsIgnoreCase("python"));

        // 문자열 비교 심화
        s1 = "1234" ; // 벽에 붙은 메모지의 비밀번호 정보
        s2 = "1234" ;
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // true
        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true '내용'
        System.out.println((s1 == s2)); // false 'id'
        // Java에서 문자열의 내용을 비교하기 위해서는 equals() 사용
    }
}
