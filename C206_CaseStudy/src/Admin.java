//Hello
public class Admin {
	private String name;
	private String password;
	private String adminId;
	
	public Admin(String name, String password, String adminId) {
		super();
		this.name = name;
		this.password = password;
		this.adminId = adminId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAdminId() {
		return adminId;
	}
}

	
