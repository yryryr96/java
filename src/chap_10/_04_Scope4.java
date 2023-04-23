package chap_10;

class C {
    int v = 10; // 인스턴스 변수

    void m() {
        int v = 20; // 지역 변수
        System.out.println(v); // 지역변수 출력
        System.out.println(this.v); // 인스턴스 변수 출력
    }
}

public class _04_Scope4 {
    public static void main(String[] args) {
        C c1 = new C();
        c1.m();
    }
}
