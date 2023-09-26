import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int COUNT = sc.nextInt();
        int[] numbers = new int[COUNT];
        for (int i = 0; i < COUNT; i++) {
            numbers[i] = sc.nextInt();
        }

        final int INTEREST = sc.nextInt();
        sc.close();
        
        List<Integer> numberResults = new ArrayList<Integer>();
        for (int i = 0; i < COUNT; i++) {
            if (numbers[i] == INTEREST) {
                numberResults.add((i + 1));
            }
        }

        System.out.print("Position: ");
        for (int i = 0; i < numberResults.size(); i++) {
            System.out.print(numberResults.get(i));
            if (i < numberResults.size() - 1) {
                System.out.print(',');
            }
        }
    }
}
