<<<<<<< HEAD


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
=======
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
	private String parentName;
	private String parentEmail;
	private String contactNum;
	private boolean isAvailable;
	
	public student(String id, String name, String grade, String className, String classroomTeacher, String parentName,
			      String parentEmail, String contactNum, boolean isAvailable) {
		
	this.id = id;
	this.name = name;
	this.grade = grade;
	this.className = className;
	this.classroomTeacher = classroomTeacher;
	this.parentName = parentName;
	this.parentEmail = parentEmail;
	this.contactNum = contactNum;
	this.isAvailable = isAvailable;
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
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public String getParentEmail() {
		return parentEmail;
	}
	public void setParentEmail(String parentEmail) {
		this.parentEmail = parentEmail;
	}
	public String getContactNum() {
		return contactNum;
	}
	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
>>>>>>> branch 'master' of https://github.com/HockLeongWee/C206_CaseStudy
	}
}
