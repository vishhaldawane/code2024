import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	
	
	@Test
	public void testCase1() {
		System.out.println("Water is ready");
	}
	
	@Test
	public void testCase2() {
		System.out.println("Checking the status of the milk....");
		float requiredTempOfMilk=90;
		float currentTempOfMilk=92;
		
	Assertions.assertTrue(currentTempOfMilk > requiredTempOfMilk);
		System.out.println("Temperature of milk is ok...");

		String requiredColor="white";
		String currentColor="whiTE";
		
	Assertions.assertTrue(requiredColor.equalsIgnoreCase(currentColor));
		System.out.println("Milk is ready");
		
	}
	
	@Test
	public void testCase3() {
		System.out.println("Tea Powder is ready");
	}
	
	@Test
	public void testCase4() {
		System.out.println("Sugar / Jaggery Powder is ready");
	}
	
	@Test
	public void testCase5() {
		System.out.println("Started the process of making the tea");
	}
	
}
