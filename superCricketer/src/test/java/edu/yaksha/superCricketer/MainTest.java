package edu.yaksha.superCricketer;

import static org.junit.Assert.*;

import static edu.yaksha.superCricketer.TestUtils.*; 
import org.junit.Test;

public class MainTest {

	@Test
	public void testMain() throws Exception {
		yakshaAssert(currentTest(),true,businessTestFile);
	}
	
	@Test
    public void testExceptionConditon() throws Exception{
	 yakshaAssert(currentTest(),true,boundaryTestFile);
      }

	@Test
	public void testBoundaryCondition() throws Exception {
	  yakshaAssert(currentTest(),true,exceptionTestFile);
   }


}
