import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindMaxNumber3 {
    public static void main(String[] args) {
        solve();
    }   

    private static void solve() {
        List<Integer> numbers = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        for (int round = 0; round < 3; round++) {
            numbers.add(sc.nextInt());
        }
        sc.close();

        Collections.sort(numbers, Collections.reverseOrder());

        System.out.println("MAX : " + numbers.get(0));
    }
}
