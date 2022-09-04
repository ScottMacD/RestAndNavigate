package stepDefinitions;

import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrontEndTestActions {
	
	private static WebDriver fdriver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(fdriver, 10);
	static Boolean isEqual;
	
	public static void userNavigatesToLoginPage() {
		fdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		fdriver.get("http://the-internet.herokuapp.com/login");		
	}

	public static void user_enters_userNamePassword(String userName, String password) {
		fdriver.findElement(By.cssSelector("input[id='username']")).sendKeys(userName);
		fdriver.findElement(By.cssSelector("input[id='password']")).sendKeys(password);
		fdriver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();
		
	}

	public static void validatesSuccess() {
		String successActual = fdriver.findElement(By.xpath("//*[@id=\"flash\"]")).getText();
		String successExpected = "You logged into a secure area!";

		isEqual = successActual.contains(successExpected);
				
	}

	public static void validatesFailure(String issueVal) {
		String successActual = fdriver.findElement(By.xpath("//*[@id=\"flash\"]")).getText();	
	

		if(issueVal.equals("password")) {
		String successExpected = "Your password is invalid!";
		isEqual = successActual.contains(successExpected);
		Assert.assertTrue(isEqual);
		}else if(issueVal.equals("username")) {
			String successExpected = "Your username is invalid!";
			isEqual = successActual.contains(successExpected);
			Assert.assertTrue(isEqual);
		}else {
			System.out.println("Error not found!");
		}
	}	

}
