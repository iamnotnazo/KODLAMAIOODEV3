
public class InstructorManager {
	
	public void remove(Instructor instructor) {
		System.out.println("Kullanýcýnýn soyadý silindi : " + instructor.getFirstName());
		
	}
	public void add(Instructor instructor) {
		System.out.println("Kullanýcýnýn soyadý eklendi : " + instructor.getFirstName());
		
	}
	public void update(Instructor instructor) {
		System.out.println("Kullanýcýnýn soyadý güncellendi : " + instructor.getFirstName());
		
	}

}
