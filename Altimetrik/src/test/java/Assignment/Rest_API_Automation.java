package Assignment;

import static io.restassured.RestAssured.get;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import netscape.javascript.JSObject;

import static io.restassured.RestAssured.*;
import  io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Rest_API_Automation 
{
	@Test (priority=1)
	void TestGet() {
		
		Response resp = get("https://postman-echo.com/get?foo1=bar1&foo2=bar2");
		System.out.println(resp.asString());
		System.out.println(resp.getBody().asString());
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getHeader("Cotent-type"));
		System.out.println(resp.getTime());

		int statuscode = resp.getStatusCode();
		Assert.assertEquals(statuscode, 200);	
	}
	
	@Test (priority=2)
	public void TestPost() {
	
		Map<String, Object> mp = new HashMap<String, Object> ();
		RestAssured.baseURI = "POST /hi/there?hand=wave";
		mp.put("hand", "wave");
		System.out.println(mp);	
	}
	
	
}
