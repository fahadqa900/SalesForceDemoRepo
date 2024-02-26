package SalesForce.CommerceTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SalesForceLoginTest extends SetupTearDown
{
  @Test(priority = 1)
  public static void getSalesForceLogin() 
  {
   driver.findElement(By.id("username")).sendKeys("fawwaz1@gmail.com");
   driver.findElement(By.id("password")).sendKeys("test@123");
   driver.findElement(By.id("Login")).click();
  }
  @Test(priority = 2)
  public static void navigateToCommerceModule() throws InterruptedException
  {
   Thread.sleep(5000);
   driver.findElement(By.xpath("//button[@class='slds-button slds-show']")).click();
   Thread.sleep(8000);
   driver.findElement(By.xpath("//button[text()='View All']")).click();
   Thread.sleep(5000);	  
   driver.findElement(By.xpath("//div[@type='search']")).sendKeys("Commerce");
   Thread.sleep(5000);
   driver.findElement(By.xpath("//a[@href='/lightning/app/06mGC0000044dyrYAA']")).click();
  }
  @Test(priority = 3)
  public static void navigateToAccountsModule() throws InterruptedException
  {
   Thread.sleep(5000);
   driver.findElement(By.xpath("//button[@title='Show Navigation Menu']")).click();
   Thread.sleep(3000);
   driver.findElement(By.xpath("//span[text()='Accounts']")).click();
  }
  @Test(priority = 4)
  public static void createNewAccount() throws InterruptedException
  {
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@title='New']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Dev1Account");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[text()='Save']")).click();
	Thread.sleep(8000);
	driver.findElement(By.xpath("//button[@title='Close Dev1Account | Account']")).click();
	Thread.sleep(3000);
	driver.navigate().refresh();
  }
  @Test(priority = 5)
  public static void editaddAccount() throws InterruptedException
  {
	Thread.sleep(8000);
	driver.findElement(By.xpath("//div[@class='slds-grid slds-grid--align-spread slds-align_absolute-center checkbox-container slds-checkbox uiInput forceVirtualCheckbox uiInput--default']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//a[@href='javascript:void(0);'])[12]")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//a[@title='Edit']")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//input[@name='Name']")).clear();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Dev2Account");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
    Thread.sleep(10000);
    driver.findElement(By.xpath("//a[@title='New']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Dev3Account");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[text()='Save']")).click();
	Thread.sleep(8000);
	driver.findElement(By.xpath("//button[@title='Close Dev3Account | Account']")).click();
	Thread.sleep(5000);
	driver.navigate().refresh();
  }
  @Test(priority = 6)
  public static void accountSearch() throws InterruptedException
  {
	 Thread.sleep(8000);
	 WebElement search1= driver.findElement(By.xpath("//input[@name='Account-search-input']"));
	 search1.sendKeys("Dev2Account");
	 Thread.sleep(3000);
	 WebElement element=driver.findElement(By.xpath("//div[@class='appName slds-context-bar__label-action slds-context-bar__app-name']"));
	 Actions action=new Actions(driver);
	 action.doubleClick(element).build().perform();
	 Thread.sleep(5000);
	 search1.clear();
	 Thread.sleep(5000);
	 WebElement search2= driver.findElement(By.xpath("//input[@name='Account-search-input']"));
	 search2.sendKeys("Dev3Account");
	 Thread.sleep(5000);
	 action=new Actions(driver);
	 action.doubleClick(element).build().perform();
	 Thread.sleep(5000);
	 search2.clear();
     Thread.sleep(5000);
     driver.navigate().refresh();
  }
  @Test(priority = 7)
  public static void navigateToContactsModule() throws InterruptedException
  {
   Thread.sleep(5000);
   driver.findElement(By.xpath("//button[@title='Show Navigation Menu']")).click();
   Thread.sleep(3000);
   driver.findElement(By.xpath("//a[@href='/lightning/o/Contact/home']")).click();
   }
  @Test(priority = 8)
  public static void createNewContact() throws InterruptedException
  {
   Thread.sleep(5000);
   driver.findElement(By.xpath("//button[text()='New']")).click();
   Thread.sleep(5000);
   driver.findElement(By.xpath("//*[@id=\"combobox-button-189\"]")).click();
   Thread.sleep(5000);
   driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Firdous");
   Thread.sleep(5000);
   driver.findElement(By.xpath("//button[text()='Save']")).click();
   Thread.sleep(5000);
   driver.findElement(By.xpath("//button[@title='Close Firdous | Contact']")).click();
   Thread.sleep(5000);
   driver.navigate().refresh();	  
  }
}
