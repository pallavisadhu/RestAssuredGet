package RestAssured;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetReq {
	
	@Test
	public void getItem() {
		
		 Response response = RestAssured.get("https://70ssu4a992.execute-api.us-west-2.amazonaws.com/items/1");
		 System.out.println("==============================");
	        System.out.println(response.asString());
	        System.out.println(response.getStatusCode());
	        System.out.println(response.getStatusLine());
	       // System.out.println(response.getBody().asString());
	        System.out.println(response.getHeader("content-type"));
	        System.out.println(response.getTime());
	        Assert.assertEquals(response.getStatusCode(), 200);
		
		
	}
	
	@Test
	public void getAllItems() {
		
		Response response = RestAssured.get("https://70ssu4a992.execute-api.us-west-2.amazonaws.com/items");
		 System.out.println("==============================");
	        System.out.println(response.asString());
	        System.out.println(response.getStatusCode());
	        System.out.println(response.getStatusLine());
	       // System.out.println(response.getBody().asString());
	        System.out.println(response.getHeader("content-type"));
	        System.out.println(response.getTime());
	        Assert.assertEquals(response.getStatusCode(), 200);
		
	}

}
