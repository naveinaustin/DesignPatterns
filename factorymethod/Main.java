public class Main {
	public static void main(String[] args) {
		SubjectCreator subjCreator = new PhysicsCreator();
		System.out.println(subjCreator.getSubject());
		
		subjCreator = new MathsCreator();
		System.out.println(subjCreator.getSubject());
	}
}
