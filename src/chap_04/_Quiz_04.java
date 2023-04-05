package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int max = 30000;
        int hour = 10;
        int charge = 4000;
        int money = hour * charge;
        boolean a = true;
        boolean b = false;

        if (money >= max) {
            money = max;
        }

        if (a || b) {
            money *= 0.5;
        }

        System.out.println(money);

    }
}
