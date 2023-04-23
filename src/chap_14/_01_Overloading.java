package chap_14;

class Calculator{
    int left,right,third;

    public void setOprands(int left,int right){
        System.out.println("setOprands(int left, int right)");
        this.left = left;
        this.right = right;
    }

    public void setOprands(int left,int right, int third){
        System.out.println("setOprands(int left, int right, int third)");
        this.left = left;
        this.right = right;
        // this.setOprands(left,right)
        this.third = third;
    }

    public void sum() {
        System.out.println(this.left+this.right+this.third);
    }
}

// 이름은 같지만 시그니처(매개 변수)는 다른 메서드를 중복으로 선언 할 수 있는 방법을 메서드 오버로딩이라고 한다.
public class _01_Overloading {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10,20);
        c1.sum();
        c1.setOprands(10,20,30);
        c1.sum();
    }
}
