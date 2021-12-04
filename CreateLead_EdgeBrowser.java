package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead_EdgeBrowser {

	public static void main(String[] args) {
		
		//setup the Edge Driver
		WebDriverManager.edgedriver().setup();
		
		//Launch the Edge Driver
		EdgeDriver driver = new EdgeDriver(); // static method call
		
		//Load the URL (method -->get--> "URL")
		driver.get("http://leaftaps.com/opentaps");
		
		//maximize browser
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("UST Global");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shruthi");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Muthiah");
		
		WebElement DD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select select = new Select(DD);
		
		select.selectByVisibleText("Employee");		
				
		driver.findElement(By.name("submitButton")).click();
		
		String text = driver.findElement(By.id("viewLead_dataSources_sp")).getText();
		
		System.out.println("text");
		
		//Get the title
		String title = driver.getTitle();
		System.out.println(title);
		
		//driver.close();
			

	}

}
