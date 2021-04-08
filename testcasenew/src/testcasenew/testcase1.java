package testcasenew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://elearningm1.upskills.in/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign up!")).click();
		WebElement fname=driver.findElement(By.id("registration_firstname"));
		fname.sendKeys("Priyadharshini");
		WebElement lname=driver.findElement(By.id("registration_lastname"));
		lname.sendKeys("Manoharan");
		WebElement email=driver.findElement(By.id("registration_email"));
		email.sendKeys("priyadharshinimanoharan99@gmail.com");
		WebElement uname=driver.findElement(By.id("username"));
		uname.sendKeys("Priyadharshini");
		WebElement pwd1=driver.findElement(By.id("pass1"));
		pwd1.sendKeys("Priya@81099");
		WebElement pwd2=driver.findElement(By.id("pass2"));
		pwd2.sendKeys("Priya@81099");
		WebElement phone=driver.findElement(By.id("registration_phone"));
		phone.sendKeys("9080803068");
		driver.findElement(By.id("registration_submit")).click();
		System.out.println("Successfully registered");
		driver.findElement(By.linkText("Homepage")).click();
		WebElement uname1=driver.findElement(By.id("login"));
		uname1.sendKeys("Priyadharshini");
		WebElement pwd3=driver.findElement(By.id("password"));
		pwd3.sendKeys("Priya@81099");
		driver.findElement(By.id("form-login_submitAuth")).click();
		System.out.println("Successfully logged in");
		
		
		
		


	}

}
