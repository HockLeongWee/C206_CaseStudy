public class C206_CaseStudy {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		loginPage();
		int option = 0;

		option = Helper.readInt("Enter option > ");
		if (option == 1) {
// Write Code on creating parents account with student information
			
// Also add student into the student array list when parents registering with the student information

		} else if (option == 2) {
// Write code for log in with student id & registration id
			
// Write code for view all category
			//s
// Write code to allow user to select a category
			
// Write code for view all CCA related to the category
			
// Write code to allow user to select a CCA
			
// Write code to add student to CCA
			
// Write code to view student that's added to the CCA


		}else if (option == 3) {
			
// Write code to add CCA Category
			
// Wreit code to view all CCA Category

// Write code to delete CCA Category
			
// Write code to add CCA with it's related Category
			
// Write code to view all CCA with the relataed Category init
			
// Write code to delete CCA with it's related Category
			
// Write code to view all registered parents
			
// Write code to delete parents account ONLY after making sure that child is registered. Else don't delete yet.
			
		} else {
			System.out.println("Invalid option.");
		}

	}
	
	//write all your methods below here please thank you

	public static void loginPage() {
		System.out.println("WELCOME");
		System.out.println("Enter 1 to Register for a parent account");
		System.out.println("Enter 2 to Login for CCA Registration");
		System.out.println("Enter 3 to Login for CCA Instructors / Coordinators");
		Helper.line(50, "-");
	}
}
