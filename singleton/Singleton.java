import java.io.Serializable;

public class Singleton implements Serializable {
	private static Singleton instance = new Singleton();
	
	private Singleton() {
	
	}
	
	public static Singleton getInstance() {
		return instance;
	}
	
	public void doSomething() {
		System.out.println(instance);
	}
	
	private int i = 10;
	
	public void setI(int i) {
		this.i = i;
	}
	
	public int getI() {
		return this.i;
	}
	
	//Singleton for writing/reading from streams. Implement serializable
	protected Object readResolve() {
        return instance;
    }
	
	public Object clone() throws CloneNotSupportedException {
		return this;
	}
}
