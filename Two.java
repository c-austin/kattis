import java.util.*;
import java.io.*;

public class Two {
    public static void main(String[] args) throws FileNotFoundException {
        // Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(new File("Two.txt"));

        int cases = in.nextInt();

        for(int i = 0; i < cases; i++) {
            solve(in, i + 1);
        }
    }

    public static void solve(Scanner in, int caseNo) {

    }
}