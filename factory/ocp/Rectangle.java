package ocp;

public class Rectangle extends Shape {

	static {
		ShapeFactory.instance().registerShape("RECTANGLE", new Rectangle());
	}

	public void calculateArea() {
		System.out.println("Executing Rectangle area");
	}

}
