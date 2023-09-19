public class SomjaiPyramid {
    public static void main (String[] args) {
        solve();
    }

    private static void solve() {
        int base = 5;
        
        // rows
        for (int i = 0; i < base; i++) {

            // columns
            for (int j = base - 1; j >= 0; j--) {
                if (j <= i) {
                    System.out.print("$ ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
