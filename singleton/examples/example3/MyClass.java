package singleton.example3;

public class MyClass
{
    private static MyClass myClass;

    private MyClass()
    {

    }

    public static MyClass getInstance()
    {
        if(null == myClass)
        {
            synchronized (MyClass.class)
            {
                if(null == myClass)
                {
                    myClass = new MyClass();
                }
            }
        }
        return myClass;
    }
}
