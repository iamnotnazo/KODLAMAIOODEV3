
public class InstructorManager {
	
	public void remove(Instructor instructor) {
		System.out.println("Kullan�c�n�n soyad� silindi : " + instructor.getFirstName());
		
	}
	public void add(Instructor instructor) {
		System.out.println("Kullan�c�n�n soyad� eklendi : " + instructor.getFirstName());
		
	}
	public void update(Instructor instructor) {
		System.out.println("Kullan�c�n�n soyad� g�ncellendi : " + instructor.getFirstName());
		
	}

}
