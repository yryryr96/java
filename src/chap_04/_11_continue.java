package chap_04;

public class _11_continue {
    public static void main(String[] args) {
        int target = 10;
        for (int i = 0; i < 20 ; i++) {
            if (i == target) {
                continue;
            }
            System.out.println("안녕하세요" + i + "번째 손님");
        }
    }
}
