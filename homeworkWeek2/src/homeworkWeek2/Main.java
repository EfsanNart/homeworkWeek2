package homeworkWeek2;

public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor(1,"Engin","Demirog");
        
		Course course1 = new Course(1, "Java + React");
		
		Instructor[] instructors = {instructor1};
		Course[] courses = {course1};
		
		for (Instructor instructor : instructors) {
			System.out.println(instructor.id+": "+instructor.firstName+" "+instructor.lastName);
		}
        for (Course course : courses) {
			
			System.out.println(course.id+": "+course.courseName);
			
		}
        CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course1);
	}

}
