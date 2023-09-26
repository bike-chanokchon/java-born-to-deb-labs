import java.util.Scanner;

public class CapslockBug {
    public static void main(String[] args) {
        String text;
        Scanner sc = new Scanner(System.in);
        text = sc.nextLine();
        sc.close();

        for (int index = 0; index < text.length(); index++) {
            char character = text.charAt(index);

            if (character >= 'a' && character <= 'z') {
                System.out.print((char) (character - 32));
            } else if (character >= 'A' && character <= 'Z') {
                System.out.print((char) (character + 32));
            } else {
                System.out.print(character);
            }
        }
    }
}
