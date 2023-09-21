import java.util.Scanner;

public class CustomerDetail {
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner sc = new Scanner(System.in);
        String fName = sc.nextLine();
        String lName = sc.nextLine();
        String address = sc.nextLine();
        String gender = sc.nextLine();
        String tel = sc.nextLine();
        sc.close();

        System.out.println("--- Customer Detail ---");
        System.out.println("Name : " + fName + " " + lName);
        System.out.println("Address : " + address);
        System.out.println("Gender : " + gender);
        System.out.println("Tel : " + tel);
    }
}
