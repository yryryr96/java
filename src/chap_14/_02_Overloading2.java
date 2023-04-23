package chap_14;

class Overloading1 {
    // 리턴값이 다른 메서드는 오버로딩 불가능
    void A () {System.out.println("void A()");}
    void A(int arg1) {System.out.println("void A(int arg1)");}
    void A(String arg1){System.out.println("void A(String arg1)");}
}

class Overloading2 extends Overloading1 {
    // 메서드 오버로딩 : 부모 클래스에 매개변수가 2개인 A 메서드가 없다.
    void A(String arg1, String arg2){
        System.out.println("sub class : void A(String arg1, String arg2)");
    }
    // 메서드 오버라이딩 : 부모 클래스에 이미 매개변수가 없는 메서드가 있다.
    void A(){
        System.out.println("sub class : void A()");
    }
}

class Calculator1 {
    int [] oprands;

    public void setOprands(int[] oprands){
        this.oprands = oprands;
    }

    public void sum(){
        int total = 0;
        for (int value :
                this.oprands) {
            total += value;
        }
        System.out.println(total);
    }

    public void avg(){
        int total = 0;
        for ( int value : this.oprands) {
            total += value;
        }
        System.out.println( total / this.oprands.length);
    }

}
public class _02_Overloading2 {
    public static void main(String[] args) {
        Overloading1 c1 = new Overloading1();
        c1.A();
        c1.A(40);
        c1.A("djfkl");
        System.out.println("##########");
        Overloading2 c2 = new Overloading2();
        c2.A();
        c2.A(1);
        c2.A("coding1","coding2");
        System.out.println("###############");
        Calculator1 c3 = new Calculator1();
        c3.setOprands(new int[]{10,20,30});
        c3.sum();
        c3.avg();
    }
}
