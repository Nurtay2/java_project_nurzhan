package User;

import java.util.Vector;

public class Admin extends User{

	private Vector<User> users;
	
	public Admin(String first_name, String last_name, String login, String password, String email, int id) {
		super(first_name, last_name, login, password, email, id);
		this.users = null;
	}
	
	public void addUser(User s) {
		users.add(s);
	}
	
	public void deleteUser(User s) {
		if(users.contains(s)) {
			users.remove(s);
		}
		else {
			System.out.println("No such user");
		}
	}
	
	
	

}
