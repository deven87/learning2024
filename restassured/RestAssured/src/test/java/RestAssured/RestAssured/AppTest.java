package RestAssured.RestAssured;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

	RestRequests test = new RestRequests();
	RestRequests1 test1 = new RestRequests1();

	/**
	 * Rigorous Test :-)
	 */
	@Test (priority = 1, enabled = false)
	public void shouldAnswerWithTrue()
	{

		System.out.println("my first test method");



		test.getRequestexample();


	}

	@Test (priority = 2, enabled = false)
	public void createUser() throws FileNotFoundException {

		test.createUser1();
		/*
		test.createUser2();
		test.createUser3();
		test.createUser4();
		
		*/


	}

	@Test (priority = 3, enabled = false, dependsOnMethods = {"createUser"})
	public void updatedUser() {

		test.updateUser();


	}

	@Test (priority = 4, enabled = false, dependsOnMethods = {"createUser"})
	public void getUser() {

		test.getUser();


	}
	
	@Test (priority = 6, enabled = false)
	public void getUserWithPathAndParam() {

		test.sendParam();


	}
	
	@Test (priority = 7, enabled = false)
	public void getCookieHeader() {

		test.cookie();


	}
	
	@Test (priority = 8, enabled = false)
	public void getHeader() {

		test.headersInfo();


	}	
	
	@Test (priority = 9, enabled = false)
	public void compareResponseJson() throws IOException {

		test.parseResponse();


	}
	
	@Test (priority = 10, enabled = false)
	public void checkXML() throws IOException {

		test.xmlResponse();


	}
	
	@Test (priority = 11, enabled = false)
	public void checkSchema() throws IOException {

		test.jsonSchemaValidator();


	}
	
	@Test (priority = 12, enabled = false)
	public void checkSeralize() throws IOException {

		test.serializeAndDeserialize();


	}
	
	
	@Test (priority = 13, enabled = false)
	public void checkAuth() throws IOException {

		test.setAuth();


	}
	
	@Test (priority = 14, enabled = false)
	public void checkAPIAuth() throws IOException {

		test.setAPIKey();


	}
	
	@Test (priority = 15, enabled = true)
	public void checkAPIChainging() throws IOException, InterruptedException {

		test1.createUser();
		
		test1.getUser();
		
		test1.updateUser();
		
		test1.getUser();
		
		test1.deleteUser();
		
		test1.getUser();
		
	


	}
}
