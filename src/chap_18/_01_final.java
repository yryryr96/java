package chap_18;
// abstract가 상속을 강제하는 것이라면 final은 상속/변경을 금지하는 규제이다.
// 실행되는 과정에서 한 번 값이 정해진 이후에는 변수 내의 값이 바뀌지 않도록 하는 규제이다.
// final 클래스는 상속 안되고, final로 선언된 변수는 변경 X, final로 선언된 메서드는 오버라이딩 X
class A {
    final void b(){};
}

class B extends A {
    // final 메서드이므로 오버라이딩도 불가 (변경 불가)
//    void b() {
//        System.out.println("HELLO");
//    }
}


public class _01_final {
    public static void main(String[] args) {
        B a = new B();
        a.b();
    }
}
