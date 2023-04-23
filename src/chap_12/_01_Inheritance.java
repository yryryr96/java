package chap_12;
class Calculator {
    int left,right;

    public void setOprands(int left,int right){
        this.left = left;
        this.right = right;
    }

    public void sum(){
        System.out.println(this.left + this.right);
    }

    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
}
//상속
//Sub_Calculator 은 Calculaotr 클래스의 setOprands, sum, avg 를 이미 가지고 있다
//substract 라는 함수를 추가해서 사용할 수 있다. -> 커스텀 가능
class Sub_Calculator extends Calculator {
    public void substract() {
        System.out.println(this.left - this.right);
    }
}

// 상속의 상속도 가능
class Multi_Calculator extends Sub_Calculator {
    public void multi(){
        System.out.println(this.left*this.right);
    }
}

public class _01_Inheritance {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10,20);
        c1.sum();
        c1.avg();

        Sub_Calculator c2 = new Sub_Calculator();
        c2.setOprands(30,20);
        c2.substract();

        Multi_Calculator c3 = new Multi_Calculator();
        c3.setOprands(10,20);
        c3.substract();
        c3.multi();
    }
}
