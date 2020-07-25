package assignment8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testSolution {
	Solution sol=new Solution();
	
	@Test
	void testcase1() {
		assertEquals("BCD",sol.remove("ABCD"));
	}
	
	@Test
	void testcase2() {
		assertEquals("BC",sol.remove("AABC"));
	}
	
	@Test
	void testcase3() {
		assertEquals("BCD",sol.remove("BACD"));
	}
	
	@Test
	void testcase4() {
		assertEquals("BBACD",sol.remove("BBACD"));
	}
	
	@Test
	void testcase5() {
		assertEquals("",sol.remove("A"));
	}
	
	@Test
	void testcase6() {
		assertEquals("",sol.remove("AA"));
	}
	
	@Test
	void testcase7() {
		assertEquals("",sol.remove(""));
	}
	
	@Test
	void testcase8() {
		assertEquals("B",sol.remove("B"));
	}
	
	@Test
	void testcase9() {
		assertEquals("BB",sol.remove("BB"));
	}

}
