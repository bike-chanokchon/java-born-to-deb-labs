import java.util.Scanner;

public class ReverseThe {
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        sc.close();

        String word = "";
        int spaceCount = 0;
        String textResult = "";
        for (int col = text.length() - 1; col >= 0; col--) {
            char character = text.charAt(col);

            if (character == ' ') {
                if (spaceCount <= 0) {
                    spaceCount++;
                } else {
                    textResult += " ";
                }

                for (int wordCol = word.length() - 1; wordCol >= 0; wordCol--) {
                    textResult += word.charAt(wordCol);
                }
                word = "";
            } else {
                word += character;
            }
        }

        if (!word.equals("")) {
            textResult += " ";
            for (int wordCol = word.length() - 1; wordCol >= 0; wordCol--) {
                textResult += word.charAt(wordCol);
            }
        }

        System.out.println(textResult);
    }
}
