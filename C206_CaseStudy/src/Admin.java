/*
 * I declare that this code was written by me. 
 * I will not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Izzat Zahirin
 * Student ID: 20042321
 * Class: E37E
 * Date/Time created: Monday 02-08-2021 21:28
 */

public class Admin {
	private String name;
	private String password;
<<<<<<< HEAD
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

	public void setAdminId(String adminId) {
=======
	private int adminId;
	
	public Admin(String name, String password, int adminId) {
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

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
>>>>>>> branch 'master' of https://github.com/HockLeongWee/C206_CaseStudy
		this.adminId = adminId;
	}
}
