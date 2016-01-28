package ocp;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
	private static Map shapesMap = new HashMap();
	private static ShapeFactory factory = new ShapeFactory();
	
	private ShapeFactory() {
		
	}
	
	public static ShapeFactory instance() {
		return factory;
	}
	
	public static Shape getShape(String key) {
		
		return (Shape)shapesMap.get(key);
	}
	
	public static void registerShape(String key, Shape shape) {
		shapesMap.put(key, shape);
	}
}
