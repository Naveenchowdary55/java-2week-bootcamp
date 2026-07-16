class Student {
    int rollno;
    String name;
    int marks;
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollno = 10;
        s1.name = "Naveen";
        s1.marks = 65;

        Student s2 = new Student();
        s2.rollno = 12;
        s2.name = "Shashi";
        s2.marks = 75;

        Student students[] = new Student[2];

        students[0] = s1;
        students[1] = s2;

        for (int i = 0; i < students.length; i++) {
             System.out.println( "well come to the student data portal");
            System.out.println("Roll No : " + students[i].rollno);
            System.out.println("Name    : " + students[i].name);
            System.out.println("Marks   : " + students[i].marks);
        System.out.println();
       
        }
    }
}
