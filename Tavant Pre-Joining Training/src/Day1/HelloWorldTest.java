package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	void test() {
		HelloWorld prg = new HelloWorld();
		String output =prg.getMessage();
		assertEquals("HelloWorld",output);
		String output1 =prg.getMessage();
		assertEquals("HelloWorl",output1);
	}

}

