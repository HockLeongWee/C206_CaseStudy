import java.util.ArrayList;
public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ArrayList for Parent
		ArrayList<Parent> parentList = new ArrayList<Parent>();
		parentList.add(new Parent("Baba Lim", "1234a", "babalim@123.com", 91234567, 101, "Bobby Lim", 1, 1, "Mr Wee"));
		parentList.add(new Parent("Westin Tan", "1234b", "tinwes@123.com", 91345678, 102, "Timmy Neo", 1, 3, "Mr Tan"));
		
		// ArrayList for CCA Categories
		ArrayList<CategoryCCA>categoryList = new ArrayList<CategoryCCA>();
		categoryList.add(new CategoryCCA("Sports", 1));
		categoryList.add(new CategoryCCA("Science", 2));
		
		// Skeleton Code, credits to Izzat and Jun Long for making it easier for me (HockLeong) to create.		
		int option = 0;
		int choice = 0; 

		while(option != 4) {
			loginPage();
			option = Helper.readInt("Enter option > ");
			if (option == 1) {
				
				// Write Code on creating parents account with student information
				Parent parent = newParent();
				C206_CaseStudy.addParent(parentList, parent);
				
	// Also add student into the student array list when parents registering with the student information

			} else if (option == 2) {
					// Write code for log in with student id & registration id
					// Write code for view all category
					C206_CaseStudy.viewAllCCACategory(categoryList);
					// Write code to allow user to select a category
					int id = Helper.readInt("Enter the id you want to select > ");
					// Write code for view all CCA related to the category
					// continue by Hock Leong ^^
				
	// Write code to allow user to select a CCA - By Yi Jou
				
	// Write code to add student to CCA - By Yi Jou
				
	// Write code to view student that's added to the CCA - By Izzat


			}else if (option == 3) {
				while (choice != 9) {
					C206_CaseStudy.ccaInstructor();
					choice = Helper.readInt("Enter choice > ");
					if(choice == 1) {
						// Write code to add CCA Category 
						C206_CaseStudy.insertCategory(categoryList);
					}else if(choice == 2) {
						// Write code to view all CCA Category
						C206_CaseStudy.viewAllCCACategory(categoryList);
					}else if(choice == 3) {
						// Write code to delete CCA Category
						C206_CaseStudy.deleteCategory(categoryList);
					}else if(choice == 4) {
						// Write code to add CCA with it's related Category
					}else if(choice == 5) {
						// Write code to view all CCA with the related Category in it
					}else if(choice == 6) {
						// Write code to delete CCA with it's related Category
					}else if(choice == 7) {
						
						// Write code to view all registered parents
						C206_CaseStudy.viewAllParent(parentList);
						
					}else if(choice == 8) {
						
						// Write code to delete parents account ONLY after making sure that child is registered. Else don't delete yet.
						C206_CaseStudy.deleteParent(parentList);
						
					}else if(choice == 9) {
						System.out.println("BYE");
					}else{
						System.out.println("Invalid choice");
					}
				}
			} else if(option == 4){
				System.out.println("BYE");
			}else {
				System.out.println("Invalid option.");
			}
		}

	}
	
	//write all your methods below here please thank you

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
	
	public static void viewAllCCACategory(ArrayList <CategoryCCA> categoryList) { // Done By Hock Leong
		String output = "";
		output += String.format("%3s %-5s %-10s\n", "No.", "ID", "NAME");
		for(int i = 0; i < categoryList.size(); i++) {
			output += String.format("%-3d %-5d %-10s\n",i + 1, categoryList.get(i).getCategordID(), categoryList.get(i).getCategoryName());
		}System.out.println(output);
	}
	
	public static void insertCategory(ArrayList<CategoryCCA> categoryList) { // Done By Hock Leong
		String categoryName = Helper.readString("Enter NEW Category Name > ");
		
		if(categoryName.isEmpty()) {
			System.out.println("Please enter a Category Name");
		}else {
			for(int i = 0; i < categoryList.size(); i++) {
				if(categoryList.get(i).equals(null)==false) {

					categoryList.add(new CategoryCCA(categoryName, (i + categoryList.get(categoryList.size()-1).getCategordID() + 1 )));	
					C206_CaseStudy.viewAllCCACategory(categoryList);
					break;
				}else {
					System.out.println("Don't ask me why it's empty");
				}

			}
		}
	}
	
	public static void deleteCategory(ArrayList<CategoryCCA> categoryList) { // Done by Hock Leong
		String categoryName = Helper.readString("Categpry Name > ");
		int categoryID = Helper.readInt("Category ID > ");
		
		if(categoryName.equalsIgnoreCase(null) == false) {

			for(int i =0; i < categoryList.size(); i++) {
				if(categoryID == categoryList.get(i).getCategordID() && categoryName.equalsIgnoreCase(categoryList.get(i).getCategoryName())) {
					categoryList.remove(i);	
					System.out.println("Category successfully deleted.");
				}
			}
		}else {
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

		Parent parent= new Parent(name, ccaRegisterID, email, mobile, studentID, studentName, grade, classroom, teacher);
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
			if (name.equalsIgnoreCase(parentList.get(i).getName())
					&& parentList.get(i).getStudentID() == studentID) {
				
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

			output += String.format("%-15s %-20s %-15d %-15d %-15s %-10d %-10d %-10s\n",
					parentList.get(i).getName(), parentList.get(i).getEmail(),
					parentList.get(i).getMobile(), parentList.get(i).getStudentID(),
					parentList.get(i).getStudentName(), parentList.get(i).getGrade(),
					parentList.get(i).getClassroom(),parentList.get(i).getTeacher());
		}
		return output;
	}
	
	public static void viewAllParent(ArrayList<Parent> parentList) { // Hermione
		C206_CaseStudy.setHeader("REGISTERED PARENTS");
		String output = String.format("%-15s %-20s %-15s %-15s %-15s %-10s %-10s %-10s\n",
				"NAME", "EMAIL", "CONTACT NO.", "STUDENT ID","STUDENT NAME", "GRADE", "CLASS", "TEACHER");
		 output += retrieveAllParent(parentList);	
		System.out.println(output);

	}

}
