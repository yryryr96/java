package chap_11;

class Calculator {
    int left,right;
    // 생성자 - constructor : 생성자의 이름은 클래스와 동일 !!!!!
    // 클래스가 실행될 때 그 어떠한 메서드보다 먼저 실행된다. -> 객체 초기화
    public Calculator(int left, int right) {
        this.left = left;
        this.right = right;
    }
    public void sum() {
        System.out.println(this.left + this.right);
    }
    public void avg() {
        System.out.println((this.left+this.right)/2);
    }
}

public class _01_ClassConstructor {
    public static void main(String[] args) {
        Calculator c1 = new Calculator(10,20); // 생성자
        c1.sum();
        c1.avg();
    }
}
