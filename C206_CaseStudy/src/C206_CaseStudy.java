import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList for Parent
		ArrayList<Parent> parentList = new ArrayList<Parent>();
		parentList.add(new Parent("Baba Lim", "1234a", "babalim@123.com", 91234567, 101, "Bobby Lim", 1, 1, "Mr Wee"));
		parentList.add(new Parent("Westin Tan", "1234b", "tinwes@123.com", 91345678, 102, "Timmy Neo", 1, 3, "Mr Tan"));

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
		studentList.add(new student(101, "Bobby Lim", "A", "Mr Wee", "1234c"));
		studentList.add(new student(102, "Timmy Neo", "A", "Mr Tan", "1234c"));

		// Skeleton Code, credits to Izzat and Jun Long for making it easier for me
		// (HockLeong) to create.
		int option = 0;
		int choice = 0;

		while (option != 4) {
			loginPage();
			option = Helper.readInt("Enter option > ");
			if (option == 1) {

				// Write Code on creating parents account with student information
				Parent parent = newParent();
				C206_CaseStudy.addParent(parentList, parent);

				// Also add student into the student array list when parents registering with
				// the student information

			} else if (option == 2) {
				// Write code for log in with student id & registration id
				parentLoginSystem(parentList);
				// Write code for view all category
				C206_CaseStudy.viewAllCCACategory(categoryList); // Show Category
				// Write code to allow user to select a category
				// Write code for view all CCA related to the category
				C206_CaseStudy.viewAllRelatedCCAs(listofCCAs, categoryList);
				// Write code to allow user to select a CCA - By Yi Jou
				C206_CaseStudy.addCCA(listofCCAs);
				// Write code to add student to CCA - By Jun Long

				// Write code to view student that's added to the CCA - By Izzat

			} else if (option == 3) {
				String userName = Helper.readString("Enter your username > "); // Jun Long
				String password = Helper.readString("Enter your password > ");
				if (userName.equals("Admin") && password.equals("admin")) {

					System.out.println("Login successfully! \n");
					while (choice != 9) {
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
							// Write code to add CCA with it's related Category
							C206_CaseStudy.viewAllRelatedCCAs(listofCCAs, categoryList);
						} else if (choice == 5) {
							// Write code to view all CCA with the related Category in it
						} else if (choice == 6) {
							// Write code to delete CCA with it's related Category
						} else if (choice == 7) {
							// Write code to view all registered parents
							C206_CaseStudy.viewAllParent(parentList);
						} else if (choice == 8) {
							// Write code to delete parents account ONLY after making sure that child is
							// registered. Else don't delete yet.
							C206_CaseStudy.deleteParent(parentList);

						} else if (choice == 9) {
							System.out.println("BYE");
						} else {
							System.out.println("Invalid choice");
						}
					}
				} else {
					System.out.println("Invalid password! \n");
				}
			} else if (option == 4) {
				System.out.println("BYE");
			} else {
				System.out.println("Invalid option.");
			}
		}

	}

	// write all your methods below here please thank you

	public static void loginPage() { // done by Hock Leong
		System.out.println("WELCOME");
		System.out.println("Enter 1 to Register for a parent account");
		System.out.println("Enter 2 to Login for CCA Registration");
		System.out.println("Enter 3 to Login for CCA Instructors / Coordinators");
		Helper.line(50, "-");
	}

	public static boolean parentLoginSystem(ArrayList<Parent> parentList) { // done by Jun Long
		System.out.println("WELCOME");
		int studentID = Helper.readInt("Enter your student ID > ");
		String ccaID = Helper.readString("Enter your CCA registration ID > ");
		String output = "";
		boolean isValid = false;
		for (int i = 0; i < parentList.size(); i++) {
			if (parentList.get(i).getStudentID() == (studentID) && parentList.get(i).getRegisterID().equals(ccaID)) {
				output += String.format("Login successfully for student ID %d\n", studentID);
				isValid = true;
				break;
			} else {
				output += String.format("Login failed for student ID %d\n", studentID);
				isValid = false;
				break;
			}
		}
		System.out.println(output);
		return isValid;

	}

	public static void ccaInstructor() { // done by Hock Leong
		System.out.println("WELCOME");
		System.out.println("============================");
		System.out.println("CCA Category");
		System.out.println("============================");
		System.out.println("1. Add a CCA Category");
		System.out.println("2. View all CCA Category");
		System.out.println("3. Delete a CCA Category");
		System.out.println("============================");
		System.out.println("CCA Category");
		System.out.println("============================");
		System.out.println("4. Add a CCA");
		System.out.println("5. View all CCA");
		System.out.println("6. Delete a CCA Category");
		System.out.println("============================");
		System.out.println("Parents");
		System.out.println("============================");
		System.out.println("7. View all registered parents");
		System.out.println("8. Delete a parent account");
		System.out.println("9. QUIT");
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

		if (categoryName.isEmpty()) {
			System.out.println("Please enter a Category Name");
		} else {
			for (int i = 0; i < categoryList.size(); i++) {
				if (categoryList.get(i).getCategoryName().equalsIgnoreCase(categoryName)) {
				} else {
					if (categoryList.get(i).equals(null) == false) {
						System.out.println(categoryName + " is already added!");
						categoryList.add(new CategoryCCA(categoryName,
								(i + categoryList.get(categoryList.size() - 1).getCategordID() + 1)));
						C206_CaseStudy.viewAllCCACategory(categoryList);
						break;
					} else {
						System.out.println("Don't ask me why it's empty");
					}
				}

			}
		}
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
		int grade = Helper.readInt("Enter child's grade > ");
		int classroom = Helper.readInt("Enter child's class > ");
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

			output += String.format("%-15s %-20s %-15d %-15d %-15s %-10d %-10d %-10s\n", parentList.get(i).getName(),
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

	public static void addCCA(ArrayList<CCA> listofCCAs) { // For HockLeong, add Category view inside, and keep the
															// selection of the category name
		String CCAname = Helper.readString("CCA name > "); // later on add the category based on the user selection
															// before adding a cca
		String CCAdescription = Helper.readString("CCA description > ");
		int CCAsize = Helper.readInt("Class size > ");
		String CCAday = Helper.readString("Day of the week > ");
		String CCAtime = Helper.readString("Time > ");
		String CCAvenue = Helper.readString("Venue > ");
		String CCAiic = Helper.readString("Name of CCA instructor in-charge > ");

		if (CCAname.isEmpty() && CCAdescription.isEmpty() && CCAday.isEmpty() && CCAtime.isEmpty() && CCAvenue.isEmpty()
				&& CCAiic.isEmpty()) {
			System.out.println("CCA not added.");
		} else {
			for (int i = 0; i < listofCCAs.size(); i++) {
				if (listofCCAs.get(i).equals(null) == false) {
					listofCCAs.add(
							new CCA(CCAname, CCAdescription, CCAsize, CCAday, CCAtime, CCAvenue, CCAiic, "none", 0));
					System.out.println("CCA added!");
					break;
				}
			}
		}
	}

	public static void viewCCAs(ArrayList<CCA> listofCCAs) {
		Helper.line(40, "-");

		String output = "";
		output += String.format("%-15s %-40s %-5s %-5s %-10s %-15s %-15s\n", "CCA Name", "Description", "Class Size",
				"Day of the week", "Time", "Venue", "Instructor Name");
		for (int i = 0; i < listofCCAs.size(); i++) {
			output += String.format("%-15s %-40s %-5d %-5s %-10s %-15s %-15s\n", listofCCAs.get(i).getName(),
					listofCCAs.get(i).getDescription(), listofCCAs.get(i).getClasssize(),
					listofCCAs.get(i).getDayoftheweek(), listofCCAs.get(i).getTime(), listofCCAs.get(i).getVenue(),
					listofCCAs.get(i).getInstructorname());
		}
		System.out.println(output);
	}

	public static void deleteCCA(ArrayList<CCA> listofCCAs) {
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

	public static void viewAllRelatedCCAs(ArrayList<CCA> listofCCAs, ArrayList<CategoryCCA> categoryList) { // Done by
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
	}

}
