package testcasenew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://elearningm1.upskills.in/");
		driver.manage().window().maximize();
		WebElement uname1=driver.findElement(By.id("login"));
		uname1.sendKeys("Priyadharshini");
		WebElement pwd3=driver.findElement(By.id("password"));
		pwd3.sendKeys("Priya@81099");
		driver.findElement(By.id("form-login_submitAuth")).click();
		System.out.println("Successfully logged in");
		driver.findElement(By.linkText("Edit profile")).click();
		WebElement pwd4=driver.findElement(By.id("profile_password0"));
		pwd4.sendKeys("Priya@81099");
		WebElement pwd5=driver.findElement(By.id("password1"));
		pwd5.sendKeys("priya81099");
		WebElement pwd6=driver.findElement(By.id("profile_password2"));
		pwd6.sendKeys("priya81099");
		driver.findElement(By.id("profile_apply_change")).click();
		System.out.println("profile updated successfully");
		driver.findElement(By.linkText("Homepage")).click();
		driver.findElement(By.xpath("//*[@href='#']")).click();
		driver.findElement(By.id("logout_button")).click();
		WebElement uname2=driver.findElement(By.id("login"));
		uname2.sendKeys("Priyadharshini");
		WebElement pwd7=driver.findElement(By.id("password"));
		pwd7.sendKeys("priya81099");
		driver.findElement(By.id("form-login_submitAuth")).click();
		

	}




	}


