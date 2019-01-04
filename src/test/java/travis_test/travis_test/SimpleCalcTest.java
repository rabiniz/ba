package travis_test.travis_test;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleCalcTest {

	@Test
	public void test() {
		
		SimpleCalc calc = new SimpleCalc();
		calc.add(3, 4);
		assertEquals( 7, calc.getResult());
	}

}
