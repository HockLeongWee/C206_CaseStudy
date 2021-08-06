import java.util.ArrayList;
public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
					}else if(choice == 8) {
						// Write code to delete parents account ONLY after making sure that child is registered. Else don't delete yet.
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
	

}
