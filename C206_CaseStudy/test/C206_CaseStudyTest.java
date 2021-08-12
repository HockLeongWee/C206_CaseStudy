import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	
	private student s1;
	private student s2;
	
	
	private ArrayList<student> studentList;

	@Before
	public void setUp() throws Exception {
		//Prepare test data
		s1 = new student(20042341, "Zane Tan", "P3", "W64G", "Desmond");
		s2 = new student(20358305, "Srinivas", "P2", "W64J", "Julia");
		
		studentList = new ArrayList<student>();
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
}
