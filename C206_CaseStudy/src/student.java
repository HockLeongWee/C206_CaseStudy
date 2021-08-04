/*
 * I declare that this code was written by me. 
 * I will not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Izzat Zahirin
 * Student ID: 20042321
 * Class: E37E
 * Date/Time created: Monday 02-08-2021 16:41
 */

public class student {
	
	private String id;
	private String name; 
	private String grade;
	private String className;
	private String classroomTeacher;
	
	
	public student(String id, String name, String grade, String className, String classroomTeacher) {
		
	this.id = id;
	this.name = name;
	this.grade = grade;
	this.className = className;
	this.classroomTeacher = classroomTeacher;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
