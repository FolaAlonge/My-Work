//Imported Libraries
import java.util.ArrayList;

public class Semester {

	//Private Data
	private String season;
	private int year;
	private int totalCreditsTaken;
	private final int CREDIT_LIMIT = 19;
	private ArrayList<Course> schedule;
	
	//Default Constructor
	public Semester() {
		season = "Fall";
		year = 2020;
		totalCreditsTaken = 0;
		schedule = new ArrayList<Course>();
	}
	//Alternate Constructor(s)
	public Semester(String s, int y, int c) {
		season = s;
		year = y;
		totalCreditsTaken = c;
		schedule = new ArrayList<Course>();
	}
	public Semester(String s, int y, int c, ArrayList<Course> sch) {
		season = s;
		year = y;
		totalCreditsTaken = c;
		schedule = sch;
	}
	//Copy Constructor
	public Semester(Semester s) {
		season = s.season;
		year = s.year;
		totalCreditsTaken = s.totalCreditsTaken;
		schedule = s.schedule;
	}
	
	//Getters
	public String getSeason() {
		return season;
	}
	public int getYear() {
		return year;
	}
	public int getTotalCreditsTaken() {
		return totalCreditsTaken;
	}
	public ArrayList<Course> getSemesterSchedule(){
		return schedule;
	}
	//Setters
	public void setSeason(String s) {
		season = s;
	}
	public void setYear(int y) {
		year = y;
	}
	public void setTotalCreditsTaken(int c) {
		totalCreditsTaken = c;
	}
	public void setSemesterSchedule(ArrayList<Course> s) {
		schedule = s;
	}
	
	//Add Functions
	public void addCourse(Course r) {
		schedule.add(r);
		totalCreditsTaken += r.getCredits();
	}
	public void addCourse(String n, int c) {
		schedule.add(CourseFactory.createCourse(n, c));
		totalCreditsTaken += c;
	}
	public void addCourse(String n, int c, String s) {
		if(s.toLowerCase().compareTo("fall") == 0) {
			schedule.add(CourseFactory.createCourse_FallOnly(n, c));
		}else if(s.toLowerCase().compareTo("spring") == 0) {
			schedule.add(CourseFactory.createCourse_SpringOnly(n, c));
		}else {
			schedule.add(CourseFactory.createCourse(n, c));
		}
		totalCreditsTaken += c;
	}
	//Delete Functions
	public Boolean removeCourse(Course r) {
		if(schedule.contains(r)) {
			schedule.remove(r);
			return true;
		}
		return false;
	}
	public Boolean removeCourse(String n) {
		for(Course c: schedule) {
			if(c.getName().toLowerCase().compareTo(n.toLowerCase()) == 0) {
				schedule.remove(c);
				return true;
			}
		}
		return false;
	}
	
	//Status Functions
	public Boolean isOverCreditLimit() {
		//If there are more credits being taken than the max return true, false otherwise.
		return (totalCreditsTaken - CREDIT_LIMIT > 0 ? true:false);
	}
	public Boolean hasRoomToAdd(Course r) {
		//If the added credits from the course doesn't bring the total over the max return true, false otherwise
		return (totalCreditsTaken + r.getCredits() <= CREDIT_LIMIT ? true:false);
	}

	//Functionality
	
	//ToString
	public String toString() {
		//System.out.printf("%5s " + year, season);
		return(String.format("%-6s " + year + " | Credits: %2d" + "/" + CREDIT_LIMIT, season, totalCreditsTaken));
		//return(season + " " + year + " | Credits: " + totalCreditsTaken + "/" + CREDIT_LIMIT);
	}
	
}
