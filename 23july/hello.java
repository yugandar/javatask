//We can make constructor as private. So that We can not create an object outside of the class.
//This property is useful to create singleton class in java.
//Singleton pattern helps us to keep only one instance of a class at any time.
//The purpose of singleton is to cprivate static singleton myObj;
// Java program implementing Singleton class
// with getInstance() method
class Single
{
    // static variable single_instance of type Singleton
    private static Single single_instance = null;

    // variable of type String
    public String s;

    // private constructor restricted to this class itself
    private Single()
    {
        s = "Hello I am a string part of Singleton class";
    }

    // static method to create instance of Singleton class
    public static Single getInstance()
    {
        if (single_instance == null)
            single_instance = new Single();

        return single_instance;
    }
}

// Driver Class
class book
{
    public static void main(String args[])
    {
        // instantiating Singleton class with variable x
        Single x = Single.getInstance();

        // instantiating Singleton class with variable y
        Single y = Single.getInstance();

        // instantiating Singleton class with variable z
        Single z = Single.getInstance();

        // changing variable of instance x
        x.s = (x.s).toUpperCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");

        // changing variable of instance z
        z.s = (z.s).toLowerCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
    }
}
