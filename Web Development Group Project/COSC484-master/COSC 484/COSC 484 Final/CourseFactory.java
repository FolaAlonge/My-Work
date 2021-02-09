//Imported Libraries
import java.util.ArrayList;

public class CourseFactory {

	//Prevents Instantiation
	private CourseFactory() {
		/* 
		 * private String name;
		 * private int credits;
		 * private ArrayList<String> availability;
		 * private ArrayList<Course> prerequisites;
		 */
	}
	
	//Standard Course offered all times of the year
	public static Course createCourse(String name, int credits) {
		ArrayList<String> availability = new ArrayList<String>();
		availability.add("Fall");
		availability.add("Spring");
		availability.add("Winter");
		availability.add("Summer");
		return new Course(name, credits, availability);
	}
	//Standard Course only offered in the Fall Semester
	public static Course createCourse_FallOnly(String name, int credits) {
		ArrayList<String> availability = new ArrayList<String>();
		availability.add("Fall");
		return new Course(name, credits, availability);
	}
	//Standard Course only offered in the Spring Semester
	public static Course createCourse_SpringOnly(String name, int credits) {
		ArrayList<String> availability = new ArrayList<String>();
		availability.add("Spring");
		return new Course(name, credits, availability);
	}
	
	public static ArrayList<Course> createComputerScienceRequirements(){
		ArrayList<Course> r = new ArrayList<Course>();
		Course cosc175 = createCourse("COSC 175", 4);
		Course cosc236 = createCourse("COSC 236", 4);
		cosc236.addPrerequisites(cosc175);
		Course cosc237 = createCourse("COSC 237", 4);
		cosc237.addPrerequisites(cosc236);
		Course cosc290 = createCourse("COSC 290", 4);
		cosc290.addPrerequisites(cosc237);
		Course cosc336 = createCourse("COSC 336", 4);
		cosc336.addPrerequisites(cosc237);
		Course cosc350 = createCourse("COSC 350", 3);
		cosc350.addPrerequisites(cosc336);
		Course cosc412 = createCourse("COSC 412", 3);
		cosc412.addPrerequisites(cosc336);
		Course cosc439 = createCourse("COSC 439", 3);
		cosc439.addPrerequisites(cosc336);
		Course cosc455 = createCourse("COSC 455", 3);
		cosc455.addPrerequisites(cosc336);
		Course cosc457 = createCourse("COSC 457", 3);
		cosc457.addPrerequisites(cosc336);
		
		Course comm131 = createCourse("COMM 131", 3);
		Course cosc418 = createCourse("COSC 418", 3);
		cosc418.addPrerequisites(cosc336);
		Course engl317 = createCourse("ENGL 317", 3);
		Course math273 = createCourse("MATH 273", 4);
		Course math274 = createCourse("MATH 274", 4);
		math274.addPrerequisites(math273);
		Course math330 = createCourse("MATH 330", 4);
		math330.addPrerequisites(math274);
		Course math236 = createCourse("MATH 236", 3);
		
		r.add(cosc175);
		r.add(cosc236);
		r.add(cosc237);
		r.add(cosc290);
		r.add(cosc336);
		r.add(cosc350);
		r.add(cosc412);
		r.add(cosc439);
		r.add(cosc455);
		r.add(cosc457);
		r.add(comm131);
		r.add(cosc418);
		r.add(engl317);
		r.add(math273);
		r.add(math274);
		r.add(math330);
		r.add(math236);
		
		r.add(createCourse("CORE 1", 3));
		r.add(createCourse("CORE 2", 3));
		r.add(createCourse("CORE 3", 3));
		r.add(createCourse("CORE 4", 3));
		r.add(createCourse("CORE 5", 3));
		r.add(createCourse("CORE 6", 3));
		r.add(createCourse("CORE 7", 3));
		r.add(createCourse("CORE 8", 3));
		r.add(createCourse("CORE 9", 3));
		r.add(createCourse("CORE 10", 3));
		r.add(createCourse("CORE 11", 3));
		r.add(createCourse("CORE 12", 3));
		r.add(createCourse("CORE 13", 3));
		r.add(createCourse("CORE 14", 3));
		return r;
	}
	
	public static ArrayList<Course> createGeneric100List(int num){
		ArrayList<Course> r = new ArrayList<Course>();
		for(int i = 1; i <= num; i++) {
			r.add(createCourse("Class " + (100 + i), 3));
		}
		return r;
	}
	public static ArrayList<Course> createGeneric200List(int num){
		ArrayList<Course> r = new ArrayList<Course>();
		for(int i = 1; i <= num; i++) {
			r.add(createCourse("Class " + (200 + i), 3));
		}
		return r;
	}
	public static ArrayList<Course> createGeneric300List(int num){
		ArrayList<Course> r = new ArrayList<Course>();
		ArrayList<Course> p = new ArrayList<Course>();
		for(int i = 1; i <= num; i++) {
			r.add(createCourse("Class " + (300 + i), 3));
		}
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0) {
				p.add(createCourse("Class " + (200 + i), 4));
			}else {
				p.add(createCourse("Class " + (200 + i), 3));
			}
		}
		for(int i = 0; i < p.size(); i++) {
			if(i % 2 == 1) {
				p.get(i).addPrerequisites(createCourse("Class " + (101 + i), 4));
			}else {
				p.get(i).addPrerequisites(createCourse("Class " + (101 + i), 3));
			}
		}
		for(int i = 0; i < r.size(); i++) {
			r.get(i).addPrerequisites(p.get(i));
		}
		return r;
	}
}
