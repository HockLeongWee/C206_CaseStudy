import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	
	private student s1;
	private student s2;
	
	private CategoryCCA category1;
	private CategoryCCA category2;
	private ArrayList<CategoryCCA> categoryList = new ArrayList<CategoryCCA>();
	private CategoryCCA string;
	private String categoryName;
	
	private CCA cca1;
	private CCA cca2;
	
	private ArrayList<CCA> listofCCAs = new ArrayList<CCA>();
	
	private ArrayList<student> studentList;

	@Before
	public void setUp() throws Exception {
		//Prepare test data
		s1 = new student(20042341, "Zane Tan", "P3", "W64G", "Desmond");
		s2 = new student(20358305, "Srinivas", "P2", "W64J", "Julia");
		
		studentList = new ArrayList<student>();
		
		category1 = new CategoryCCA("Sports", 1);
		category2 = new CategoryCCA("Science", 2);
		string = new CategoryCCA("Game", 3);
	}


	@After
	public void tearDown() throws Exception {
		s1 = null;
		s2 = null;
		studentList = null;
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	
	@Test
	public void addstudentTest() {
		// student list is not null, so that can add a new student - boundary
		assertNotNull("Check if there is valid student arraylist to add to", studentList);
		//Given an empty student list, after adding 1 student, the size of the list is 1 - normal
		//The student just added is as same as the first student of the list
		C206_CaseStudy.addStudent(studentList, s1);
		assertEquals("Check that student arraylist size is 1", 1, studentList.size());
		assertSame("Check that student is added", s1, studentList.get(0));
		
		//Add another student. test The size of the list is 2? -normal
		//The student just added is as same as the second student of the list
		C206_CaseStudy.addStudent(studentList, s2);
		assertEquals("Check that student arraylist size is 2", 2, studentList.size());
		assertSame("Check that student is added", s2, studentList.get(1));
	}
	
	@Test
	public void removestudentTest() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid student arraylist to delete student", studentList);
		
		//test if the list of students retrieved from the SourceCentre is empty -boundary
		studentList.add(s1);
		studentList.add(s2);
		
		assertEquals("Check that student arraylist size is 2", 2, studentList.size());
	    C206_CaseStudy.removeStudent(studentList,s2.getId());
		assertSame("Check that student has been deleted", s1, studentList.get(0));
		
		assertEquals("Check that student arraylist size is 1", 1, studentList.size());
	    C206_CaseStudy.removeStudent(studentList,s1.getId());
	}
	
