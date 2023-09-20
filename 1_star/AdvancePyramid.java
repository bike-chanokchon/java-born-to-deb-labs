import java.util.Scanner;

public class AdvancePyramid {
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        sc.close();

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < (height + row); col++) {
                if (col >= (height - row) - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// import java.util.Scanner;

// public class AdvancePyramid {
// public static void main (String[] args) {
// solve();
// }

// private static void solve() {
// Scanner sc = new Scanner(System.in);
// int height = sc.nextInt();
// sc.close();

// for (int i = 0; i < height; i++) {
// for (int j = 0; j <= height + i; j++) {
// if (j >= height - i) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
// }
