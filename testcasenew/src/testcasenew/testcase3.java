package testcasenew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://elearningm1.upskills.in/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("I lost my password")).click();
		WebElement losspwd=driver.findElement(By.id("lost_password_user"));
		losspwd.sendKeys("priyadharshinimanoharan99@gmail.com");
		driver.findElement(By.id("lost_password_submit")).click();

	}

}
