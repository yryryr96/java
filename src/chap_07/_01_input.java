package chap_07;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class _01_input {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.in"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        System.out.println(Integer.parseInt(s[0]) + Integer.parseInt(s[1]));

    }
}
