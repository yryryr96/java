package chap_10;

public class _03_Scope3 {
    static int i = 5;

    static void a() {
        int i = 10;
        b();
        System.out.println(i);
    }

    static void b() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        a();
    }
}
