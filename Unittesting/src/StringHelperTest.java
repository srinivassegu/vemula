import static org.junit.Assert.*;

import org.junit.Test;


public class StringHelperTest {

	@Test
	public void testTruncateAInFirst2Positions() {
	StringHelper helper=new StringHelper();
	String expectedOutput="";
	String actualOutput=helper.truncateInFirst2Positions("RTAA");
	assertEquals(expectedOutput,actualOutput);
	
	
	}
}
