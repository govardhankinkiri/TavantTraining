package Day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarkValidationTest {

	@Test
	void test() {
		MarkValidation Mark = new MarkValidation();
		String out = Mark.isPass(40);
		assertEquals("Pass",out);
		String out1 = Mark.markGrade(40);
		assertEquals("Grade D",out1);
	}

}
