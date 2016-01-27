package singleton.example2;

public class MyClass
{
    private static MyClass myClass = new MyClass();

    private MyClass()
    {

    }

    public static synchronized MyClass getInstance()
    {
        return myClass;
    }
}
