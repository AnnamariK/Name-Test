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


