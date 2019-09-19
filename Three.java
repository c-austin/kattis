import java.util.*;
import java.io.*;

public class Three {
    public static void main(String[] args) throws FileNotFoundException {
        // Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(new File("Three.txt"));
        int x;
        while((x = in.nextInt()) != 0) {
            solve(in, x);
        }
    }

    public static void solve(Scanner in, int x) {

    }
}