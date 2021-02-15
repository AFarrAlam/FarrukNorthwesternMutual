import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

@SuppressWarnings("unused")
public class NMgetReads {

		@Test
	void test_03_assertions() {
		given()
			.get("https://api.darksky.net/forecast/67d6aac020fb58bdbd635673bac38b2f/37.423021,-122.083739")
		.then()
			.statusCode(200)						//Step 3 #1. Status code is 200
			.body("latitude", is(37.423021f))		//Step 3 #2. latitude value is correct
			.body("longitude", is(-122.083739f));	//Step 3 #3. longitude value is correct
													//Step 3 #4. Data types for currently object property is valid
													//Apologies; did not understand what is #4 asking me to test.
	}// test_03_assertions

}// class
