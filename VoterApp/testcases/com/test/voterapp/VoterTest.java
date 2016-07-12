/**
 * 
 */
package com.test.voterapp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author proy3
 *
 */
public class VoterTest {

	/**
	 * @throws java.lang.Exception
	 */
	ElectionBooth booth = null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Voter Test started");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Voter test completed");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		booth = new ElectionBooth();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		booth = null;
	}

	@Test(expected=UnderAgeException.class)
	public void testUnderAge() throws UnderAgeException {
		booth.checkAge(15);
	}

	@Test
	public void testaboveAge()throws UnderAgeException{
		boolean check = booth.checkAge(21);
		assertEquals(true, check);
	}
	@Test
	public void testvalidvoterid()throws NoVoterIdException{
		assertEquals(true,booth.checkVoterId(234));
	}
	
	@Test(expected=NoVoterIdException.class)
	public void testvalidvoteridsmaller()throws NoVoterIdException{
		booth.checkVoterId(90);
	}
	@Test(expected=NoVoterIdException.class)
	public void testvalidvoteridgreater()throws NoVoterIdException{
		booth.checkVoterId(1003);
	}
	@Test
	public void testLocation() throws LocationMismatchException {
	assertEquals(true, booth.checkLocation("gurgaon"));	
	}
	
	@Test(expected=LocationMismatchException.class)
	public void testmismatchLocation() throws LocationMismatchException {
		 booth.checkLocation("patna");	
	}
	
	@Test
	public void testcheckVote() throws UnderAgeException, NoVoterIdException, LocationMismatchException {
	
		assertEquals(true,booth.checkVote(21,409,"kolkata"));
	}
	@Test(expected=UnderAgeException.class)
	public void testcheckageVote()throws UnderAgeException,NoVoterIdException,LocationMismatchException{
		assertEquals(true,booth.checkVote(16,564,"kolkata"));	
}
	@Test(expected=NoVoterIdException.class)
	public void testcheckidVote()throws UnderAgeException,NoVoterIdException,LocationMismatchException{
		assertEquals(true,booth.checkVote(25,1024,"kolkata"));
}
	@Test(expected=LocationMismatchException.class)
	public void testchecklocationVote()throws UnderAgeException,NoVoterIdException,LocationMismatchException{
		assertEquals(true,booth.checkVote(21,432,"noida"));
}
	
}