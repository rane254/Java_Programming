package oops;

public class Class {
    public static void main(String[] args) {
        Student student1 = new Student(17, "Brijesh Rane", 70.0f, 150);
//        student1.printDetails();
//        Student student2 = student1;
//
//        student2.name = "Rane Brijesh";

//        student1.printDetails();
        for (int i=0; i<30000; i++) {
            student1 = new Student(25, "Rane", 300, 600);
            System.out.printf(" %d ", i);
        }

        int a = 10;
        Integer b = 10; // Wrapper class
    }
}

class Student {
    int rno;
    String name;
    float marks;
    final int totalMarks;

    Student(int sRoll, String sName, float sMarks, int totalMarks) {
        this.rno = sRoll;
        this.name = sName;
        this.marks = (int) sMarks;
        this.totalMarks = totalMarks;
        System.out.println("Object created...");
    }

    void printDetails() {
        System.out.printf("Student Roll: %d\nStudent Name: %s\nStudent Marks: %f\nStudent Percent: %d\n", this.rno, this.name, this.marks, calculatePercent());
    }

    int calculatePercent() {
        return (int) (this.marks/this.totalMarks*100);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Object destroyed.");
    }
}