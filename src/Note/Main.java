import java.io.*;
import java.util.*;

public class Main{
<<<<<<< HEAD
    static StringBuilder sb;
    static boolean[] visited;
    static int n,m,v;
    static List[] graph;
    static Deque<Integer> q = new ArrayDeque<>();
    public static void dfs(int v){
        sb.append(v).append(" ");

        visited[v] = true;
        List<Integer> childs = graph[v];
        for (Integer child : childs){
            if (!visited[child]){
                dfs(child);
            }
        }
    }

    public static void bfs(int v){
        visited[v] = true;
        while(!q.isEmpty()){
            int now = q.remove();
            sb.append(now).append(" ");
            List<Integer> childs = graph[now];
            for (Integer child : childs) {
                if (!visited[child]){
                    visited[child] = true;
                    q.add(child);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        graph = new List[n+1];
        visited = new boolean[n+1];
        sb = new StringBuilder();

        for (int i = 1; i < n+1 ; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i <m ; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        for (int i = 1; i < n+1 ; i++) {
            Collections.sort(graph[i]);
        }

        dfs(v);
        sb.append("\n");
        visited = new boolean[n+1];
        q.add(v);
        bfs(v);
        System.out.println(sb);
=======
    static boolean[] visited;
    static int[] arr;
    static int[] lst;
    static int n;
    static int sum ;
        public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        sum = 0;
        visited = new boolean[n];
        lst = new int[n];
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i <n ; i++) {
            lst[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0,0);
        System.out.println(sum);
        
    }

    public static void dfs(int idx,int depth){
        if (depth == n){
            int s = 0;
            for (int i = 0; i <n-1; i++) {
                s += Math.abs(arr[i]-arr[i+1]);
            }
            if (s > sum) sum = s;
            return;
        }

        for (int i = 0; i < n ; i++) {
            if (!visited[i]){
                visited[i] = true;
                arr[depth] = lst[i];
                dfs(i,depth+1);
                visited[i] = false;
            }
        }
>>>>>>> 851fafdb7dbb56e13699442450a97b9d497a230f
    }

}