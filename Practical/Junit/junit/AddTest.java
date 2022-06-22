package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	public void Addtest() {
		//Creating a object of class
		MyJunitClass junit=new MyJunitClass();
		int result=junit.add(8, 9);
		assertEquals(17, result);

	}

}
