package chap_09;

class Calculator{
    int left, right; // 인스턴스 변수 : 인스턴스마다 다름
    static double PI = 3.14; // 클래스 변수 : 클래스에 의해 생성되는 인스턴스들에게 같은 값 전달
    static int base = 0;
    
    // static이 붙어있지 않으므로 인스턴스 메서드
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
    public void sum(){
        System.out.println(this.left + this.right + base);
    }
    public void avg(){
        System.out.println((this.left+this.right) / 2 + base);
    }
}

class Calculator3 {
    // static 붙이면 클래스 메서드로 사용
    public static void sum(int left, int right) {
        System.out.println(left+right);
    }
    public static void avg(int left, int right) {
        System.out.println((left+right)/2);
    }
}

public class _01_Class {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10,20);
        c1.sum();
        c1.avg();

        Calculator3.sum(10,20); // 클래스 메서드로 클래스에서 사용가능


    }
}
