package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println(c);
        System.out.println((int)c);
        c = 'B';
        System.out.println(c);
        System.out.println((int)c);

        String[][] seats3 = new String[10][15] ;
        String[] eng = {"A","B","C","D","E","F","G","H","I","J"};
        char ch = 'A';
        System.out.println(ch);

        for (int i = 0; i < seats3.length ; i++) {
            for (int j = 0; j < seats3[i].length ; j++) {
                seats3[i][j] = String.valueOf(ch) + (j+1);
                System.out.print(seats3[i][j] + " ");
            }
            ch++;
            System.out.println();
        }
    }
}
