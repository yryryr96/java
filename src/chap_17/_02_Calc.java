package chap_17;

abstract class Caculator {
    int left,right;
    public void setOprands(int left,int right) {
        this.left = left;
        this.right = right;
    }

    public abstract void sum();
    public abstract void avg();
    public void run(){
        sum();
        avg();
    }
}

class CalcPlus extends Caculator {
    public void sum() {
        System.out.println("+ sum :" + (this.left + this.right));
    }

    public void avg() {
        System.out.println("+ avg :" + (this.left+this.right)/2);
    }
}

class CalcMinus extends Caculator {
    public void sum() {
        System.out.println("- sum :" + (this.left+this.right));
    }
    public void avg() {
        System.out.println("- avg :" + (this.left+this.right)/2);
    }

}
public class _02_Calc {
    public static void main(String[] args) {
        CalcPlus c1 = new CalcPlus();
        c1.setOprands(10,20);
        c1.run();
        CalcMinus c2 = new CalcMinus();
        c2.setOprands(10,20);
        c2.run();
    }
}
