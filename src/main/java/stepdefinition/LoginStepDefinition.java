package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	
	WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.crmpro.com/index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() throws Throwable {
		 String title = driver.getTitle();
		 System.out.println(title);
		 Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);

	}

	@Then("^user enters username and  password for$")
	public void user_enters_username_and_password_for() throws Throwable {
	    driver.findElement(By.name("username")).sendKeys("Jeyhun01");
	    driver.findElement(By.name("password")).sendKeys("789456");
	}
	

	@Then("^user clicking  on login button$")
	public void user_clicking_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//when login butto not working instea use this 
//		                    WebElement loginBtn =driver.findElement(By.xpath("//input[@type='submit']"));
//				            JavascriptExecutor js = (JavascriptExecutor)driver;
//				             js.executeScript("arguments[0].click();", loginBtn);
//				 

	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		 String title = driver.getTitle();
		 System.out.println("Home Page title ::"+ title);
          Assert.assertEquals("CRMPRO", title);
	}

	
	
	

}
