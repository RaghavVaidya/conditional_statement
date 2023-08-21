import java.util.Scanner;

public class result_generator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total marks");
        int total_marks = sc.nextInt();
        System.out.println("Enter the marks of physics");
        int marks1 = sc.nextInt();
        System.out.println("Enter the marks of computer");
        int marks2 = sc.nextInt();
        System.out.println("Enter the marks of maths");
        int marks3 = sc.nextInt();

        double percentage1 = ((double) marks1 / total_marks) * 100;
        double percentage2 = ((double) marks2 / total_marks) * 100;
        double percentage3 = ((double) marks3 / total_marks) * 100;
        double avg = (percentage1 + percentage2 + percentage3) / 3;

        if (avg >= 90 && avg <= 100) {
            System.out.println("Your grade is: A+");
        } else if (avg >= 80 && avg <= 89) {
            System.out.println("Your grade is: A");
        } else if (avg >= 70 && avg <= 79) {
            System.out.println("Your grade is: B+");
        } else if (avg >= 60 && avg <= 69) {
            System.out.println("Your grade is: B");
        } else if (avg >= 50 && avg <= 59) {
            System.out.println("Your grade is: C+");
        } else if (avg >= 40 && avg <= 49) {
            System.out.println("Your grade is: C");
        } else if (avg < 40) {
            System.out.println("Your grade is: NG");
        }
    }
}
