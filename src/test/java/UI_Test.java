import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class UI_Test extends BaseUtils {
    WebDriver driver = new ChromeDriver();

@BeforeMethod
public void Setup(){
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.get("https://qachallenge-monetago.vercel.app/");
    }

    @Test
    public void Website_open () {
    WebElement Title = driver.findElement(By.xpath("//h1[normalize-space()='Average Movie Budget']"));
    Assert.assertEquals(Title.getText(),"Average Movie Budget");
    }

    @Test
    public void TC_001() {
    driver.findElement(By.xpath("//input[@placeholder='Search movies...']")).sendKeys("Mulan");

    }

 @AfterTest
   public void Close(){
   driver.quit();
    }
}
