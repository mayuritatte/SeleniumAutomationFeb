package basicTest;

public class IBMAssert {

//	public static void main(String[] args) {
//		
//		
//		
//		//Create an Object
//		
//		IBMAssert obj = new IBMAssert(); 
//		
//		
//		
//		//new ChromeDriver();    //launch a chrome browser
//		
//		
//		//calling Method with method Name
//		obj.AssertEqual();
//		
//
//	}

	public void AssertEqual(String expectedValue, String actualValue) {

		if (expectedValue.equals(actualValue)) {

			System.out.println("Validation pass");

		}

		else {

			System.out.println("Validation failed");
			System.out.println("Actual Value are: " + actualValue);

		}

	}
	
	
	public void AssertEqual(int expectedValue, int actualValue) {

		if (expectedValue == actualValue) {

			System.out.println("Validation pass");

		}

		else {

			System.out.println("Validation failed");
			System.out.println("Actual Value are: " + actualValue);

		}

	}

	public void AssertEqual(String expectedValue, String actualValue, String errorMessage) {

		if (expectedValue.equals(actualValue)) {

			System.out.println("Validation pass");

		}

		else {

			System.out.println("Validation failed");
			System.out.println("Actual Value are: " + actualValue);
			System.out.println("Description: " + errorMessage);

		}

	}

}
