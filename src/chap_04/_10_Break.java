package chap_04;

public class _10_Break {
    public static void main(String[] args) {
        // Break
        int max = 20;
        for (int i = 1; i <= 50 ; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");
            if (i == max) {
                System.out.println("재료가 모두소진");
                break;
            }
        }
        System.out.println("영업 종료");

        int idx = 1;
        while (idx <= 50) {
            System.out.println(idx + "번 손님 빨리와요");
            if (idx==max) {
                System.out.println("Sold Out");
                break;
            }
            idx ++;
        }
    }

}
