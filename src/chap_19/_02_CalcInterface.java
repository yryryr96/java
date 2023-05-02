package chap_19;
// 더미 클래스 -> 로직 완성 -> 실제 클래스와 더미클래스의 정보가 다름 -> ??
// 인터페이스는 더미클래스를 작성하기 전 만들어놓는 대략적인 틀 ?
// 모조 클래스 역할 A
class CalculatorDummy {
    public void setOprands(int first,int second, int third){}
    public int sum(){
        return 60;
    }

    public int avg(){
        return 20;
    }
}
class Calc implements Calculatable {
    int first, second,third;
    public void setOprands(int first, int second, int third){
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public int sum(){
        return this.first + this.second + this.third;
    }

    public int avg(){
        return (this.first + this.second + this.third) / 3;
    }
}

// 사용처 역할 B
public class _02_CalcInterface {
    public static void main(String[] args) {
        Calc c = new Calc();
        c.setOprands(10,20,30);
        System.out.println(c.sum()+c.avg());
    }
}
