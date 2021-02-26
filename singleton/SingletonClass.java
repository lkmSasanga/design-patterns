public class SingletonClass {
    private static SingletonClass obj = null;
    private SingletonClass() {

    }

    public static SingletonClass objectCreationMethod() {
        if (obj == null) {
            obj = new SingletonClass();
        }
        return obj;
    }

    public void display() {
        System.out.print("Singleton class Example");
    }
}