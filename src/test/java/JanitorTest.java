import static org.junit.Assert.assertEquals;

import org.junit.Test;

import employees.Janitor;

public class JanitorTest {

	@Test
	public void getSweeping() {
		Janitor newEmployee = new Janitor (null, 0, false);
		
		boolean actual = newEmployee.getSweeping();
		
		assertEquals(true, actual);
	}
	
	@Test
	public void shouldCalculatePay() {
		Janitor newEmployee = new Janitor (null, 0, false);
		
		String actual = newEmployee.calculatePay();
		
		assertEquals("$40,000", actual);
	}
}
