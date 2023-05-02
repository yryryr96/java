package chap_19;
// 인터페이스는 본체가 없는 메서드들만 가지고 있어야 한다.
interface I3{
    public void x();
}

interface I4{
    public void z();
}

// 하나의 클래스가 여러개의 인터페이스 구현 가능
class B implements I3,I4 {
    public void x() {}
    public void z() {}
}

public class _03_multiInterface {
}
