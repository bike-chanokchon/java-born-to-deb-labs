import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        String text;

        Scanner sc = new Scanner(System.in);
        text = sc.nextLine();
        sc.close();

        for (int index = 0; index < text.length(); index++) {
            char character = text.toLowerCase().charAt(index);

            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                continue;
            }

            System.out.print(text.charAt(index));
        }
    }
}
