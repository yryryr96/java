package chap_20;
//다형성
// 오버로딩, 오버라이딩 등등 하나의 메소드나 클래스가 있을 때 이것들이 다양한 방법으로 동작하는 것
class A{
    public String x(){
        return "A.x";
    }
}

class B extends A {
    public String x(){
        return "B.x";
    }
    public String y(){
        return "y";
    }
}

// 클래스 B를 클래스 A의 데이터 타입으로 인스턴스화 했을 때 클래스 A에 존재하는 멤버만이 클래스 B의 멤버가 된다.
// 클래스 A에는 x() 만 있으니까 x()만 실행 가능 -> 실행했을 때는 B.x() 가 실행 -> 오버라이딩은 정상 작동
public class _01_polymorphism {
    public static void main(String[] args) {
        A obj = new B();
        System.out.println(obj.x());
//        System.out.println(obj.y());
    }

}
