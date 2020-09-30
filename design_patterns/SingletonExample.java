
/**
 * Implementation of Singleton Design Pattern
 * @author Rana M. Suleman
 */
public class SingletonExample {

    //tester method
    public static void main(String[] args) {

        singletonPattern object  = singletonPattern.getInstance();

        object.print();
    }
}

class singletonPattern{

    //Single Object created
    private static singleton instance = new singleton();

    //private constructor prevents from instantiating
    private singleton(){}

    //return that same Object
    public static singleton getInstance(){
        return instance;
    }

    public void print(){
        System.out.println("App started");
    }
}