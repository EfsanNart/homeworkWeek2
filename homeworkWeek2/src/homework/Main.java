package homework;

public class Main {

	public static void main(String[] args) {
		Instructor instructor=new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.seteMail("engin@gmail.com");
		instructor.setPassword("xxxx");
		instructor.setBranch("Software Developer");
		
		Student student=new Student();
		student.setId(2);
		student.setFirstName("Efşan");
		student.setLastName("Nart");
		student.seteMail("Efsan@gmail.com");
		student.setPassword("yyyy");
		student.setEducationLevel("Elementary");
		
		UserManager instructorManager=new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.delete(instructor);
		
	
		UserManager userManager= new StudentManager();
		userManager.add(student);
		userManager.delete(student);
	}
	
}
