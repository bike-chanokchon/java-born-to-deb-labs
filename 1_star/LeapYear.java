import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();

        if ((year % 4) == 0 && year != 1800) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
