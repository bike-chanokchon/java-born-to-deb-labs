import java.util.Scanner;

public class BasicCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                boolean isBeginOrEnd = (row == 0 || row == n - 1);
                boolean isFrame = (col == 0 || col == n - 1);
                if (isBeginOrEnd || isFrame) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
