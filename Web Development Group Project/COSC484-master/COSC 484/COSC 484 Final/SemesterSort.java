//Imported Libraries
import java.util.ArrayList;

public class SemesterSort {

	
	/*
	 * Note: The courses are placed in the order declared in the major. It will follow then, a string of prerequisites 
	 * and place them first before stand alone classes if in that order. This means you could run into a fault where
	 * the line of prerequisites is too long for the existing amount of semesters causing it to deem all remaining classes
	 * as unplaceable even though there is room for those classes.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = StudentFactory.createStudent("John Smith", MajorFactory.createMajor_ComputerScience());
		ArrayList<Semester> workingPlan = SemesterFactory.createDegreePlan(2020, "Fall", 8);
		
		try {
			int index = 0;
			int shift;
			for(Course r: student.getMajor().getRequirements()) {
				shift = 0;
				
				Prereqs:
				for(Course p: r.getPrerequisites()) {				
					if(!student.getCompletedCourses().contains(p)) {
						//If the prerequisite exists in a given semester, move the placeholder to the next semester
						for(int i = 0; i < workingPlan.size(); i++) {
							for(int j = 0; j < workingPlan.get(i).getSemesterSchedule().size(); j++) {
								if(workingPlan.get(i).getSemesterSchedule().get(j).getName().compareTo(p.getName()) == 0) {
									shift += (i+1);
									continue Prereqs;
								}
							}
						}
						//Place prerequisite if it isn't already somewhere one the plan.
						if(workingPlan.get(index).hasRoomToAdd(p)) {
							workingPlan.get(index).addCourse(p);
							shift += 1;
						}else{
							workingPlan.get(index + 1).addCourse(p);
							shift += 2;
						}
					}
				}
				
				//Place current class in its appropriate spot
				if(workingPlan.get(index + shift).hasRoomToAdd(r)) {
					workingPlan.get(index + shift).addCourse(r);
				}else {
					workingPlan.get(index + shift + 1).addCourse(r);
				}
				
				//If the current semester is full, move on to the next one
				if(workingPlan.get(index).getTotalCreditsTaken() + 3 > 19) {
					index++;
				}
			}
		}catch(NullPointerException e) {
			System.out.println(e);
		}catch(IndexOutOfBoundsException e) {
			//Display classes not placed due to lack of room
			ArrayList<Course> leftover = new ArrayList<Course>();
			ArrayList<Course> classes = new ArrayList<Course>();
			for(Course r: student.getMajor().getRequirements()) {
				for(Course p: r.getPrerequisites()) {
					classes.add(p);
				}
				classes.add(r);
			}
			
			for(Course p: classes) {
				for(int i = 0; i < workingPlan.size(); i++) {
					if(!workingPlan.get(i).getSemesterSchedule().contains(p)) {
						if(i+1 == workingPlan.size()) {
							leftover.add(p);
						}else {
							continue;
						}
					}else {
						break;
					}
				}
			}
			
			System.out.println(e);
			System.out.println("Unable to place course(s), manual placement may be neccessary");
			for(Course c: leftover) {
				System.out.println(c);
			}
			
			
		}catch(Exception e) {
			System.out.println("Wasabi");
			System.out.println(e);
		}
		
		
		printPlan(workingPlan);
		
	}
	
	public static void printPlan(ArrayList<Semester> plan) {
		System.out.println();
		for(Semester s: plan) {
			System.out.println(s);
			for(Course c: s.getSemesterSchedule()) {
				System.out.println(c);
			}
		}
	}

}
