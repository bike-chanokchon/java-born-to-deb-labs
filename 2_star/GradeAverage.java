import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        float[] grades = new float[5];

        Scanner sc = new Scanner(System.in);
        float sum = 0.0f;
        for (int i = 0; i < grades.length; i++) {
            grades[i] = sc.nextFloat();
            sum += grades[i];
        }
        sc.close();
        
        float gpa = sum / 5;

        System.out.println("THAI = " + grades[0]);
        System.out.println("MATH = " + grades[1]);
        System.out.println("ENGLISH = " + grades[2]);
        System.out.println("SCIENCE = " + grades[3]);
        System.out.println("SPORT = " + grades[4]);
        System.out.println("---");
        System.out.println("GPA = " + gpa);
    }
}
