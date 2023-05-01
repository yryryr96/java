package chap_17;
// 상속을 강제하는 일종의 규제
// 메서드중 1개라도 abstact라면 클래스도 abstract가 된다.
// 부모 클래스에는 메소드의 시그니처만 정의해놓고 그 메소드의 실제 동작 방법은 이 메소드를 상속 받은 하위 클래스의 책임으로 위임한다.
abstract class A {
    public abstract int b();
    // 본체{내용}가 있는 메소드는 abstract 키워드를 가질 수 없다.
    // public abstrac int c(){System.out.println("hello");}
    // 추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재 할 수 있다.
    // 메서드 b() 는 바로 사용할 수 없기 때문에 A를 상속받은 클래스 B가 b()를 메서드 오버라이딩 해야한다. -> 상속을 강제한다.

    public void d(){
        System.out.println("world");
    }
}
class B extends A {
    public int b() {
        return 1;
    }
}

public class _01_abstract {
    public static void main(String[] args) {
        B obj = new B();
    }
}
