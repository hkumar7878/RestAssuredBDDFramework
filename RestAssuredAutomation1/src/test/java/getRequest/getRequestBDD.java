package getRequest;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

public class getRequestBDD {
	
	
	/*
	 * To verify the status code
	 */
	//@Test
	public void testStatusCode()
	{
		given().get("http://jsonplaceholder.typicode.com/posts/2").
		then().statusCode(200);
	}
	
	//@Test
	public void testLogging()
	{
		given().get("http://jsonplaceholder.typicode.com/posts/2").
		then().statusCode(200).log().all();
	}
	
	/*
	 * To verify single content using org.hamcrest.matches lib's equal to method
	 */

	
	@Test
	public void testEqualsToFunction()
	{
		try
		{
		given().get("http://services.groupkt.com/country/get/iso2code/IN").
		then().body("RestResponse.result.name", equalTo("India1"));
		}
		catch(Exception e)
		{
			e.getMessage();
			System.out.println("Error");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