//	@Test
//	public void retrieveAllstudentTest() {
//		// Test if student list is not null but empty -boundary
//		assertNotNull("Test if there is valid student arraylist to retrieve the student", studentList);
//		
//		//test if the list of students retrieved from the C206_CaseStudy is empty - boundary
//		String allstudent = C206_CaseStudy.retrieveAllstudent(studentList);
//		String testOutput = "";
//		assertEquals("Check that ViewAllstudentlist", testOutput, allstudent);
//		
//		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
//		studentList.add(s1);
//		studentList.add(s2);
//		assertEquals("Test that Camcorder arraylist size is 2", 2, studentList.size());
//		
//		//test if the expected output string same as the list of students retrieved from the C206_CaseStudy	
//		allstudent = C206_CaseStudy.retrieveAllstudent(studentList);
//		testOutput = String.format("%-10s %-30s %-10s %-10s %-20s\n", 20042341, "Zane Tan", "P3", "W64G", "Desmond");
//		testOutput += String.format("%-10s %-30s %-10s %-10s %-20s\n", 20358305, "Srinivas", "P2", "W64J", "Julia" );
//	
//		assertEquals("Test that ViewAllstudentlist", testOutput, allstudent);
//		
//	}
	
	@Test
	public void insertCategoryTest() {
		assertNotNull("Check if there is valid CategoryCCA arraylist to add to", categoryList);
		
		categoryList.add(category1);
		assertEquals("Check that CategoryCCA arraylist size is 1", 1, categoryList.size());
		assertSame("Check that Category is added", category1, categoryList.get(0));
		
		categoryList.add(category2);
		assertEquals("Check that CategoryCCA arraylist size is 2", 2, categoryList.size());
		assertSame("Check that Category is added", category2, categoryList.get(1));
	}
	
	@Test
	public void viewAllCCACategoryTest() {
		assertNotNull("Check if there is valid CategoryCCA arraylist to view", categoryList);
		
		categoryList.add(category1);
		assertEquals("Check that CategoryCCA arraylist size is 1", 1, categoryList.size());
		assertSame("Check that Category is added", category1, categoryList.get(0));
		
		assertFalse("Check if CategoryCCA arraylist is has null values", categoryList.isEmpty());
		
		String allCCACategory = "";
		String output = "";
		
		allCCACategory = C206_CaseStudy.viewAllCCACategory(categoryList);
		output = String.format("%3s %-5s %-10s\n", "No.", "ID", "NAME");
		output += String.format("%-3d %-5d %-10s\n", 1, 1, "Sports");
		
		assertEquals("Check that CategoryCCA arraylist size is 1", output, allCCACategory);
	}
	
	@Test
	public void deleteCategoryTest() {
		assertNotNull("Check if there is valid CategoryCCA arraylist to view", categoryList);
		
		categoryList.add(category1);
		assertEquals("Check that CategoryCCA arraylist size is 1", 1, categoryList.size());
		assertSame("Check that Category is added", category1, categoryList.get(0));
		
		categoryList.remove(category1);
		assertTrue("Check that CategoryCCA arraylist is empty", categoryList.isEmpty());
	}
	
	public void updateCategoryTest() {
		assertNotNull("Check if there is valid CategoryCCA ARRAYLIST to view", categoryList);
		
		categoryList.add(category1);
		assertEquals("Check that CategoryCCA arraylist size is 1", 1, categoryList.size());
		
		categoryList.remove(category1);
		assertEquals("Check that CategoryCCA arraylist size is 0", 0, categoryList.size());
		assertTrue("Check that CategoryCCA arraylist is empty", categoryList.isEmpty());
		
		categoryList.add(category2);
		assertEquals("Check that CategoryCCA arraylist size is 1", 1, categoryList.size());
		assertFalse("Check that CategoryCCA arraylist is empty", categoryList.isEmpty());
		assertSame("Check that Category is added", category2, categoryList.get(0));

	}
	
	@Test
	public void addCCATest() {
		assertNotNull("Check if there is valid cca arraylist to add to", listofCCAs);

		listofCCAs.add(cca1);
		assertEquals("Check that CCA arraylist size is 1", 1, listofCCAs.size());
		assertSame("Check that CCA is added", cca1, listofCCAs.get(0));
		
		listofCCAs.add(cca2);
		assertEquals("Check that CCA arraylist size is 2", 2, listofCCAs.size());
		assertSame("Check that CCA is added", cca2, listofCCAs.get(1));
	}
	
	@Test
	public void viewCCATest() {
		assertNotNull("Check if there is valid CCA arraylist to view", listofCCAs);
		
		listofCCAs.add(cca1);
		assertEquals("Check that CCA arraylist size is 1", 1, listofCCAs.size());
		assertSame("Check that CCA is added", cca1, listofCCAs.get(0));
		
		assertFalse("Check if CCA arraylist has null values", listofCCAs.isEmpty());
	}
	
	@Test
	public void deleteCCATest() {
		assertNotNull("Check if there is valid CCA arraylist", listofCCAs);
		
		listofCCAs.add(cca1);
		assertEquals("Check that CCA arraylist size is 1", 1, listofCCAs.size());
		assertSame("Check that CCA is added", cca1, listofCCAs.get(0));
		
		listofCCAs.remove(cca1);
		assertTrue("Check that CCA arraylist is empty", listofCCAs.isEmpty());
	}
	
	@Test
  public void parentLoginTest() {
    boolean isStudent = false;
    int studentID = 20042341;
    String CCARegID = "1234a";
    studentList.add(s1);
    studentList.add(s2);

    assertNotNull(studentList.get(0).getId());
    assertNotNull(studentList.get(0).getRegistrationId());

    for (int i = 0; i < studentList.size(); i++) {
      if (studentList.get(i).getId() == studentID && studentList.get(i).getRegistrationId() == CCARegID) {
        isStudent = true;
        System.out.println("The student ID entered is correct");
      }
    }

    if (isStudent == false) {
      System.out.println("The student ID entered is not correct");
    }
    assertEquals("Check if both Student ID and CCA Registration ID both exist in the studentList", true, isStudent);

  }

  @Test
  public void addStudentTest() {
    assertNotNull("Check student list is not null, so that can retrieve", studentList);
    assertNotNull("Check CCa list is not null, so that can add student into CCA", CCAList);
    assertEquals("Check that CCA List is now 1", CCAList.size());
    // student list is not null, so that can retrieve
    assertNotNull("Check student list is not null, so that can retrieve", studentList);
    // CCA list is not null, so that can retrieve
    assertNotNull("Check CCa list is not null, so that can retrieve", CCAList);
    // check string should not be null
    assertNotNull("check string not null");
    assertNotEquals("There is no any register student in CCA", CCAList);

  }

  @Test
  public void viewStudentTest() {
    assertNotNull("Check student list is not null", studentList);

  }

  @Test
  public void dropStudentTest() {
    C206_CaseStudy cl = new C206_CaseStudy();
    assertNotNull("Check if there is valid student to drop to", cl);
    C206_CaseStudy.dropStudentFromCCA(studentList, CCAList);
    // check the output contains then the registerd student id
    assertTrue("There is no student regsitered with the student ID!");
  }
}
