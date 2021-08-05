
//hello

public class student {
	
	private int id;
	private String name; 
	private String grade;
	private String className;
	private String classroomTeacher;
	
	
	public student(int id, String name, String grade, String className, String classroomTeacher) {
		
	this.id = id;
	this.name = name;
	this.grade = grade;
	this.className = className;
	this.classroomTeacher = classroomTeacher;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getClassroomTeacher() {
		return classroomTeacher;
	}
	public void setClassroomTeacher(String classroomTeacher) {
		this.classroomTeacher = classroomTeacher;
	}
}


