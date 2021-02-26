public class SingletonApp {
    public static void main(String[] args) {
        SingletonClass myObject = SingletonClass.objectCreationMethod();
        myObject.display();
    }
}