
public class StudentManager  {
	
	public void add(Student student) {
		System.out.println("Kullanıcı ID eklendi : " + student.getLastName());
	}
	public void delete(Student student) {
		System.out.println("Kullanıcı ID silindi : " + student.getLastName());
	}
	public void update(Student student) {
		System.out.println("Kullanıcı ID güncellendi : " + student.getLastName());
	}
	
}
