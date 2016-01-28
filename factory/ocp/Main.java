package registration.factory.ocpf;

//OCP followed
public class Main {
	static {
		try
		{
			Class.forName("registration.factory.ocpf.APIProjections");
			Class.forName("registration.factory.ocpf.CAPPProjections");
		}
		catch (ClassNotFoundException cnfe)
		{
			cnfe.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Projections projections = ProjectionsFactory.getProjection("CAPP");
		projections.executeProjections();
		
		projections = ProjectionsFactory.getProjection("API");
		projections.executeProjections();
	}

}
