package chap_08;

class _02_Calculator {
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
        // this.left, this.right : Calculator 안에서 사용되는 변수
    }

    public void sum(){
        System.out.println(this.left + this.right);
    }
    public void avg() {
        System.out.println((this.left + this.right)/2);
    }
}

public class _01_calc {
    public static void main(String[] args) {
        _02_Calculator c1 = new _02_Calculator();
        c1.setOprands(20,40);
        c1.sum();
        c1.avg();

    }
}
