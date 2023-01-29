package quiz.testdriven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddedTest {
	
	Added added = new Added();

	@Test
	void addedTest() {
		assertEquals(4, added.add(2,2));
	}
	
	@Test
	void addedTest2() {
		assertEquals(34, added.add(22,12));
	}
	
	@Test
	void addedTest3() {
		assertEquals(22, added.add(12,10));
	}
}
