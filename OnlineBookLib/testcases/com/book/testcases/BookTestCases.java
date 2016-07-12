package com.book.testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.library.service.BookImpl;

public class BookTestCases {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddBook() {
		//fail("Not yet implemented");
		Book book = new Book("ABC", "Jain", "Horror", 2000);
		BookImpl ref = (BookImpl)bookImpl;
		int initialSize = ref.getAllBooks()
	}

}
