package oops;

public class SingletonClass {

    public static void main(String[] args) {
        // only one object can be instantiated
        // stop allowing constructor to instantiate new objects
        Singleton obj1 = Singleton.getInstance(); // all objects are pointing towards same reference variable.

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();


    }

    static class Singleton {
        private static Singleton instance;

        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton() {};
            }
            return instance;
        }
    }

}

