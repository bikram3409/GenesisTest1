package example;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class NewTest implements t {

	@Test
	  public void testgooglrsearch() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver","D:\\Users\\Devarajd.relevance\\Downloads\\geckodriver.exe\\");
		
		FirefoxProfile ffProfile= new FirefoxProfile();	
		ffProfile.setAcceptUntrustedCertificates(true);
		ffProfile.setAssumeUntrustedCertificateIssuer(false);
		DesiredCapabilities dc = new FirefoxOptions().setProfile(ffProfile).addTo(DesiredCapabilities.firefox()); 
		WebDriver driver = new FirefoxDriver (dc);
		driver.manage().window().maximize();

		Thread.sleep(2000);

		// Open URL
		driver.get("https://test.redington.market");
	  
		// Enter UserName 
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("pm20@mailinator.com");
		
		// Enter Password 
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("Pass@123");
				
		Thread.sleep(2000);

		 //This will read the CAPTCHA 
         String captchaValue = driver.findElement(By.xpath("html/body/app-root/ng-component/app-sign-in/section/div/div/div[2]/form/div[3]/div/label/div"
)).getText();  
		 System.out.println(captchaValue);
        driver.findElement(By.xpath(".//*[@id='captcha']")).sendKeys(captchaValue);
        
     // Click the Sign in button
        
        driver.findElement(By.xpath("html/body/app-root/ng-component/app-sign-in/section/div/div/div[2]/form/button")).click();

        System.out.println(driver.getTitle());

		//driver.quit();
}
}
