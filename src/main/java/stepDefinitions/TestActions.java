package stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import com.sun.tools.doclets.internal.toolkit.Content;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;


public class TestActions {
	
	static OkHttpClient client = new OkHttpClient();
	static MediaType mediaType = MediaType.parse("application/json");



	

	public static void userEntersStudentInfo(String firstName, String lastName, String idVal, String nationality, String studentClass) throws IOException {
		int studentId = Integer.parseInt(idVal);
		RequestBody body = RequestBody.create(mediaType, "{ \"firstName\": \""+firstName+"\", \"id\": "+studentId+", \"lastName\": \""+lastName+"\", \"nationality\": \""+nationality+"\", \"studentClass\": \""+studentClass+"\"}");
		Request request = new Request.Builder()
				.url("http://localhost:9080/studentmgmt/addStudent").post(body)
				.addHeader("Accept", "*/*")
				.addHeader("Content-Type", "application/json").build();
		
				Response response = client.newCall(request).execute();
				
				Boolean isTwoHundred = (response.toString().contains("200"));
				
				Assert.assertTrue(isTwoHundred);

				
				
						
	}
	
	public static void userUpdatesStudentInfo(String firstName, String lastName, String idVal, String nationality, String studentClass) throws IOException {
		int studentId = Integer.parseInt(idVal);
		RequestBody body = RequestBody.create(mediaType, "{ \"firstName\": \""+firstName+"\", \"id\": "+studentId+", \"lastName\": \""+lastName+"\", \"nationality\": \""+nationality+"\", \"studentClass\": \""+studentClass+"\"}");
		Request request = new Request.Builder()
				.url("http://localhost:9080/studentmgmt/updateStudent").put(body)
				.addHeader("Accept", "*/*")
				.addHeader("Content-Type", "application/json").build();
		
				Response response = client.newCall(request).execute();
				
				Boolean isTwoHundred = (response.toString().contains("200"));
				
				Assert.assertTrue(isTwoHundred);

				
				
						
	}



	public static void userGetsInfoById(String val1) throws IOException {
				Request request = new Request.Builder()
				.url("http://localhost:9080/fetchStudents?id="+val1).get()
				.addHeader("Accept", "application/json")
				.addHeader("Content-Type", "application/json").build();
		
				Response response = client.newCall(request).execute();
				
				ResponseBody responseBody = response.body();
				String content = responseBody.string();			
				Assert.assertEquals(content.contains(val1), true);
				
				
						
	}
	
	public static void userGetsInfoBystudentClass(String val1) throws IOException {
		Request request = new Request.Builder()
		.url("http://localhost:9080/fetchStudents?studentClass="+val1).get()
		.addHeader("Accept", "application/json")
		.addHeader("Content-Type", "application/json").build();

		Response response = client.newCall(request).execute();
		
		ResponseBody responseBody = response.body();
		String content = responseBody.string();			
		Assert.assertEquals(content.contains(val1), true);
		
		
				
}
	
	public static void userGetsInfoByTwoVals(String val1, String val2) throws IOException {
		Request request = new Request.Builder()
		.url("http://localhost:9080/fetchStudents?fetchStudents?id="+val1+"&studentClass="+val2).get()
		.addHeader("Accept", "application/json")
		.addHeader("Content-Type", "application/json").build();

		Response response = client.newCall(request).execute();
		
		ResponseBody responseBody = response.body();
		String content = responseBody.string();			
		Assert.assertEquals(content.contains(val2), true);
		
		
				
}

	public static void userdeletesInfoById(String val1) throws IOException {
		int studentId = Integer.parseInt(val1);
		RequestBody body = RequestBody.create(mediaType, "{ \"id\": "+studentId+" }");
		Request request = new Request.Builder()
				.url("http://localhost:9080/studentmgmt/deleteStudent").delete(body)
				.addHeader("Accept", "*/*")
				.addHeader("Content-Type", "application/json").build();
		
				Response response = client.newCall(request).execute();
				
				Boolean isTwoHundred = (response.toString().contains("200"));
				
				Assert.assertTrue(isTwoHundred);
				
						
	}

	
		}
	


