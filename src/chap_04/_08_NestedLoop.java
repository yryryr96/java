package chap_04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        // 이중 반복문
        for (int i = 0; i < 5 ; i++) {
            for (int k = 0; k < 4-i ; k++) {
                System.out.print(' ');
            }
            for (int j = 0; j < i+1 ; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

}
