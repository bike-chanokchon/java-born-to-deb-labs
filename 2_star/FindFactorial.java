import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        long factorial = calculateFactorial(number);
        System.out.println(factorial);
    }

    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    };
}
