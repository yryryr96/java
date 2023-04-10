package Note;
import java.io.IOException;
import java.lang.StringBuilder;
public class test {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder("abaa");
        sb.append(4);
        System.out.println(sb);
        System.out.println(sb.toString());
        System.out.println(sb.reverse());
        sb.setCharAt(0,'b');
        System.out.println(sb);
        sb.setLength(2);
        System.out.println(sb.getClass());
        System.out.println(sb.toString().getClass());


    }
}
