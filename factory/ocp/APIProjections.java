package registration.factory.ocpf;

public class APIProjections extends Projections {
	
	static {
		ProjectionsFactory.instance().registerProjections("API", new APIProjections());
	}
	

	public void executeProjections() {
		System.out.println("Executing API Projections");
	}

}
