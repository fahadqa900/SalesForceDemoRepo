package SalesForce.CommerceTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

public class SetupTearDown 
{
static WebDriver driver;
@BeforeClass
public static void initializeBrowser()
{
	ChromeOptions option=new ChromeOptions();
	option.addArguments("disable-notifications");
	driver=new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://resourceful-badger-1ghy82-dev-ed.trailblaze.my.salesforce.com/");
}
}
