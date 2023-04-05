package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {

        String s = "901231-1234567"; // 주민 13 자리
        System.out.println(s.substring(0,8)); // 0 ~ 8 직전까지
        // 0 위치부터 하이푼 인덱스위치 +2 직전까지
        System.out.println(s.substring(0,s.indexOf("-")+2));

    }
}
