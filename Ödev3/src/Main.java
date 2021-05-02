
public class Main {

	public static void main(String[] args) {
	
		User user = new User();
		user.setFirstName("Ahmet");
		user.setId(31);
		user.setPassword("9874");
		
		UserManager userManager = new UserManager();
		userManager.add(user);
		userManager.delete(user);
		userManager.update(user);
		
		System.out.println("----------------------");
		
		
		Instructor instructor = new Instructor();
		instructor.setFirstName("Başarılı.");
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.remove(instructor);
		instructorManager.add(instructor);
		instructorManager.update(instructor);
		
		System.out.println("----------------------");
		
		Student student = new Student();
		student.setLastName("Başarılı.");
		
		StudentManager studentManager = new StudentManager();
		studentManager.update(student);
		studentManager.add(student);
		studentManager.delete(student);
	

	}

}
