import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int blockCount = sc.nextInt();
        sc.close();

        for (int block = 0; block < blockCount; block++) {
            System.out.println(block);
        }
    }
}
