import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] A = new int[n][m];
        int[][] B = new int[n][m];

        for (int i = 0; i <n ; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j <m ; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i <n ; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j <m ; j++) {
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                sb.append(A[i][j] + B[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);



    }
}