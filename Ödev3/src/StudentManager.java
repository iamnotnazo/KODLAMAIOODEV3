
public class StudentManager  {
	
	public void add(Student student) {
		System.out.println("Kullan�c� ID eklendi : " + student.getLastName());
	}
	public void delete(Student student) {
		System.out.println("Kullan�c� ID silindi : " + student.getLastName());
	}
	public void update(Student student) {
		System.out.println("Kullan�c� ID g�ncellendi : " + student.getLastName());
	}
	
}
