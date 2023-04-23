package chap_10;

public class _01_Scope {
    static int i; // global
    static void a(){
        int i = 0;
    }

    public static void main(String[] args) {
        for (i = 0; i <5 ; i++) {
            a();
            System.out.println(i);
        }
    }
}
