package com.hcl.test;




import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.hcl.model.Candidate;
import com.hcl.service.ElectionService;


public class ElectionTest {
	
	private static List<Candidate> candidateList ;
//	private static Candidate c1 ;
	private static Candidate c2;
	private static Candidate c3;
	private static Candidate c4;
	private static Candidate c5;
	private static Candidate c6;
	
	@BeforeClass
	public static void init()
	{
		candidateList = new ArrayList<Candidate>();
//		c1 = new Candidate("Ritesh", "Pant", LocalDate.parse("1970-01-07"), 40000, "Kharadi");
		c2 = new Candidate("Binay", "Pant", LocalDate.parse("1970-07-07"), 40000, "Kharadi");
		c3 = new Candidate("Binay", "Pant", LocalDate.parse("1970-08-11"), 40000, "Kharadi");
		c4 = new Candidate("Binay", "Atre", LocalDate.parse("1970-09-07"), 40000, "Kharadi");
		c5 = new Candidate("Ajay", "Gupta", LocalDate.parse("1970-07-07"), 40000, "Kharadi");
		c6 = new Candidate("Karan", "Singh", LocalDate.parse("1970-07-07"), 50000, "Kharadi");
//		candidateList.add(c1);
		candidateList.add(c2);
		candidateList.add(c3);
		candidateList.add(c4);
		candidateList.add(c5);
		candidateList.add(c6);
	}
	@Test
	public void sortByHighestVotesTest_1()	{
		Candidate winner = new ElectionService().findWinner(candidateList);
		assertEquals(c6, winner);
		assertEquals(new Integer(50000), winner.getNoOfVotes());
	}
	
	
	@Test
	public void sortByVotesFirstName_2()	{
//		candidateList.remove(candidateList.size()-1);
		Candidate winner = new ElectionService().findWinner(candidateList);
		assertEquals(c5, winner);
		assertEquals("Ajay", winner.getFirstName());
	}

	@Test
	public void sortByVotesFirstNameLastName_3()	{
		
		Candidate winner = new ElectionService().findWinner(candidateList);
		assertEquals(c4, winner);
		assertEquals("Atre", winner.getLastName());
	}
	
	@Test
	public void sortByVotesFirstNameLastNameDOB_4()	{
		
		Candidate winner = new ElectionService().findWinner(candidateList);
		assertEquals(c2, winner);
		assertEquals(LocalDate.parse("1970-07-07"), winner.getDob());
	}
	
	@After
	public void modifyTestData()
	{
		candidateList.remove(candidateList.size()-1);
	}
	
	@AfterClass
	public static void tearDown() {
		candidateList.clear();
		candidateList = null;
		c2=null;
		c3=null;
		c4=null;
		c5=null;
		c6=null;
	}
	
}
