import java.util.Scanner;

public class ATMDecode {
    public static void main(String[] args) {
        String textEncoded;
        Scanner sc = new Scanner(System.in);
        textEncoded = sc.nextLine();
        sc.close();

        String numberStore = "";
        int decoded = 0;
        for (int index = 0; index < textEncoded.length(); index++) {
            char character = textEncoded.charAt(index);
            if ((character - '0') >= 0 && (character - '0' <= 9)) {
                numberStore += character;
            } else if (!numberStore.equals("")) {
                decoded += Integer.parseInt(numberStore);
                numberStore = "";
            }
        }

        if (!numberStore.equals("")) {
            decoded += Integer.parseInt(numberStore);
        }

        if (Integer.toString(decoded).length() < 4) {
            for (int i = 0; i < 4 - Integer.toString(decoded).length(); i++) {
                System.out.print(0);
            }
        }
        System.out.println(decoded);
    }
}
