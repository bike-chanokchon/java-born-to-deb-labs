import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FistWeight {
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        List<Integer> weights = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        String input = "";
        while (true) {
            input = sc.nextLine();
            if (input.toLowerCase().equals("min") || input.toLowerCase().equals("max")) {
                break;
            } else {
                weights.add(Integer.parseInt(input));
            }
        }
        sc.close();

        if (input.toLowerCase().equals("min")) {
            Collections.sort(weights);
        } else {
            Collections.sort(weights, Collections.reverseOrder());
        }

        int spaceCount = 0;
        for (int i = 0; i < weights.size(); i++) {
            if (weights.get(i) > 0) {
                if (spaceCount <= 0) {
                    spaceCount++;
                } else {
                    System.out.print(" ");
                    ;
                }
                System.out.print(weights.get(i));
            }
        }
    }
}
