package chap_19;

interface I {
    public void z();
}
// 클래스 A는 interface I 구현한다.
// interface I 안에 있는 메서드를 클래스 A안에서 반드시 구현해야한다.
class A implements I{
    public void z(){};
}

public class _01_Interface {
}
