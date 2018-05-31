package clspkg;

public class Greetings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student();
		student1.setModuleId(101);
		
		System.out.println("Greetings student, you are taking JUnit "+ student1.getModuleId());
		System.out.println("Greetings Everyone!");
		
	}

}
