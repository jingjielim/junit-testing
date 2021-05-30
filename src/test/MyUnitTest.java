package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.MyUnit;

public class MyUnitTest {

	@Test
	public void testConcat() {
		MyUnit myUnit = new MyUnit();
		
		String result = myUnit.concat("one", "two");
		assertEquals("onetwo", result);
	}

}
