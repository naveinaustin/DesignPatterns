package registration.factory.ocpf;

public class CAPPProjections extends Projections {

	static {
		ProjectionsFactory.instance().registerProjections("CAPP", new CAPPProjections());
	}
	
	public void executeProjections() {
		System.out.println("Executing CAPP Projections");
	}

}
