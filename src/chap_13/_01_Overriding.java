package chap_13;

class Calculator {
    int left,right;

    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public int avg() {
        return ((this.left+this.right) / 2);
    }
}

class Sub_Calculator extends Calculator {
    // 부모 클래스에서 가지고 있는 메서드를 "재정의" -> 상위 클래스의 같은 메서드보다 우선순위가 높다.
    // 부모의 return 데이터 타입과 자식의 return 데이터 타입이 같지 않으면 오버라이딩 하지 못한다. (매개변수도 마찬가지)
    public void sum(){
        System.out.println("실행 결과는" + (this.left+this.right) + "입니다");
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }

}

public class _01_Overriding {
    public static void main(String[] args) {
        Sub_Calculator c1 = new Sub_Calculator();
        c1.setOprands(10,20);
        c1.sum();
        System.out.println(c1.avg()+ "입니다.");


        Calculator c2 = new Calculator();
        c2.setOprands(20,40);
        c2.sum();
        System.out.println(c2.avg()+"입니다");
    }
}
