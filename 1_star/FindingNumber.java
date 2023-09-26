import java.util.Scanner;

public class FindingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = sc.nextInt();
        }
        int interest = sc.nextInt();
        sc.close();

        boolean hasInterest = false;
        for (int i = 0; i < count; i++) {
            if (numbers[i] == interest) {
                hasInterest = true;
                break;
            }
        }

        if (hasInterest) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
