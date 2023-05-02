package chap_19;

// 인터페이스를 선언할 때 내부 메서드의 접근제어자는 모두 public 이어야 한다.
public interface Calculatable {
    public void setOprands(int first, int second, int third);
    public int sum();
    public int avg();
}
