import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if (a == b) {
            System.out.println("AB");
        } else if (a > b) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}
