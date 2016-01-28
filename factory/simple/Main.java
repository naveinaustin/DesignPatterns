package simple;

public class Main {

	public static void main(String[] args) throws Exception {
		Shape shape = ShapeFactory.getInstance("SQUARE");
		shape.calculateArea();
		
		shape = ShapeFactory.getInstance("RECTANGLE");
		shape.calculateArea();
		
		shape = ShapeFactory.getInstance("SHAPE_DUMMY");
		shape.calculateArea();
	}

}
