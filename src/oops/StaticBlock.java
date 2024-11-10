package oops;

public class StaticBlock {

    static class Test {
        String name;

        public Test() {
            this.name = "Brijesh";
        }
    }

    static int a = 5;
    static int b;

    static {
        System.out.println("Static Block called ...");
        b = a * 4;
    }

    public static void main(String[] args) {
//        StaticBlock obj1 = new StaticBlock();
//        System.out.println(obj1.a + " " + obj1.b);

        Test t1 = new Test();

        System.out.println(t1.name);
    }
}
