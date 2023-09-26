import java.util.Scanner;

public class LowerUpperChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        sc.close();

        int upperCount = 0;
        int lowerCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            
            if (character >= 'a' && character <= 'z') {
                lowerCount++;
            } else if (character >= 'A' && character <= 'Z') {
                upperCount++;
            }
        }

        System.out.println("UPPER:" + upperCount);
        System.out.println("LOWER:" + lowerCount);
    }
}
