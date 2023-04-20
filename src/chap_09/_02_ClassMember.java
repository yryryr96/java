package chap_09;

// 인스턴스 메서드는 클래스 멤버에 접근 할 수 있다.
// 클래스 메서드는 인스턴스 멤버에 접근 할 수 없다.
// 인스턴스 변수 -> Non - static field
// 클래스 변수 -> static field
class C1 {
    static int static_variable = 1;
    int instance_variable = 2;

    // 클래스 메서드에서 클래스 변수 호출 O
    public static void static_static() {
        System.out.println(static_variable);
    }

    // 클래스 메서드에서 인스턴스 변수 호출 X
    public static void static_instance() {
        //System.out.println(instance_variable);
    }

    // 인스턴스 메서드에서 클래스 변수 호출 O
    void instance_static() {
        System.out.println(static_variable);
    }
    // 인스턴스 메서드에서 인스턴스 변수 호출 O
    void instance_instance() {
        System.out.println(instance_variable);
    }

}


public class _02_ClassMember {
    public static void main(String[] args) {
        C1 c = new C1();
        c.static_static();
        c.instance_static();
        c.instance_instance();

        // 클래스에서 클래스 메서드 호출 O > 클래스 메서드에서 클래스 변수 호출 O
        C1.static_static();
        // 클래스에서 클래스 메서드 호출 O > 클래스 메서드에서 인스턴스 변수 호출 X
        C1.static_instance();
        // 클래스에서 인스턴스 메서드 호출 X > 인스턴스 메서드에서 클래스 변수 호출 O
        //C1.instance_static();
        // 클래스에서 인스턴스 메서드 호출 X > 인스턴스 메서드에서 인스턴스 변수 호출 O
        //C1.instance_instance();

    }
}

