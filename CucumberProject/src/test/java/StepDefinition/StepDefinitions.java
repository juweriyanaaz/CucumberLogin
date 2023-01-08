package StepDefinition;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObject.LoginPage;
import cucumber.deps.com.thoughtworks.xstream.io.xml.WstxDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitions{
	
	public WebDriver driver;
	
	
	public LoginPage loginPg;
	
	  @Given("User launch chrome browser")
public void User_launch_chrome_browser() {
		 WebDriverManager.chromedriver().setup();
		 loginPg=new LoginPage(driver);
		 
	  }
@When("User opens URL {String}")
public void User_opens_URL(String url) {
driver.get(url);	
	
}
@When("User enters Email as{String}and password as {String}")
 public void User_enters_Email_as_and_password_as(String emailAdd,String pwd) {
	loginPg.enterEmail(emailAdd);
	loginPg.enterPassword(pwd);
}
@When("Click on login")
public void Click_on_login() {
	loginPg.clickOnLoginButton();
}
@Then("Page title should be{String}")
public void Page_title_should_be(String expectedTitle) {
	String actualTitle=driver.getTitle();
	if(actualTitle.equals(actualTitle)) {
	Assert.assertTrue(true);
}
	else {
		Assert.assertTrue(false);	
	}
	
}
@When("User click on logout link")
public void User_click_on_logout_link() {
	loginPg.clickOnLogOutButton();
	
}
@Then("Close browser")
public void Close_browser() {
	driver.close();
	driver.quit();
}

}
