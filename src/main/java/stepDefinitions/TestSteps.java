package stepDefinitions;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.deps.com.google.gson.JsonObject;
import okhttp3.*;


public class TestSteps {
	
	
	
	

	

	
	@When("User enters first name {string}, last name {string} id {string}, nationality {string}, and class {string}")
	public void user_enters_UserName_and_Password(String firstName, String lastName, String idVal, String nationality, String studentClass) throws Throwable {
		
		TestActions.userEntersStudentInfo(firstName, lastName,idVal,nationality, studentClass);
	}
	
	@When("User updates first name {string}, last name {string} id {string}, nationality {string}, and class {string}")
	public void user_updates_UserName_and_Password(String firstName, String lastName, String idVal, String nationality, String studentClass) throws Throwable {
		
		TestActions.userUpdatesStudentInfo(firstName, lastName, idVal, nationality, studentClass);
	}
	
	@When("User get student value by ID with value {string}")
	public void user_get_student_value_with_id(String val1) throws Throwable {
		
		TestActions.userGetsInfoById(val1);
		
	}
	
	@When("User get student value by class with value {string}")
	public void user_get_student_value_with_class(String val1) throws Throwable {
		
		TestActions.userGetsInfoBystudentClass(val1);
		
	}
	
	@When("User get student value by ID {string} and class with value {string}")
	public void user_get_student_value_with_class(String val1, String val2) throws Throwable {
		
		TestActions.userGetsInfoByTwoVals(val1, val2);
		
	}
	
	@When("User deletes student value by ID with value {string}")
	public void user_deletes_student_value_with_id(String val1) throws Throwable {
		
		TestActions.userdeletesInfoById(val1);
		
	}
	
}
	



	
	
