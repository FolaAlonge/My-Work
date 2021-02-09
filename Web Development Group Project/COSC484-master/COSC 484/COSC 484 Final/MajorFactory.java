//Imported Libraries
import java.util.ArrayList;

public class MajorFactory {
	
	//Prevents Instantiation
	private MajorFactory() {
		/* 
		 * private String name;
		 * private ArrayList<Course> requirements;
		 * private ArrayList<Course> electives;
		 */
	}
	
	//No Major
	public static Major createMajor_Undecided() {
		String name = "Undecided";
		return new Major(name);
	}
	public static Major createMajor_Undecided(ArrayList<Course> r, ArrayList<Course> e) {
		String name = "Undecided";
		ArrayList<Course> requirements = r;
		//Add Required Classes to arraylist
		ArrayList<Course> electives = e;
		//Add Elective Classes to arraylist
		return new Major(name, requirements, electives);
	}
	//Computer Science
	public static Major createMajor_ComputerScience() {
		String name = "Computer Science";
		ArrayList<Course> requirements = CourseFactory.createComputerScienceRequirements();
		//Add Required Classes to arraylist
		ArrayList<Course> electives = new ArrayList<Course>();
		//Add Elective Classes to arraylist
		return new Major(name, requirements, electives);
	}
	public static Major createMajor_ComputerScience(ArrayList<Course> r, ArrayList<Course> e) {
		String name = "Computer Science";
		ArrayList<Course> requirements = r;
		//Add Required Classes to arraylist
		ArrayList<Course> electives = e;
		//Add Elective Classes to arraylist
		return new Major(name, requirements, electives);
	}
	//Generic
	public static Major createMajor_Generic() {
		String name = "Generic Degree";
		ArrayList<Course> requirements = CourseFactory.createGeneric300List(5);
		//Add Required Classes to arraylist
		ArrayList<Course> electives = CourseFactory.createGeneric100List(5);
		//Add Elective Classes to arraylist
		return new Major(name, requirements, electives);
	}
	

}
