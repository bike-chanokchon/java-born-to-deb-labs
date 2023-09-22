import java.util.Scanner;

public class CalculatorSommai {
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int total = 0;
        for (int round = 0; round < amount; round++) {
            total += sc.nextInt();
        }
        sc.close();

        System.out.println(total + " THB");
    }
}
