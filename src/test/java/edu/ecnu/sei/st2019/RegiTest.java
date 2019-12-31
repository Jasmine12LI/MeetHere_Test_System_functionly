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
public class RegiTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void regi() {
    driver.get("http://localhost:8080/login");
    driver.manage().window().setSize(new Dimension(1004, 696));
    driver.findElement(By.id("app")).click();
    driver.findElement(By.cssSelector(".el-row:nth-child(1) input")).click();
    driver.findElement(By.cssSelector(".el-row:nth-child(1) input")).sendKeys("zhan");
    driver.findElement(By.cssSelector(".el-row:nth-child(2) input")).click();
    driver.findElement(By.cssSelector(".el-row:nth-child(2) input")).sendKeys("123");
    driver.findElement(By.cssSelector(".el-col:nth-child(2) span")).click();
    assertThat(driver.switchTo().alert().getText(), is("用户名已存在"));
    driver.findElement(By.cssSelector(".el-row:nth-child(1) input")).click();
    driver.findElement(By.cssSelector(".el-row:nth-child(1) input")).sendKeys("z");
    driver.findElement(By.cssSelector(".el-col:nth-child(2) > .el-button")).click();
    assertThat(driver.switchTo().alert().getText(), is("用户名或密码不合法"));
    driver.findElement(By.cssSelector(".el-row:nth-child(1) input")).click();
    driver.findElement(By.cssSelector(".el-row:nth-child(1) input")).sendKeys("zh");
    driver.findElement(By.cssSelector(".el-row:nth-child(2) input")).click();
    driver.findElement(By.cssSelector(".el-row:nth-child(2) input")).sendKeys("1");
    driver.findElement(By.cssSelector(".el-col:nth-child(2) > .el-button")).click();
    assertThat(driver.switchTo().alert().getText(), is("用户名或密码不合法"));
    driver.findElement(By.cssSelector(".el-row:nth-child(1) input")).click();
    driver.findElement(By.cssSelector(".el-row:nth-child(1) input")).sendKeys("z");
    driver.findElement(By.cssSelector(".el-col:nth-child(2) > .el-button")).click();
    assertThat(driver.switchTo().alert().getText(), is("用户名或密码不合法"));
    driver.findElement(By.cssSelector(".inputDiv > .el-row:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".el-row:nth-child(1) input")).click();
    driver.findElement(By.cssSelector(".el-row:nth-child(1) input")).sendKeys("zhangs");
    driver.findElement(By.cssSelector(".el-row:nth-child(2) input")).click();
    driver.findElement(By.cssSelector(".el-row:nth-child(2) input")).sendKeys("134");
    driver.findElement(By.cssSelector(".el-col:nth-child(2) span")).click();
    assertThat(driver.switchTo().alert().getText(), is("注册成功"));
    driver.close();
  }
}