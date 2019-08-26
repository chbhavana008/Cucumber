package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

	WebDriver dr;

	@Given("^Open the Chrome and launch the application$")
	public void open_chrome_browser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();

		options.addArguments("--disable-notifications");
		options.addArguments("chrome.switches", "--disable-extensions");
		options.addArguments("--disable-save-password");
		options.addArguments("disable-infobars");

		dr = new ChromeDriver(options);

		dr.get("http://facebook.com");

		Thread.sleep(3000);

		System.out.println("This steps open the application in chrome browser");
	}

	@When("^Enter the Username and Password$")
	public void enter_user_name_pwd() {
		dr.manage().window().maximize();
		dr.findElement(By.id("email")).sendKeys("bhavana.karanth@gmail.com");
		// Storing password in web element
		WebElement password = dr.findElement(By.name("pass"));
		password.sendKeys("Sharmi23");
		System.out.println("this steps prints the username and pwd");
	}

	@Then("^Login should be sucessfull$")
	public void Login_sucess() {

		dr.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("Login should be sucessfull");

	}

	
	@Given("^Scroll down the page$") 
	public void scroll_down_the_page() throws InterruptedException {
	  	  
	JavascriptExecutor js = (JavascriptExecutor) dr;
	  
	  Thread.sleep(5000);
	  
	  js.executeScript("window.scrollBy(0,1000)");
	  
	  js.executeScript("arguments[0].scrollIntoView();",dr.findElement(By.xpath("//*[@id='userNavigationLabel']")));
	  
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  
	  }
	  
	@When("^Click on User navigation pane link$")
	public void click_on_User_navigation_pane_link() throws InterruptedException {
		dr.findElement(By.xpath("//*[@id='userNavigationLabel']")).click();
		Thread.sleep(5000);
	}

	@When("^Click on Logout link$")
	public void click_on_Logout_link() {
		dr.findElement(By.xpath("//span[@class='_54nh'][contains(.,'Log Out')]")).click();
	}

	@Then("^User should be logged out$")
	public void user_should_be_logged_out() {
		String actual = dr.getTitle();
		String expected = "facebook";
		Assert.assertEquals(actual, expected);
	}

}
