
import java.util.ArrayList;
import java.util.Random;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList for Parent
		ArrayList<Parent> parentList = new ArrayList<Parent>();
		parentList.add(new Parent("Baba Lim", "1234a", "babalim@123.com", 91234567, 20042341, "Srinivas", "P2", "W64J",
				"Julia"));
		parentList.add(new Parent("Westin Tan", "1234b", "tinwes@123.com", 91345678, 20358305, "Zane Tan", "P3", "W64G",
				"Desmond"));

		// ArrayList for CCA Categories
		ArrayList<CategoryCCA> categoryList = new ArrayList<CategoryCCA>();
		categoryList.add(new CategoryCCA("Sports", 1));
		categoryList.add(new CategoryCCA("Science", 2));

		// ArrayList for CCA
		ArrayList<CCA> listofCCAs = new ArrayList<CCA>();
		listofCCAs.add(new CCA("Badminton", "A sport where you use a racket and hit feather ball", 20, "Tuesday",
				"3:00pm-6:00pm", "Sports Hall", "Mr Desmond Lee", "Sports", 1));
		listofCCAs.add(new CCA("Soccer", "A sport where many people chase after 1 ball", 10, "Monday and Friday",
				"4:00pm-7:00pm", "Field", "Mr Tan Kok Cheng", "Sports", 1));
		listofCCAs.add(new CCA("Computer Science", "Enchancing the brain to it's maximum", 10, "Wednesday",
				"4:00pm-7:00pm", "Computer Lab 1", "Mr Andy Tao", "Science", 2));

		// ArrayList for Student
		ArrayList<student> studentList = new ArrayList<student>();
		studentList.add(new student(20042341, "Zane Tan", "P3", "W64G", "Desmond", "1234b"));
		studentList.add(new student(20358305, "Srinivas", "P2", "W64J", "Julia", "1234a"));
		studentList.add(new student(20018482, "Ezekiel", "P6", "W36D", "Mr Lim Yan", "1234c"));
		studentList.add(new student(20018482, "Danny", "P1", "W11D", "Ms Yeo", "1235w"));

		// Skeleton Code, credits to Izzat and Jun Long for making it easier for me
		// (HockLeong) to create.
		int option = 0;
		int choice = 0;

		while (option != 4) {
			loginPage();
			option = Helper.readInt("Enter option > ");
			if (option == 1) {

				// Write Code on creating parents account with student information
				String registerID = "";
				Parent parent = newParent(studentList, registerID);
				C206_CaseStudy.addParent(parentList, parent, studentList);

				// Also add student into the student array list when parents registering with
				// the student information

			} else if (option == 2) {
				// Write code for log in with student id & registration id
				boolean loged = parentLoginSystem(parentList);
				if (loged) {
					// Write code to view student that's added to the CCA - By Izzat
					choice = 0;
					while (choice != 3) {
						C206_CaseStudy.studentInstructor();
						choice = Helper.readInt("Enter choice > ");
						if (choice == 1) {
							C206_CaseStudy.viewAllCCACategory(categoryList); // Show Categor
							int id = C206_CaseStudy.viewAllRelatedCCAs(listofCCAs, categoryList);
							// Write code to add Student to CCA
							C206_CaseStudy.addStudentToCCA(listofCCAs, parentList, studentList, id);
						} else if (choice == 2) {
							// Write code to view all CCA Category
							C206_CaseStudy.dropStudentFromCCA(studentList, listofCCAs);
						} else if (choice == 3) {
							System.out.println("BYE");
						} else {
							System.out.println("Invalid choice");
						}
					}
				}

			} else if (option == 3) {
				String userName = Helper.readString("Enter your username > "); // Jun Long
				String password = Helper.readString("Enter your password > ");
				if (userName.equals("Admin") && password.equals("admin")) {

					System.out.println("Login successfully! \n");
					choice = 0;
					while (choice != 15) {
						C206_CaseStudy.ccaInstructor();
						choice = Helper.readInt("Enter choice > ");
						if (choice == 1) {
							// Write code to add CCA Category
							C206_CaseStudy.insertCategory(categoryList);
						} else if (choice == 2) {
							// Write code to view all CCA Category
							C206_CaseStudy.viewAllCCACategory(categoryList);
						} else if (choice == 3) {
							// Write code to delete CCA Category
							C206_CaseStudy.deleteCategory(categoryList);
						} else if (choice == 4) {
							C206_CaseStudy.updateCategory(categoryList);
						} else if (choice == 5) {

							// Write code to add CCA with it's related Category
							C206_CaseStudy.addCCA(listofCCAs, categoryList);
						} else if (choice == 6) {
							// View all CCA
							C206_CaseStudy.viewCCAs(listofCCAs);
						} else if (choice == 7) {
							// Write code to delete CCA
							C206_CaseStudy.deleteCCA(listofCCAs);
						} else if (choice == 8) {
							// Write code to view all registered parents
							C206_CaseStudy.viewAllParent(parentList);
						} else if (choice == 9) {
							// Write code to delete parents account ONLY after making sure that child is
							// registered. Else don't delete yet.
							C206_CaseStudy.deleteParent(parentList);

						} else if (choice == 10) {
							// Add Student
							C206_CaseStudy.AddStudent(studentList);
						} else if (choice == 11) {
							// View Student
							C206_CaseStudy.ViewStudent(studentList);///////////////////////// VIEW
						} else if (choice == 12) {
							// Delete Student
							C206_CaseStudy.DeleteStudent(studentList);////////////////////////// DELETE
						} else if (choice == 13) {
							// View Registered Student
							C206_CaseStudy.viewStudentOfCCa(studentList, listofCCAs);
						} else if (choice == 14) {

							// Add Student to CCA
							int id = C206_CaseStudy.viewAllRelatedCCAs(listofCCAs, categoryList);
							C206_CaseStudy.addStudentToCCA(listofCCAs, parentList, studentList, id);

						} else if (choice == 15) {
							System.out.println("BYE");
						} else {
							System.out.println("Invalid choice");
						}
					}
				} else {
					System.out.println("Login failed! \n");
				}
			} else if (option == 4) {
				System.out.println("BYE");
			} else {
				System.out.println("Invalid option.");
			}
		}

	}

	public static void updateCategory(ArrayList<CategoryCCA> categoryList) {
		String categoryName = Helper.readString("Category Name that you want to change > ");
		String newCategoryName = Helper.readString("The new Category Name you want to change to > ");
		int newCategoryID = Helper.readInt("New Category ID > ");
		String output = "";

		if (categoryName.equalsIgnoreCase(null) == false && newCategoryName.equalsIgnoreCase(null) == false) {
			for (int i = 0; i < categoryList.size(); i++) {
				if (categoryName.equalsIgnoreCase(categoryList.get(i).getCategoryName())) {
					categoryList.remove(i);
					CategoryCCA updatedCategory = new CategoryCCA(newCategoryName, newCategoryID);
					categoryList.add(i, updatedCategory);
					output = "Sucessfully Updated!";
					break;
				} else {
					output += "Can't find Category Name";
				}
			}
			System.out.println(output);
		}
	}

	private static void DeleteStudent(ArrayList<student> studentList) {/////////////////////////////// DELETE
		int deleteStudentId = Helper.readInt("Enter student ID > ");

		String studentDetails = C206_CaseStudy.getStudentById(studentList, deleteStudentId);

		if (!studentList.isEmpty()) {
			System.out.println(studentDetails);
			char toDelete = Helper.readChar("Do you wish to delete this student?(y/n) > ");

			if (toDelete == 'y') {
				boolean deleted = C206_CaseStudy.removeStudent(studentList, deleteStudentId);

				if (deleted == true) {
					System.out.println(String.format("Student %s was deleted successfully.", deleteStudentId));
				} else {
					System.out.println("Something went wrong, student was not deleted.");
				}
			}
		}
	}

	public static String getStudentById(ArrayList<student> studentList, int studentId) {//////////////////// DELETE

		String output = "";

		for (int i = 0; i < studentList.size(); i++) {
			student sl = studentList.get(i);

			if (sl.getId() == studentId) {
				output += String.format("%-15s %-20s %-20s %-20s %-20s \n", "ID", "NAME", "GRADE", "CLASS NAME",
						"CLASSROOM TEACHER");
				output += String.format("%-15s %-20s %-20s %-20s %-20s \n", sl.getId(), sl.getName(), sl.getGrade(),
						sl.getClassName(), sl.getClassroomTeacher());

			}
		}
		return output;
	}

	public static boolean removeStudent(ArrayList<student> studentList, int studentId) {///////////////////// DELETE

		boolean isChecked = false;

		for (int i = 0; i < studentList.size(); i++) {
			student a = studentList.get(i);
			if (a.getId() == studentId) {
				studentList.remove(i);
				isChecked = true;
				break;
			}
		}
		return isChecked;
	}

	private static void ViewStudent(ArrayList<student> studentList) {//////////////////////// VIEW
		String allStudentList = C206_CaseStudy.scheduleListToString(studentList);
		System.out.println(allStudentList);
		System.out.println("Total number of students registered: " + C206_CaseStudy.getNumStudent(studentList));
	}

	public static String scheduleListToString(ArrayList<student> studentList) {///////////////////////////////////////////////// VIEW

		String output = String.format("%-15s %-20s %-20s %-20s %-20s \n", "ID", "NAME", "GRADE", "CLASS NAME",
				"CLASSROOM TEACHER");
		for (int i = 0; i < studentList.size(); i++) {

			output += String.format("%-15s %-20s %-20s %-20s %-20s \n", studentList.get(i).getId(),
					studentList.get(i).getName(), studentList.get(i).getGrade(), studentList.get(i).getClassName(),
					studentList.get(i).getClassroomTeacher());
		}
		return output;
	}

	public static int getNumStudent(ArrayList<student> studentList) {//////////////////////////////////////////////// VIEW
		return studentList.size();
	}

	public static Parent newParent(ArrayList<student> studentList, String registerID) { // Hermione
		String name = Helper.readString("Enter name > ");
		String email = Helper.readString("Enter email > ");
		int mobile = Helper.readInt("Enter contact no. > ");
		int studentID = Helper.readInt("Enter child's student ID > ");
		String studentName = Helper.readString("Enter child's name > ");
		String grade = Helper.readString("Enter child's grade > ");
		String classroom = Helper.readString("Enter child's class > ");
		String teacher = Helper.readString("Enter classroom teacher's name > ");

		String ccaRegisterID = C206_CaseStudy.randomIdGenerator(studentList, registerID);

		Parent parent = new Parent(name, ccaRegisterID, email, mobile, studentID, studentName, grade, classroom,
				teacher);
		System.out.println("Your CCA Resgistration ID is " + ccaRegisterID);
		return parent;

	}

	public static void addParent(ArrayList<Parent> parentList, Parent parent, ArrayList<student> studentList) { // Hermione

		if (C206_CaseStudy.checkStudent(parentList, studentList, parent.getStudentName(),
				parent.getStudentID()) == true) {
			parentList.add(parent);
			System.out.println("Parent added.\n");
		} else {
			System.out.println("No student found.\n");
		}

	}

	public static boolean checkStudent(ArrayList<Parent> parentList, ArrayList<student> studentList, String name,
			int studentID) { // Hermione
		for (int i = 0; i < studentList.size(); i++) {
			if (name.equalsIgnoreCase(studentList.get(i).getName()) && studentID == studentList.get(i).getId()) {
				return true;
			}
		}
		return false;
	}

	public static String randomIdGenerator(ArrayList<student> studentList, String registerID) { // Hermione
		String letters = "abcdefghijklmnopqrstuvwxyz";
		String uniqueID = "";

		Random r = new Random();

		int number = r.nextInt((9999 - 1000) + 1) + 1000;
		uniqueID = number + letters.charAt(r.nextInt(letters.length())) + "";

		for (int j = 0; j < studentList.size(); j++) {
			if (uniqueID.equalsIgnoreCase(studentList.get(j).getRegistrationId())) {
				uniqueID = "";
				continue;
			}
		}
		return uniqueID;

	}

	// write all your methods below here please thank you
	public static void loginPage() { // done by Hock Leong
		System.out.println("WELCOME");
		System.out.println("Enter 1 to Register for a parent account");
		System.out.println("Enter 2 to Login for CCA Registration");
		System.out.println("Enter 3 to Login for CCA Instructors / Coordinators");
		Helper.line(50, "-");
	}

	public static void ccaInstructor() { // done by Hock Leong
		System.out.println("WELCOME");
		System.out.println("============================");
		System.out.println("CCA Category");
		System.out.println("============================");
		System.out.println("1. Add a CCA Category");
		System.out.println("2. View all CCA Category");
		System.out.println("3. Delete a CCA Category");
		System.out.println("4. Update a CCA Category");
		System.out.println("============================");
		System.out.println("CCA Category");
		System.out.println("============================");
		System.out.println("5. Add a CCA");
		System.out.println("6. View all CCA");
		System.out.println("7. Delete a CCA");
		System.out.println("============================");
		System.out.println("Parents");
		System.out.println("============================");
		System.out.println("8. View all registered parents");
		System.out.println("9. Delete a parent account");
		System.out.println("============================");
		System.out.println("Student");
		System.out.println("============================");
		System.out.println("10. Add Student");
		System.out.println("11. View Student");
		System.out.println("12. Delete Student");
		System.out.println("============================");
		System.out.println("Others");
		System.out.println("============================");
		System.out.println("13. View registered Student");
		System.out.println("14. Add Student to CCA");
		System.out.println("15. QUIT");
	}

	public static void viewAllCCACategory(ArrayList<CategoryCCA> categoryList) { // Done By Hock Leong
		String output = "";
		output += String.format("%3s %-5s %-10s\n", "No.", "ID", "NAME");
		for (int i = 0; i < categoryList.size(); i++) {
			output += String.format("%-3d %-5d %-10s\n", i + 1, categoryList.get(i).getCategordID(),
					categoryList.get(i).getCategoryName());
		}
		System.out.println(output);
	}

	public static void insertCategory(ArrayList<CategoryCCA> categoryList) { // Done By Hock Leong
		String categoryName = Helper.readString("Enter NEW Category Name > ");
		if (categoryName.isEmpty() == false) {
			if (checkDuplicateCategory(categoryName, categoryList) == false) {
				for (int i = 0; i < categoryList.size(); i++) {
					categoryList.add(new CategoryCCA(categoryName,
							(i + categoryList.get(categoryList.size() - 1).getCategordID() + 1)));
					break;
				}
				C206_CaseStudy.viewAllCCACategory(categoryList);
				System.out.println("No duplicates found");
			} else {
				System.out.println("Duplicates found");
			}
		} else {
			System.out.println("Please enter a name");
		}
	}

	public static boolean checkDuplicateCategory(String categoryName, ArrayList<CategoryCCA> categoryList) {
		for (int i = 0; i < categoryList.size(); i++) {
			if (categoryList.get(i).getCategoryName().equalsIgnoreCase(categoryName)) {
				return true;
			}
		}
		return false;
	}

	public static void deleteCategory(ArrayList<CategoryCCA> categoryList) { // Done by Hock Leong
		String categoryName = Helper.readString("Categpry Name > ");
		int categoryID = Helper.readInt("Category ID > ");

		if (categoryName.equalsIgnoreCase(null) == false) {
			for (int i = 0; i < categoryList.size(); i++) {
				if (categoryID == categoryList.get(i).getCategordID()
						&& categoryName.equalsIgnoreCase(categoryList.get(i).getCategoryName())) {
					categoryList.remove(i);
					System.out.println("Category successfully deleted.");
				} else {
					System.out.println("Please enter a category name from the list!");
				}
			}
		} else {
			System.out.println("Please enter a category name!");
		}
	}

	public static void setHeader(String header) { // Hermione
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

	public static Parent newParent() { // Hermione
		String name = Helper.readString("Enter name > ");
		String email = Helper.readString("Enter email > ");
		int mobile = Helper.readInt("Enter contact no. > ");
		int studentID = Helper.readInt("Enter child's student ID > ");
		String studentName = Helper.readString("Enter child's name > ");
		String grade = Helper.readString("Enter child's grade > ");
		String classroom = Helper.readString("Enter child's class > ");
		String teacher = Helper.readString("Enter classroom teacher's name > ");

		String ccaRegisterID = "1234c"; // Once the CCA registration thing done do change this hardcoded one

		Parent parent = new Parent(name, ccaRegisterID, email, mobile, studentID, studentName, grade, classroom,
				teacher);
		System.out.println("Your CCA Resgistration ID is " + ccaRegisterID);
		return parent;

	}

	public static void addParent(ArrayList<Parent> parentList, Parent parent) { // Hermione

		parentList.add(parent);
		System.out.println("Parent added");
	}

	public static boolean doDeleteParent(ArrayList<Parent> parentList, String name, int studentID) { // Hermione

		boolean isDeleted = false;

		for (int i = 0; i < parentList.size(); i++) {
			if (name.equalsIgnoreCase(parentList.get(i).getName()) && parentList.get(i).getStudentID() == studentID) {
				parentList.remove(i);
				isDeleted = true;

			}
		}
		return isDeleted;
	}

	public static void deleteParent(ArrayList<Parent> parentList) { // Hermione
		String name = Helper.readString("Enter name > ");
		int studentID = Helper.readInt("Enter student ID > ");
		Boolean isLoaned = doDeleteParent(parentList, name, studentID);
		if (isLoaned == false) {
			System.out.println("Invalid account");
		} else {
			System.out.println(name + "'s parent account has been deleted.");
		}
	}

	public static String retrieveAllParent(ArrayList<Parent> parentList) { // Hermione
		String output = "";

		for (int i = 0; i < parentList.size(); i++) {

			output += String.format("%-15s %-20s %-15d %-15d %-15s %-10s %-10s %-10s\n", parentList.get(i).getName(),
					parentList.get(i).getEmail(), parentList.get(i).getMobile(), parentList.get(i).getStudentID(),
					parentList.get(i).getStudentName(), parentList.get(i).getGrade(), parentList.get(i).getClassroom(),
					parentList.get(i).getTeacher());
		}
		return output;
	}

	public static void viewAllParent(ArrayList<Parent> parentList) { // Hermione
		C206_CaseStudy.setHeader("REGISTERED PARENTS");
		String output = String.format("%-15s %-20s %-15s %-15s %-15s %-10s %-10s %-10s\n", "NAME", "EMAIL",
				"CONTACT NO.", "STUDENT ID", "STUDENT NAME", "GRADE", "CLASS", "TEACHER");
		output += retrieveAllParent(parentList);
		System.out.println(output);

	}

	public static void addCCA(ArrayList<CCA> listofCCAs, ArrayList<CategoryCCA> categoryList) { // For HockLeong, add
		// Category view inside,
		// and keep the
		// selection of the
		// category name
		C206_CaseStudy.viewAllCCACategory(categoryList);
		int id = Helper.readInt("Please enter a cateogry ID > ");
		String categoryName = "";
		int categoryID = 0;
		String output = "";
		for (int i = 0; i < categoryList.size(); i++) {
			if (categoryList.get(i).getCategordID() == id) {
				categoryName = categoryList.get(i).getCategoryName();
				categoryID = categoryList.get(i).getCategordID();
				output += "Selected " + categoryName + " of category ID " + categoryID;
			}
		}
		System.out.println(output);
		String CCAname = Helper.readString("Enter a new CCA name > "); // later on add the category based on the user
		// selection before adding a cca
		String CCAdescription = Helper.readString("Enter a new CCA description > ");
		int CCAsize = Helper.readInt("Enter class size > ");
		String CCAday = Helper.readString("Enter day of the week > ");
		String CCAtime = Helper.readString("Enter time of CCA > ");
		String CCAvenue = Helper.readString("Enter Venue of CCA > ");
		String CCAiic = Helper.readString("Name of CCA instructor in-charge > ");

		if (CCAname.isEmpty() && CCAdescription.isEmpty() && CCAday.isEmpty() && CCAtime.isEmpty() && CCAvenue.isEmpty()
				&& CCAiic.isEmpty()) {
			System.out.println("CCA not added.");
		} else {
			for (int i = 0; i < listofCCAs.size(); i++) {
				if (listofCCAs.get(i).equals(null) == false) {
					listofCCAs.add(new CCA(CCAname, CCAdescription, CCAsize, CCAday, CCAtime, CCAvenue, CCAiic,
							categoryName, categoryID));
					System.out.println("CCA added!");
					break;
				}
			}
		}
	}

	public static void viewCCAs(ArrayList<CCA> listofCCAs) {
		Helper.line(40, "-");

		String output = "";
		output += String.format("%-20s %-80s %-12s %-20s %-15s %-18s %-15s\n", "CCA Name", "Description", "Class Size",
				"Day of the week", "Time", "Venue", "Instructor Name");
		for (int i = 0; i < listofCCAs.size(); i++) {
			output += String.format("%-20s %-80s %-12d %-20s %-15s %-18s %-15s\n", listofCCAs.get(i).getName(),
					listofCCAs.get(i).getDescription(), listofCCAs.get(i).getClasssize(),
					listofCCAs.get(i).getDayoftheweek(), listofCCAs.get(i).getTime(), listofCCAs.get(i).getVenue(),
					listofCCAs.get(i).getInstructorname());
		}
		System.out.println(output);
	}

	public static void deleteCCA(ArrayList<CCA> listofCCAs) {
		C206_CaseStudy.viewCCAs(listofCCAs);
		String name = Helper.readString("Enter CCA to delete > ");

		if (name.equalsIgnoreCase(null) == false) {
			for (int i = 0; i < listofCCAs.size(); i++) {
				if (name.equalsIgnoreCase(listofCCAs.get(i).getName())) {
					listofCCAs.remove(i);
					System.out.println("CCA deleted!");
				}
			}
		} else {
			System.out.println("Invalid CCA name");
		}
	}

	public static int viewAllRelatedCCAs(ArrayList<CCA> listofCCAs, ArrayList<CategoryCCA> categoryList) { // Done by
		// Hock
		// Leong
		int id = Helper.readInt("Enter the id you want to select > "); // Choose Category
		String output = "";
		output += String.format("%-20s %-52s %-12s %-20s %-15s %-18s %-15s\n", "CCA Name", "Description", "Class Size",
				"Day of the week", "Time", "Venue", "Instructor Name");
		for (int i = 0; i < listofCCAs.size(); i++) {
			if (listofCCAs.get(i).getCategordID() == id) {
				output += String.format("%-20s %-52s %-12d %-20s %-15s %-18s %-15s\n", listofCCAs.get(i).getName(),
						listofCCAs.get(i).getDescription(), listofCCAs.get(i).getClasssize(),
						listofCCAs.get(i).getDayoftheweek(), listofCCAs.get(i).getTime(), listofCCAs.get(i).getVenue(),
						listofCCAs.get(i).getInstructorname());
			}
		}

		System.out.println(output);
		return id;
	}

	public static String retrieveCCAStudent(ArrayList<student> studentList) { // Done by Jun Long
		String output = "";

		for (int i = 0; i < studentList.size(); i++) {

			output += String.format("%-15s %-20s %-15s %-15s %-15s\n", studentList.get(i).getName(),
					studentList.get(i).getGrade(), studentList.get(i).getClassName(),
					studentList.get(i).getClassroomTeacher(), studentList.get(i).getRegistrationId());

		}
		return output;
	}

	private static void viewStudentOfCCa(ArrayList<student> studentList) { // Done by Jun Long
		C206_CaseStudy.setHeader("CCA Added Students");
		String output = String.format("%-15s %-20s %-15s %-15s %-15s\n", "STUDENT NAME", "GRADE", "CLASS", "TEACHER",
				"REGISTRATION ID");
		output += retrieveCCAStudent(studentList);
		System.out.println(output);
	}

	private static void AddStudent(ArrayList<student> studentList) {/////////// ADD
		int id = Helper.readInt("Enter student ID > ");
		String name = Helper.readString("Enter student name > ");
		String grade = Helper.readString("Enter student grade > ");
		String className = Helper.readString("Enter class name > ");
		String classroomTeacher = Helper.readString("Enter teacher's name > ");

		student newStudent = new student(id, name, grade, className, classroomTeacher);

		boolean result = C206_CaseStudy.addStudent(studentList, newStudent);

		if (result == true) {
			student student = C206_CaseStudy.randomID(newStudent);
			System.out.println("Your CCA registration ID: " + student.getRegistrationId());
			System.out.println("Registration successful!");
		} else {
			System.out.println("Registration unsucessful, you must include all details!");
		}
	}

	public static student randomID(student student) {////////////////////////////////// ADD
		String randPassword = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890";
		String reset = "";
		Random rand = new Random();
		for (int i = 0; i < 5; i++) { // make it to 5 characters
			int outcome = rand.nextInt(62);
			char output = randPassword.charAt(outcome);
			reset += output;
		}
		reset = String.format("%s", reset);
		student.setRegistrationId(reset);

		return student;
	}

	public static boolean addStudent(ArrayList<student> studentList, student student) { //////////////////////// ADD

		if (student.getName().isEmpty() && student.getGrade().isEmpty() && student.getClassName().isEmpty()
				&& student.getClassroomTeacher().isEmpty()) {
			return false;
		} else {
			studentList.add(student);
			return true;
		}
	}

	public static int numberStudent(ArrayList<student> CCAList, int id) {// Done by Jun Long
		int count = 0;
		for (int i = 0; i < CCAList.size(); i++) {
			if (CCAList.get(i).getId() == id) {
				count++;
			}
		}
		return count;
	}

	public static String retrieveCCAStudent(ArrayList<student> studentList, ArrayList<CCA> CCAList) { // Done by Jun
																										// Long
		String output = "";

		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getId() < CCAList.size()) {
				int no = numberStudent(studentList, studentList.get(i).getId());
				output += String.format("%-15s %-20s %-15s %-15s %-15s      %-15s      %-15s\n",
						studentList.get(i).getName(), studentList.get(i).getGrade(), studentList.get(i).getClassName(),
						studentList.get(i).getClassroomTeacher(), studentList.get(i).getRegistrationId(),
						no + "/" + CCAList.get(studentList.get(i).getId()).getClasssize() + " students",
						CCAList.get(studentList.get(i).getId()).getName());
			}

		}
		return output;
	}

	public static void viewStudentOfCCa(ArrayList<student> studentList, ArrayList<CCA> CCAList) { // Done by Jun Long
		C206_CaseStudy.setHeader("CCA Added Students");
		String output = String.format("%-15s %-20s %-15s %-15s %-15s      %-15s      %-15s\n", "STUDENT NAME", "GRADE",
				"CLASS", "TEACHER", "REGISTRATION ID", "No of Students", "CCA Student In");
		String temp = retrieveCCAStudent(studentList, CCAList);
		if (!temp.isEmpty()) {
			output += temp;
			System.out.println(output);
		} else {
			System.out.println("There is no any register student in CCA");
		}

	}

	public static void studentInstructor() { // Done by Jun Long
		System.out.println("WELCOME");
		System.out.println("============================");
		System.out.println("CCA Student Registration");
		System.out.println("============================");
		System.out.println("1. Add Student into CCA");
		System.out.println("2. Drop Student from CCA");
		System.out.println("3. QUIT");
	}

	public static void dropStudentFromCCA(ArrayList<student> studentList, ArrayList<CCA> listofCCAs) { // done by
																										// Jun Long
		String name = Helper.readString("Enter Student ID > ");
		boolean exist = false;
		if (name.equalsIgnoreCase(null) == false) {
			for (int i = 0; i < studentList.size(); i++) {

				if (name.equalsIgnoreCase(studentList.get(i).getRegistrationId())) {
					boolean flag = true;
					exist = true;
					viewStudentCCAs(listofCCAs, studentList.get(i).getId());
					while (flag) {
						System.out.println("1. Drop CCA");
						System.out.println("2. Exit");
						int choice = Helper.readInt("Enter choice > ");
						if (choice == 1) {
							dropStudent(studentList, listofCCAs, i);
							flag = false;
						}
						if (choice == 2) {
							flag = false;
						}
					}

				}
			}
		}
		if (!exist) {
			System.out.println("There is no student regsitered with the student ID!");
		}
	}

	public static void dropStudent(ArrayList<student> studentList, ArrayList<CCA> listofCCAs, int i) {// done by Jun
																										// Long
		String choice = Helper.readString(" Are you sure you want to drop your child from this CCA?");
		if (choice.equalsIgnoreCase("yes")) {
			System.out.println(studentList.get(i).getName() + " dropped successfully from "
					+ listofCCAs.get(studentList.get(i).getId()).getName()
					+ ". And the student will be removed from the CCA.");
			studentList.remove(i);
		} else if (choice.equalsIgnoreCase("no")) {
			System.out.println(studentList.get(i).getName() + "failed to dropped from "
					+ listofCCAs.get(studentList.get(i).getId()).getName()
					+ ". And the student will not be removed from the CCA.");
		}
	}

	public static void viewStudentCCAs(ArrayList<CCA> listofCCAs, int catID) {// done by Jun Long
		Helper.line(40, "-");

		String output = "";
		output += String.format("%-15s %-40s %-5s %-5s %-10s %-15s %-15s\n", "CCA Name", "Description", "Class Size",
				"Day of the week", "Time", "Venue", "Instructor Name");

		output += String.format("%-15s %-40s %-5d %-5s %-10s %-15s %-15s\n", listofCCAs.get(catID).getName(),
				listofCCAs.get(catID).getDescription(), listofCCAs.get(catID).getClasssize(),
				listofCCAs.get(catID).getDayoftheweek(), listofCCAs.get(catID).getTime(),
				listofCCAs.get(catID).getVenue(), listofCCAs.get(catID).getInstructorname());

		System.out.println(output);
	}

	public static boolean parentLoginSystem(ArrayList<Parent> parentList) { // update by Jun Long
		System.out.println("WELCOME");
		int studentID = Helper.readInt("Enter your student ID > ");
		String ccaID = Helper.readString("Enter your CCA registration ID > ");
		String output = "";
		boolean isValid = false;
		for (int i = 0; i < parentList.size(); i++) {
			if (parentList.get(i).getStudentID() == (studentID) && parentList.get(i).getRegisterID().equals(ccaID)) {
				output = "Login successfully for student ID " + studentID + "\n";
				isValid = true;
				break;
			} else if (parentList.get(i).getStudentID() == (studentID)) {
				output = "Login Failed as the CCA Registration ID is invalid!";
				isValid = false;
				break;
			} else if (parentList.get(i).getRegisterID().equals(ccaID)) {
				output = "Login Failed as the Student ID is invalid!";
				isValid = false;
				break;
			} else {
				output = "Login Failed as both the Student ID and CCA Registration ID are invalid !";
			}
		}
		System.out.println(output);
		return isValid;

	}

	public static void addStudentToCCA(ArrayList<CCA> CCAList, ArrayList<Parent> pParentList,
			ArrayList<student> studentList, int id) { // Done by Jun Long
		Helper.line(50, "-");
		System.out.println("ADD STUDENT");
		String studentName = Helper.readString("Enter the student name > ");
		String ccaName = Helper.readString("Enter the CCA > ");
		int ccaId = -1;
		CCA cca = null;

		// getting CCA whose name is our given CCA
		for (int i = 0; i < CCAList.size(); i++) {
			if (ccaName.equalsIgnoreCase(CCAList.get(i).getName()) && CCAList.get(i).getCategordID() == id) {
				ccaId = i;
				cca = CCAList.get(i);
			}
		}
		// getting student details from parents by providing student name
		Parent lParent = null;
		for (int i = 0; i < pParentList.size(); i++) {
			if (studentName.equalsIgnoreCase(pParentList.get(i).getStudentName())) {

				lParent = pParentList.get(i);
			}
		}

		// add the student which and note we get all student details from cca and parent
		if (lParent != null && cca != null) {
			studentList.add(new student(ccaId, lParent.getStudentName(), (lParent.getGrade() + ""),
					lParent.getClassroom(), lParent.getTeacher(), (lParent.getStudentID() + "")));
			System.out.println("Student Added");
		} else if (studentName.isEmpty() && ccaName.isEmpty()) {
			System.out.println("Add Failed! Please fill in everything!");
		} else if (lParent == null && cca == null) {
			System.out.println("Student not added! As there is no student registered with that name in the CCA");
		} else if (lParent == null) {
			System.out.println("Student not added! As there is no student registered with that name.");
		} else if (cca == null) {
			System.out.println("The CCA does not exist!");
		}

	}
}
