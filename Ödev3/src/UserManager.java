
public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " Kullan�c�s� Eklendi");
	}

	public void delete(User user) {
		System.out.println("Kullan�c� ID Silindi : " + user.getId());
	}

	public void update(User user) {
		System.out.println("Kullan�c� �ifresi G�ncellendi : " + user.getPassword());

	}
	

}
