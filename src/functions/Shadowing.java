package functions;

public class Shadowing {
    static int x; // Global variable/Class variable is shadowed at line 9
    public static void main(String[] args) {
        x = 20;
        System.out.println("Global scope variable x: "+x);

        int x = 10;
        System.out.println("Local Scope variable x: "+x);
    }
}
