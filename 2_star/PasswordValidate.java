import java.util.Scanner;

public class PasswordValidate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        sc.close();
        if (password.length() > 20) {
            System.out.println("Invalid");
        } else {
            boolean hasUpperCase = false;
            boolean hasLowerCase = false;
            boolean hasNumber = false;
            boolean hasSpacialCharacter = false;
            for (int i = 0; i < password.length(); i++) {
                char character = password.charAt(i);
                boolean upperCaseCondition = (character >= 'A' && character <= 'Z');
                boolean lowerCaseCondition = (character >= 'a' && character <= 'z');
                boolean numberCondition = ((character - '0') >= 0 && (character - '0') <= 9);
                boolean spacialCharacterCondition = (character >= '!' && character <= '/') || (character >= ':' && character <= '@');

                if (lowerCaseCondition) {
                    hasLowerCase = true;
                } else if (numberCondition) {
                    hasNumber = true;
                } else if (upperCaseCondition) {
                    hasUpperCase = true;
                } else if (spacialCharacterCondition) {
                    hasSpacialCharacter = true;
                }

                if (hasLowerCase && hasUpperCase && hasNumber && hasSpacialCharacter)
                    break;
            }

            if (hasLowerCase && hasUpperCase && hasNumber && hasSpacialCharacter) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
