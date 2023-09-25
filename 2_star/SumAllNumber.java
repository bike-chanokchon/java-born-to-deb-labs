import java.util.Scanner;

public class SumAllNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numbers = sc.nextLine();
        sc.close();

        while (numbers.length() > 1) {
            int sum = 0;
            for (int i = 0; i < numbers.length(); i++) {
                sum += numbers.charAt(i) - '0';
            }
            numbers = Integer.toString(sum);
        }

        System.out.println(numbers);
    }
}
