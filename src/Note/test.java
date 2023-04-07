package Note;

public class test {
    public static int power(int num) {
        int result = 0;
        result = num*num;
        return result;
    }
    public static void sayhello(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        System.out.println(power(4));
        sayhello();
    }
}
