import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchHW {

    WebDriver wd;

    @BeforeMethod
    public void SetUp(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.navigate().to("https://www.zap.co.il/");
    }

    @Test
    public void Test2(){
        wd.findElement(By.cssSelector(".more_butt_box")).click();
        wd.findElement(By.cssSelector(".link_06")).click();
    }


    @AfterMethod(enabled = false)
    public void tearDown() {
        wd.quit();
    }
}
