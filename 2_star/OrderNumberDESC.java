import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrderNumberDESC {
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        List<Integer> numbers = new ArrayList<Integer>();
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int round = 0; round < n; round++) {
            numbers.add(sc.nextInt());
        }
        sc.close();

        Collections.sort(numbers, Collections.reverseOrder());

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
