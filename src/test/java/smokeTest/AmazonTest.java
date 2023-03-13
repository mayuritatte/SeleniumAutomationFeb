package smokeTest;

import basicTest.IBMAssert;

//import basicTest.IBMAssert;

public class AmazonTest {

	public static void main(String[] args) {
		
		
		
		//Create an Object
		
		IBMAssert obj = new IBMAssert(); 
		
		
		String expectedTitle = "Amazon.in : iphone 14 pro";
		String actualTitle = "Amazon.in : iphone 14";
		
		obj.AssertEqual(expectedTitle, actualTitle, "error message ---- application title validation get failed");
		System.out.println("======================================");
		obj.AssertEqual(expectedTitle, actualTitle);
		System.out.println("======================================");
		obj.AssertEqual(101, 1011);

	}

}
