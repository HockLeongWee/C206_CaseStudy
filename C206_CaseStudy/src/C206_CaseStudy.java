import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student student1 = new student("20042341", "Zane Tan", "P3", "W64G", "Desmond");
		student student2 = new student("20358305", "Srinivas", "P2", "W64J", "Julia");
		student student3 = new student("20058302", "Ezekiel", "P2", "W65D", "Leonard");
		
		ArrayList<student> studentList = new ArrayList<student>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		
		Admin admin = new Admin("Admin", "admin", "1");
		
		
		while (true) {

			C206_CaseStudy.loginMenu();
			String aName = Helper.readString("Enter name > ");
			String aPassword = Helper.readString("Enter password > ");
			String aID = Helper.readString("Enter admin ID > ");
			
			boolean isAdmin = C206_CaseStudy.doAdminLogin(admin, aName, aPassword, aID);
			
			if (isAdmin == false) {
				System.out.println("Either your name, password or ID was incorrect. Please try again!");
			}
			
			while (isAdmin) {
				C206_CaseStudy.adminMenu();
				int adminChoice = Helper.readInt("Enter choice > ");
				
				if (adminChoice == 1) { // VIEW STUDENT
					String allStudentList = C206_CaseStudy.scheduleListToString(studentList);
					System.out.println(allStudentList);
					System.out.println("Total number of students registered: " + C206_CaseStudy.getNumStudent(studentList));
					
				} else if (adminChoice == 2) { // ADD STUDENT
					String id = Helper.readString("Enter student ID > ");
					String name = Helper.readString("Enter student name > ");
					String grade = Helper.readString("Enter student grade > ");
					String className = Helper.readString("Enter class name > ");
					String classroomTeacher = Helper.readString("Enter teacher's name > ");
					
					student newStudent = new student(id, name, grade, className, classroomTeacher);
					
					boolean result = C206_CaseStudy.addStudent(studentList, newStudent);
					
					if (result == true) {
						System.out.println("Student added!");
					} else {
						System.out.println("Student NOT added, you must include all details!");
					}
				}else if (adminChoice == 3) { // UPDATE STUDENT
					
				
				}
				
			}
			
		}
		


	}
	
	
	
	// CLASS METHODS
		public static void loginMenu() {
			Helper.line(30, "-");
			System.out.println("SCHOOL CCA REGISTRATION - LOGIN");
			Helper.line(30, "-");
		}
		
		public static void adminMenu() {

			Helper.line(30, "-");
			System.out.println("SCHOOL CC REGISTRATION - ADMIN");
			Helper.line(30, "-");

			System.out.println("1. View all student account");
			System.out.println("2. Add new student account");
			System.out.println("3. Update student account");
			System.out.println("4. Remove student account");
			System.out.println("5. Log out");

		}
		
		public static boolean doAdminLogin(Admin admin, String aName, String aPassword, String aID) {    		
			if(admin.getName().equalsIgnoreCase(aName) && admin.getPassword().equals(aPassword) && admin.getAdminId().equals(aID)) {
			    return true;
		    }else{
				return false;
			}

		}
		
		public static String scheduleListToString(ArrayList<student> studentList) {
			
			String output = String.format("%-5s %-20s %-20s %-20s %-20s %-20s %-20s\n", "ID", "NAME", "GRADE", "CLASS NAME", "CLASSROOM TEACHER");
			for (int i = 0; i < studentList.size(); i++) {

				output += String.format("%-5d %-20s %-20s %-20s %-20s %-20s %-20s\n", studentList.get(i).getId(), studentList.get(i).getName(), studentList.get(i).getGrade(), studentList.get(i).getClassName(),
						studentList.get(i).getClassroomTeacher());
			}
			return output;
		}
		
		public static int getNumStudent(ArrayList<student> studentList) {

			return studentList.size();
		}
		
		public static boolean addStudent(ArrayList<student> studentList, student student) { 
			
			if (student.getId().isEmpty() && student.getName().isEmpty()&& student.getGrade().isEmpty()
				    && student.getClassName().isEmpty() && student.getClassroomTeacher().isEmpty())
				  {
				   return false;
				  }
				  else 
				  {
				   studentList.add(student);
				   return true;
				  }

		}

}
