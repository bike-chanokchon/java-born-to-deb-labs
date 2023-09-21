import java.util.Scanner;

public class GradCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        sc.close();

        if (score >= 90) {
            System.out.println("A");
        } else if (score <= 89 && score >= 85) {
            System.out.println("B+");
        } else if (score <= 84 && score >= 80) {
            System.out.println("C");
        } else if (score <= 79 && score >= 75) {
            System.out.println("C+");
        } else if (score <= 74 && score >= 70) {
            System.out.println("C");
        } else if (score <= 69 && score >= 65) {
            System.out.println("D+");
        } else if (score <= 64 && score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
