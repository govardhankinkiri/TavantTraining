package Day1;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTest {

	@Test
	void test() {
		Temperature temp = new  Temperature();
		double out=temp.convertToFarenheit(0);
		assertEquals(32,out);
		
		double out1 = temp.convertToCelsius(32);
		assertEquals(0,out1);
	}

}
