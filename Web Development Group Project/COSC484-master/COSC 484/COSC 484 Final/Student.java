//Imported Libraries
import java.util.ArrayList;

public class Student {

	//Private Data
	private String name;
	private Major major;
	private int totalCreditsEarned;
	private ArrayList<Course> completedCourses;
	private ArrayList<Semester> degreePlan;
	
	//Default Constructor
	public Student() {
		name = "John Doe";
		major = MajorFactory.createMajor_Undecided();
		totalCreditsEarned = 0;
		completedCourses = null;
		degreePlan = null;
	}
	//Alternate Constructor(s)
	public Student(String n) {
		name = n;
		major = MajorFactory.createMajor_Undecided();
		totalCreditsEarned = 0;
		completedCourses = new ArrayList<Course>();
		degreePlan = new ArrayList<Semester>();
	}
	public Student(String n, Major m) {
		name = n;
		major = m;
		totalCreditsEarned = 0;
		completedCourses = new ArrayList<Course>();
		degreePlan = new ArrayList<Semester>();
	}
	public Student(String n, Major m, int c) {
		name = n;
		major = m;
		totalCreditsEarned = c;
		completedCourses = new ArrayList<Course>();
		degreePlan = new ArrayList<Semester>();
	}
	public Student(String n, Major m, int c, ArrayList<Course> s, ArrayList<Semester> p) {
		name = n;
		major = m;
		totalCreditsEarned = c;
		completedCourses = s;
		degreePlan = p;
	}
	//Copy Constructor
	public Student(Student s) {
		name = s.name;
		major = s.major;
		totalCreditsEarned = s.totalCreditsEarned;
		completedCourses = s.completedCourses;
		degreePlan = s.degreePlan;
	}
	
	//Getters
	public String getName() {
		return name;
	}
	public Major getMajor() {
		return major;
	}
	public int getTotalCreditsEarned() {
		return totalCreditsEarned;
	}
	public ArrayList<Course> getCompletedCourses(){
		return completedCourses;
	}
	public ArrayList<Semester> getDegreePlan(){
		return degreePlan;
	}
	//Setters
	public void setName(String n) {
		name = n;
	}
	public void setMajor(Major m) {
		major = m;
	}
	public void setTotalCreditsEarned(int c) {
		totalCreditsEarned = c;
	}
	public void setCompletedCourses(ArrayList<Course> s) {
		completedCourses = s;
	}
	public void setDegreePlan(ArrayList<Semester> p) {
		degreePlan = p;
	}

	//Add Functions
	public void addCompletedCourse(Course c) {
		completedCourses.add(c);
	}
	public void addCompletedCourse(String n, int c) {
		completedCourses.add(CourseFactory.createCourse(n, c));
	}
	public void addPlannedSemester(Semester s) {
		degreePlan.add(s);
	}
	//Delete Functions
	public Boolean removeCompletedCourse(Course c) {
		if(completedCourses.contains(c)) {
			completedCourses.remove(c);
			return true;
		}
		return false;
	}
	public Boolean removeCompletedCourse(String n) {
		for(Course c: completedCourses) {
			if(c.getName().toLowerCase().compareTo(n.toLowerCase()) == 0) {
				completedCourses.remove(c);
				return true;
			}
		}
		return false;
	}
	
	//ToString
	public String toString() {
		return(name + " | " + major + " | " + totalCreditsEarned);
	}
	public void printDegreePlan() {
		for(Semester s: degreePlan) {
			System.out.println(s.getSeason() + " " + s.getYear());
		}
	}
}
