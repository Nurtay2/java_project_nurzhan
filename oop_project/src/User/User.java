package User;

public abstract class User {
	private String first_name;
	private String last_name;
	private String login;
	private String password;
	private String email;
	private int id;
	private boolean isLog;
	
	public User(String first_name, String last_name, String login, String password, String email, int id) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.login = login;
		this.password = password;
		this.email = email;
		this.id = id;
		this.isLog = false;
	}

    public void auth(String enteredLogin, String enteredPassword) {
    	try {
	        if (login.equals(enteredLogin) && password.equals(enteredPassword)) {
	            isLog = true;
	            System.out.println("Authentication successful. Welcome, " + first_name + "!");
	        }
        	} 
    	catch(Exception e) {
            System.out.println("Authentication failed. Invalid username or password.");
        }
    }

    public void logout() {
    	try {
    		if (isLog) {
                isLog = false;
                System.out.println("Logout successful. Goodbye, " + first_name + "!");
        	}
    	}
    	catch(Exception e) {
            System.out.println("Logout failed. User is not currently logged in.");
    	}
    }

	public String getFirst_name() {
		return first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public String getEmail() {
		return email;
	}

	public int getId() {
		return id;
	}
    
    public void viewNews() {
    	
    }
	
    

}
