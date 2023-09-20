import java.util.Scanner;

public class PowNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println(Math.round(Math.pow(a, b)));
    }
}
