package homework;

public class InstructorManager extends UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kaydedildi.");
	}

	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " silindi.");
	}

}
