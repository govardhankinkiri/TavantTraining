package Day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfNumbersTest {

	@Test
	void test() {
		SumOfNumbers sum =new SumOfNumbers();
		int out = sum.SumOfEvenNumber(1, 10);
		assertEquals(30,out);
		
		int out1 = sum.SumOfOddNumber(1, 10);
		assertEquals(25,out1);
	}

}

