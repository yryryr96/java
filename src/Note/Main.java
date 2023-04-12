import java.io.*;
<<<<<<< HEAD
import java.math.BigInteger;
import java.util.*;
public class Main {

    static boolean[][] graph;
    static int min=64;
=======
import java.util.StringTokenizer;

public class Main{
>>>>>>> 4e1f62eba93a9d88ac9cdf9220ec5fd82eb33472
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
<<<<<<< HEAD
        graph = new boolean[n][m];
=======

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


>>>>>>> 4e1f62eba93a9d88ac9cdf9220ec5fd82eb33472

        for (int i = 0; i <n ; i++) {
            String str = br.readLine();
            for (int j = 0; j <m ; j++) {
                if (str.charAt(j) == 'W') graph[i][j] = true;
                else graph[i][j] = false;
            }
        }

        for (int i = 0; i <n-7 ; i++) {
            for (int j = 0; j <m-7 ; j++) {
                find(i,j);
            }
        }
        System.out.println(min);
    }
<<<<<<< HEAD

    public static void find(int i, int j){
        int ei = i+8;
        int ej = j+8;
        int cnt = 0;

        boolean TF = !graph[i][j];
        for (int k = i; k <ei ; k++) {
            for (int l = j; l <ej ; l++) {
                if (graph[k][l] == TF) cnt += 1;
                TF = !TF;
            }
            TF=!TF;
        }
        cnt = Math.min(cnt,64-cnt);
        min = Math.min(min,cnt);
    }
=======
>>>>>>> 4e1f62eba93a9d88ac9cdf9220ec5fd82eb33472
}