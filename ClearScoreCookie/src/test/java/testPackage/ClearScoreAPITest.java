package testPackage;
import org.junit.Assert;
import org.junit.Test;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class ClearScoreAPITest {
		
		@Test
		public void clearScoreAPI() throws UnirestException{
			HttpResponse<String> response = Unirest.post("https://api.clearscore.com/caesium-api/users/signIn")
					  .header("content-type", "application/json")
					  .header("cache-control", "no-cache")
					  .body("{\"email\":\"example1@gmail.com\", \"password\":\"WrongPW\"}")
					  .asString();
				  
		System.out.println(response.getStatus());
		Assert.assertEquals(403, response.getStatus());
		
		}

	}



//API test
//
//1. Go to webpage, firebug open.
//2. Click the action u want to test.
//3. Select the call, right click, and copy cURL.
//4. Paste cURL into notepad, separate the headers.
//(if the data is not in the cURL,click on post tab in firebug, and copy the JSON from there)
//5. Copy the endpoint (link from cURL), the method (POST or GET), and the JSON with the data into Postman, and run the call.
//6. If the response is what is expected, click on "Code" on the right (orange likn) in Postman, and select Java-Unirest fron dropdown.
//7. Copy the code into class in Eclipse.
//8. Delete the header line with Postman token.