package ocp;

public class Square extends Shape {
	static {
		ShapeFactory.instance().registerShape("SQUARE", new Square());
	}

	public void calculateArea() {
		System.out.println("Executing Square area");
	}

}
