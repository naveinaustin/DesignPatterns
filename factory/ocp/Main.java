package ocp;

public class Main {
	static {
		try
		{
			Class.forName("ocp.Square");
			Class.forName("ocp.Rectangle");
		}
		catch (ClassNotFoundException cnfe)
		{
			cnfe.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		Shape shape = ShapeFactory.getShape("SQUARE");
		shape.calculateArea();
		
		shape = ShapeFactory.getShape("RECTANGLE");
		shape.calculateArea();
	}

}
