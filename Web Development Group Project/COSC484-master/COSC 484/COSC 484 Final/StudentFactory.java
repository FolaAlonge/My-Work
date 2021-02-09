//Imported Libraries

public class StudentFactory {

	//Prevents Instantiation
	private StudentFactory() {
		/* private String name;
		 * private String major;
		 * private int totalCreditsEarned;
		 * private ArrayList<Course> completedCourses;
		 */
	}
	
	//New Incoming Student
	public static Student createStudent(String n) {
		return new Student(n);
	}
	//Student with a Declared Major
	public static Student createStudent(String n, Major m) {
		return new Student(n, m);
	}
	//Student with credits
	public static Student createStudent(String n, Major m, int c) {
		return new Student(n, m, c);
	}
	
	
	
}
