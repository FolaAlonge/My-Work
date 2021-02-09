//Imported Libraries
import java.util.ArrayList;

public class Course {

	//Private Data
	private String name;
	private int credits;
	private ArrayList<String> availability;
	private ArrayList<Course> prerequisites;
	
	//Default Constructor
	public Course() {
		name = "";
		credits = 0;
		availability = new ArrayList<String>();
		prerequisites = new ArrayList<Course>();
	}
	//Alternate Constructor(s)
	public Course(String n, int c) {
		name = n;
		credits = c;
		availability.add("Fall");
		availability.add("Spring");
		availability.add("Winter");
		availability.add("Summer");
		prerequisites = new ArrayList<Course>();
	}
	public Course(String n, int c, ArrayList<String> a) {
		name = n;
		credits = c;
		availability = a;
		prerequisites = new ArrayList<Course>();
	}
	public Course(String n, int c, ArrayList<String> a, ArrayList<Course> p) {
		name = n;
		credits = c;
		availability = a;
		prerequisites = p;
	}
	//Copy Constructor
	public Course(Course c) {
		name = c.name;
		credits = c.credits;
		availability = c.availability;
		prerequisites = c.prerequisites;
	}
	
	//Getters
	public String getName() {
		return name;
	}
	public int getCredits() {
		return credits;
	}
	public ArrayList<String> getAvailability(){
		return availability;
	}
	public ArrayList<Course> getPrerequisites(){
		return prerequisites;
	}
	//Setters
	public void setName(String n) {
		name = n;
	}
	public void setCredits(int c) {
		credits = c;
	}
	public void setAvailability(ArrayList<String> a) {
		availability = a;
	}
	public void setPrerequisites(ArrayList<Course> p) {
		prerequisites = p;
	}
	
	//Add Functions
	public void addAvailability(String s) {
		availability.add(s);
	}
	public void addPrerequisites(Course c) {
		prerequisites.add(c);
	}
	public void addPrerequisites(String n, int c) {
		prerequisites.add(CourseFactory.createCourse(n, c));
	}
	//Delete Functions
	public Boolean removeAvailability(String n) {
		for(String s: availability) {
			if(s.toLowerCase().compareTo(n.toLowerCase()) == 0) {
				availability.remove(s);
				return true;
			}
		}
		return false;
	}
	public Boolean removePrerequisites(Course c) {
		if(prerequisites.contains(c)) {
			prerequisites.remove(c);
			return true;
		}
		return false;
	}
	public Boolean removePrerequisites(String n) {
		for(Course c: prerequisites) {
			if(c.getName().toLowerCase().compareTo(n.toLowerCase()) == 0) {
				prerequisites.remove(c);
				return true;
			}
		}
		return false;
	}
	
	//ToString
	public String toString() {
		String s = (name + " (" + credits + ")");
		for(String a: availability) {
			s.concat(" " + a);
		}
		return(s);
	}
	
	
}
