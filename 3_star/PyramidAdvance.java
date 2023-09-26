import java.util.Scanner;

public class PyramidAdvance {
    public static void main(String[] args) {
        int height = 0;
        Scanner sc= new Scanner(System.in);
        height = sc.nextInt();
        sc.close();

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < height + row; col++) {
                if (col >= (height - row) - 1) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
        
        for (int row = height - 2; row >= 0; row--) {
            for (int col = 0; col < height + row; col++) {
                if (col >= (height - row) - 1) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}