import java.util.Scanner;

public class BackToFront {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close();

        for (int i = (count - 1); i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
