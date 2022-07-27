// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class SignUpCorrectDetailsUnabletoverifyaccountTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void signUpCorrectDetailsUnabletoverifyaccount() {
    driver.get("https://www.konga.com/");
    driver.manage().window().setSize(new Dimension(1382, 744));
    {
      WebElement element = driver.findElement(By.cssSelector(".\\_41783_2ijjb:nth-child(7) > picture"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.linkText("Login / Signup")).click();
    {
      WebElement element = driver.findElement(By.linkText("Login / Signup"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.linkText("Don’t have an account? Sign Up"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.id("firstname")).click();
    driver.findElement(By.id("firstname")).sendKeys("Sunday");
    driver.findElement(By.id("lastname")).click();
    driver.findElement(By.id("lastname")).sendKeys("Olaoye");
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("decapolis520@gmail.com");
    driver.findElement(By.id("phone")).click();
    driver.findElement(By.id("phone")).sendKeys("09025993325");
    driver.findElement(By.cssSelector(".\\_460b6_SNRLa > #password")).click();
    driver.findElement(By.cssSelector(".\\_460b6_SNRLa > #password")).sendKeys("myself520");
    driver.findElement(By.cssSelector(".\\_2f3a3_3JCsL")).click();
    driver.findElement(By.id("pin")).click();
    driver.findElement(By.linkText("Resend")).click();
    driver.findElement(By.linkText("Resend")).click();
    driver.findElement(By.linkText("Resend")).click();
    {
      WebElement element = driver.findElement(By.linkText("Resend"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.cssSelector(".\\_460b6_SNRLa > #password")).click();
    driver.findElement(By.cssSelector(".bf973_YytIl")).click();
    driver.findElement(By.cssSelector(".\\_460b6_SNRLa > #password")).click();
    driver.findElement(By.cssSelector(".\\_460b6_SNRLa > #password")).sendKeys("hope520");
    driver.findElement(By.cssSelector(".\\_2f3a3_3JCsL")).click();
    driver.findElement(By.cssSelector(".\\_41d61_2xTI6")).click();
    assertThat(driver.findElement(By.cssSelector(".\\_460b6_SNRLa:nth-child(5) > .c1ba4_2Fcv7")).getText(), is("Unable to verify your account."));
    driver.close();
  }
}
