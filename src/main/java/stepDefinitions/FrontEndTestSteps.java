package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;

public class FrontEndTestSteps {
	
	
	
	@Given("User enters username {string} and password {string}")
	public void user_enters_userNamePassword(String userName, String password) throws Throwable {
		
		FrontEndTestActions.user_enters_userNamePassword(userName, password);
		
}
	
	@Given("validates successful login")
	public void validatesSuccess() {
		
		FrontEndTestActions.validatesSuccess();
		
}

	@Given("^User navigates to Login Page$")
	public void user_is_on_Home_Page() throws Throwable {
		
		FrontEndTestActions.userNavigatesToLoginPage();
		
}
	
	@Given("validates unsuccessful login with {string} issue")
	public void validatesFailure(String issueVal) {
		
		FrontEndTestActions.validatesFailure(issueVal);
		
}

}
