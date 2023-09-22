import java.util.Scanner;

class CustomerSommai {
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        String[][] customers = new String[n][3];
        for (int i = 0; i < n; i++) {
            customers[i][0] = sc.nextLine();
            customers[i][1] = sc.next();
            customers[i][2] = sc.next();

            sc.nextLine();
        }
        sc.close();
        
        System.out.println("--Customers Information--");
        for (int i = 0; i < n; i++) {
            System.out.println(customers[i][0] + " (age : " + (2017 - Integer.parseInt(customers[i][1])) + ")");
        }
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // sc.nextLine();
        
        // String[][] customers = new String[n][3];
        // for (int i = 0; i < n; i++) {
        //     customers[i][0] = sc.nextLine();
        //     customers[i][1] = sc.next();
        //     customers[i][2] = sc.next();
        //     sc.nextLine();
        // }
        // sc.close();
        
        // System.out.println("--Customers Information--");
        // for (int i = 0; i < n; i++) {
        //     System.out.println(customers[i][0] + " (age : " + (2017 - Integer.parseInt(customers[i][1])) + ")");
        // }
    }
}