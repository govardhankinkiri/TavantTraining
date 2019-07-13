package Day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactTest {

	@Test
	void test() {
		Factorial fact =new Factorial();
		int out = fact.CalculateFactorial(5);
		assertEquals(120,out);
	}

}
