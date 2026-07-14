public class GradeAssigner {

    public static char gradeIfElse(int marks) {

        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        }

        if (marks >= 90) {
            System.out.println("Grade = A");
            return 'A';
        }

        if (marks >= 75) {
            System.out.println("Grade = B");
            return 'B';
        }

        if (marks >= 60) {
            System.out.println("Grade = C");
            return 'C';
        }

        if (marks >= 40) {
            System.out.println("Grade = D");
            return 'D';
        }

        System.out.println("Grade = F");
        return 'F';
    }

    public static void main(String[] args) {

        gradeIfElse(95);
        gradeIfElse(80);
        gradeIfElse(65);
        gradeIfElse(50);
        gradeIfElse(30);
    }
}

