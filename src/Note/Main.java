import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.in"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        System.out.println(Integer.parseInt(s[0]) -  Integer.parseInt(s[1]));

    }
}
