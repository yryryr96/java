package chap_07;
import java.util.Scanner;
public class _02_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        System.out.println(i * 1000);
//        sc.close();
        while (sc.hasNextInt()) {
            System.out.println(sc.nextInt()*1000);
        }
        sc.close();

    }
}
