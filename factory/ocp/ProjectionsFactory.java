package registration.factory.ocpf;

import java.util.HashMap;
import java.util.Map;

public class ProjectionsFactory {
	private static Map projectionsMap = new HashMap();
	private static ProjectionsFactory factory = new ProjectionsFactory();
	
	private ProjectionsFactory() {
		
	}
	
	public static ProjectionsFactory instance() {
		return factory;
	}
	
	public static Projections getProjection(String key) {
		
		return (Projections)projectionsMap.get(key);
	}
	
	public static void registerProjections(String key, Projections projection) {
		projectionsMap.put(key, projection);
	}
}
