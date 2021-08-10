
public class Parent {

	private String name;
	private String registerID;
	private String email;
	private int mobile;
	private int studentID;
	private String studentName;
	private String grade;
	private String classroom;
	private String teacher;
	
	public Parent(String name, String registerID, String email, int mobile, int studentID, String studentName,
			String grade, String classroom, String teacher) {
		super();
		this.name = name;
		this.registerID = registerID;
		this.email = email;
		this.mobile = mobile;
		this.studentID = studentID;
		this.studentName = studentName;
		this.grade = grade;
		this.classroom = classroom;
		this.teacher = teacher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegisterID() {
		return registerID;
	}

	public void setRegisterID(String registerID) {
		this.registerID = registerID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getClassroom() {
		return classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
	
	
}
