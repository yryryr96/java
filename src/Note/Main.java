import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i <n ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int m = Integer.parseInt(br.readLine());
        int start = 0 ;
        int end = arr[n-1];
        int ans = 0;
        while(start<=end){
            int mid = (start + end) / 2;
            int SUM = 0;
            for (int num : arr){
                if (num < mid){
                    SUM += num;
                }
                else {
                    SUM += mid;
                }
            }

            if (SUM > m ) end = mid-1;
            else {
                ans = mid;
                start = mid + 1;
            }
        }
        System.out.println(ans);
    }
}