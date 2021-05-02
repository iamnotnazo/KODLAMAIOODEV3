
public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " Kullanýcýsý Eklendi");
	}

	public void delete(User user) {
		System.out.println("Kullanýcý ID Silindi : " + user.getId());
	}

	public void update(User user) {
		System.out.println("Kullanýcý Þifresi Güncellendi : " + user.getPassword());

	}
	

}
