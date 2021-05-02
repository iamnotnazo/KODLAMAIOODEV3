
public class StudentManager  {
	
	public void add(Student student) {
		System.out.println("Kullanýcý ID eklendi : " + student.getLastName());
	}
	public void delete(Student student) {
		System.out.println("Kullanýcý ID silindi : " + student.getLastName());
	}
	public void update(Student student) {
		System.out.println("Kullanýcý ID güncellendi : " + student.getLastName());
	}
	
}
