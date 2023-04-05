package chap_04;

public class _01_if {
    public static void main(String[] args) {
        // 조건문 if
        int hour = 13 ;
        boolean morningCoffee = true;
//        if (hour < 14 && !morningCoffee ){
//            System.out.println("아이스 아메리카노 +1");
//        }
//        System.out.println("커피 주문 완료");

        if (hour >= 14 || morningCoffee) {
            System.out.println("디카페인 아이스 아메리카노 +1");
        }
    }
}
