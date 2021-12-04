package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1_CreateContact {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Contacts")).click(); 
		
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Shruthi");
		
		driver.findElement(By.id("lastNameField")).sendKeys("Muthiah");
		
		driver.findElement(By.name("submitButton")).click();
		
		String firstname = driver.findElement(By.id("viewContact_firstName_sp")).getText();		
		
		System.out.println(firstname);
		
		String title = driver.getTitle();		
		System.out.println(title);	
		
		driver.close();



	}

}
