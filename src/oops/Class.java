package oops;

public class Class {
    public static void main(String[] args) {
        Student student1 = new Student(17, "Brijesh Rane", 70.0f, 150);
//        student1.printDetails();
//        Student student2 = student1;
//
//        student2.name = "Rane Brijesh";

//        student1.printDetails();
//        for (int i=0; i<30000; i++) {
//            student1 = new Student(25, "Rane", 300, 600);
//            System.out.printf(" %d ", i);
//        }

//        int a = 10;
//        Integer b = 10; // Wrapper class

//        Student student2 = new Student(student1);
//        student2.printDetails();
//        student2.name = "Rane Brijesh"; // Value not changed
//        System.out.println(student2.name);

//        Student student3 = student1;
//        student3.name = "Rane Brijesh";
//        System.out.println(student1.name); // Value Changed

//        Human human1 = new Human(23, 10000, false, "Brijesh");
//        Human human2 = new Human(28, 20000, false, "Akshata");
//
////        System.out.println(human1.population); // 2
//        System.out.println(Human.population); // 2

//        greeting(); // cannot call non-static method

    }

    static void fun() {
//        greeting(); // not possible
        Class obj = new Class(); // with instance, it's possible
        obj.greeting();
        System.out.println("Static function");
    }

    void greeting() {
        fun(); // possible
        System.out.println("Non - Static function");
    }
}



class Student {
    int rno;
    String name;
    float marks;
    final int totalMarks;

    Student(int sRoll, String sName, float sMarks, int totalMarks) { // Parametrised Constructor
        this.rno = sRoll;
        this.name = sName;
        this.marks = (int) sMarks;
        this.totalMarks = totalMarks;
        System.out.println("Student constructor 1 called...");
    }

    // Constructor overloading - Copy Constructor
    Student(Student student) {
        this.rno = student.rno;
        this.name = student.name;
        this.marks = student.marks;
        this.totalMarks = student.totalMarks;
        System.out.println("Student constructor 2 called...");
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

class Human {
    int age;
    String name;
    boolean isMarried;
    int salary;
    static int population;

    public Human(int age, int salary, boolean isMarried, String name) {
        this.age = age;
        this.salary = salary;
        this.isMarried = isMarried;
        this.name = name;
        Human.population += 1;
    }
}