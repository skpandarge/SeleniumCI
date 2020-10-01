import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.testng.annotations.Test;
  
public class ChromeLaunch {  
	
    //public static void main(String[] args) { 
		@Test
		public void launchcrome() {	
      
           // System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "C:\\SHIV\\Backup\\Selenium\\software\\selenium-server-standalone-3.141.59.jar");  
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
           // Launch Website 
		System.out.println("Launching website javatpoint");
        driver.navigate().to("http://www.javatpoint.com/");  
          
         //Maximize the browser  
          driver.manage().window().maximize();  
          
          //Scroll down the webpage by 5000 pixels  
        JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 5000)");   
          
         // Click on the Search button  
        driver.findElement(By.linkText("Core Java")).click();     
  
    }  
  
}  