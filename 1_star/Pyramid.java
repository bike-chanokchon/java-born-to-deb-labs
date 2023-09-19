import java.util.Scanner;

public class Pyramid {
    public static void main (String[] args) {
        solve();
    }

    private static void solve() {
        Scanner sc = new Scanner(System.in);
        int round = sc.nextInt();
        sc.close();
        for (int i = 1; i <= round; i++) {
            for (int j = 1; j <= i; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}