package getRequestValidation;

import org.testng.Assert;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;

import io.restassured.http.Cookie;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.path.json.JsonPath.*;

public class TC_012_TestBodyResponseLamdaExp {
	
	/***
	 * 
	 * Test body parameters in response
	 * using java 8 lambda expression
	 */
	
	
	@Test
	public void testBodyParametersInResponse()
	{
		//equals to functions
		
		//given().get("https://jsonplaceholder.typicode.com/users/1").then().
		//body("username" , response -> equalTo("Bret"));
		
		given().get("https://jsonplaceholder.typicode.com/users/1").then().
		body("username" , response -> endsWith("et"));
		
		
	}

}
