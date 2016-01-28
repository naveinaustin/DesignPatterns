package simple;

public class ShapeFactory {
	public static Shape getInstance(String key) {
		if("SQUARE".equals(key)) {
			return new Square();
		} else if("RECTANGLE".equals(key)) {
			return new Rectangle();
		} else {
			return new NULLShape();
		}
		
		//return null;
	}
}
