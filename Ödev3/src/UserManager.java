
public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " Kullanıcısı Eklendi");
	}

	public void delete(User user) {
		System.out.println("Kullanıcı ID Silindi : " + user.getId());
	}

	public void update(User user) {
		System.out.println("Kullanıcı Şifresi Güncellendi : " + user.getPassword());

	}
	

}
