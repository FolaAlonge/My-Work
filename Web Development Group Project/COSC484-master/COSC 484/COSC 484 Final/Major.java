//Imported Libraries
import java.util.ArrayList;

public class Major {

	//Private Data
	private String name;
	private ArrayList<Course> requirements;
	private ArrayList<Course> electives;
	
	//Default Constructor
	public Major() {
		name = "Undecided";
		requirements = null;
		electives = null;
	}
	//Alternate Constructor(s)
	public Major(String n) {
		name = n;
		requirements = new ArrayList<Course>();
		electives = new ArrayList<Course>();
	}
	public Major(String n, ArrayList<Course> r, ArrayList<Course> e) {
		name = n;
		requirements = r;
		electives = e;
	}
	//Copy Constructor
	public Major(Major m) {
		name = m.name;
		requirements = m.requirements;
		electives = m.electives;
	}
	
	//Getters
	public String getName() {
		return name;
	}
	public ArrayList<Course> getRequirements() {
		return requirements;
	}
	public ArrayList<Course> getElectives() {
		return electives;
	}
	//Setters
	public void setName(String n) {
		name = n;
	}
	public void setRequirements(ArrayList<Course> r) {
		requirements = r;
	}
	public void setElectives(ArrayList<Course> e) {
		electives = e;
	}
	
	//Add Functions
	public void addRequirement(Course r) {
		requirements.add(r);
	}
	public void addRequirement(String n, int c) {
		requirements.add(CourseFactory.createCourse(n, c));
	}
	public void addRequirement(String n, int c, String s) {
		if(s.toLowerCase().compareTo("fall") == 0) {
			requirements.add(CourseFactory.createCourse_FallOnly(n, c));
		}else if(s.toLowerCase().compareTo("spring") == 0) {
			requirements.add(CourseFactory.createCourse_SpringOnly(n, c));
		}else {
			requirements.add(CourseFactory.createCourse(n, c));
		}
	}
	public void addElective(Course e) {
		electives.add(e);
	}
	public void addElective(String n, int c) {
		electives.add(CourseFactory.createCourse(n, c));
	}
	public void addElective(String n, int c, String s) {
		if(s.toLowerCase().compareTo("fall") == 0) {
			electives.add(CourseFactory.createCourse_FallOnly(n, c));
		}else if(s.toLowerCase().compareTo("spring") == 0) {
			electives.add(CourseFactory.createCourse_SpringOnly(n, c));
		}else {
			electives.add(CourseFactory.createCourse(n, c));
		}
	}
	//Delete Functions
	public Boolean removeRequirement(Course r) {
		if (requirements.contains(r)){
			requirements.remove(r);
			return true;
		}
		return false;
	}
	public Boolean removeRequirement(String r) {
		for(Course c: requirements) {
			if(c.getName().toLowerCase().compareTo(r.toLowerCase()) == 0) {
				requirements.remove(c);
				return true;
			}
		}
		return false;
	}
	public Boolean removeElective(Course e) {
		if (electives.contains(e)){
			electives.remove(e);
			return true;
		}
		return false;
	}
	public Boolean removeElective(String e) {
		for(Course c: electives) {
			if(c.getName().toLowerCase().compareTo(e.toLowerCase()) == 0) {
				electives.remove(c);
				return true;
			}
		}
		return false;
	}
	
	//ToString
	public String toString() {
		return(name);
	}
	
}
