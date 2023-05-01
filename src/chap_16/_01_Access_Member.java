package chap_16;

class A {
    // 어디서든 호출 가능 public
    public String y() {
        return "public void y()";
    }
    // 같은 클래스 내에서는 호출 가능, 다른 클래스에서 호출 불가능
    private String z() {
        return "public void z()";
    }

    public String x() {
        return z();
    }
}

public class _01_Access_Member {
    public static void main(String[] args) {
        A a = new A();

        System.out.println(a.y());
        //System.out.println(a.z());
        System.out.println(a.x());
        // 같은 클래스 내에서는 private 호출 가능 -> x() 와 z()는 같은 클래스 안에 있기 때문에 return z()를 통해 z()호출 가능
    }
}
