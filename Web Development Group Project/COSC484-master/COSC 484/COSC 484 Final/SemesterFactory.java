import java.util.ArrayList;

//Imported Libraries

public class SemesterFactory {

	//Prevents Instantiation
	private SemesterFactory() {
		/* private String season;
		 * private int year;
		 * private int totalCreditsTaken;
		 * private final int CREDIT_LIMIT = 19;
		 * private ArrayList<Course> schedule;
		 */
	}
	
	//Fall Semester
	public static Semester createFallSemester(int year) {
		return new Semester("Fall", year, 0);
	}
	//Spring Semester
	public static Semester createSpringSemester(int year) {
		return new Semester("Spring", year, 0);
	}
	//Summer Classes
	public static Semester createSummerSemester(int year) {
		return new Semester("Summer", year, 0);
	}
	//Mini-mester Classes
	public static Semester createWinterSemester(int year) {
		return new Semester("Winter", year, 0);
	}
	
	//Empty Degree Plan
	public static ArrayList<Semester> createDegreePlan(int year, String season, int numOfSemesters){
		ArrayList<Semester> temp = new ArrayList<Semester>();
		if(season.toLowerCase().compareTo("fall") == 0) {
			for(int i = 0; i < numOfSemesters; i++) {
				if(i % 2 == 0) {
					temp.add(createFallSemester(year));
					year++;
				}else {
					temp.add(createSpringSemester(year));
				}
			}
		}else {
			for(int i = 0; i < numOfSemesters; i++) {
				if(i % 2 == 0) {
					temp.add(createSpringSemester(year));
				}else {
					temp.add(createFallSemester(year));
					year++;
				}
			}
		}
		return temp;
	}
}
