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
    public void setUp(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.navigate().to("https://www.iec.co.il/pages/default.aspx");

    }
    @Test
    public void searchFromNavMenu(){
        //click on HomeClients
        wd.findElement(By.cssSelector("a[href='/HomeClients']")).click();

        //get breadcrumbCurrentNode
        String breadcrumbCurrentNode = wd.findElement(By.xpath("//a[@class='s4-breadcrumbCurrentNode']")).getText();
        System.out.println(breadcrumbCurrentNode);

    }

    @AfterMethod(enabled = false)
    public void tearDown(){
        wd.quit();

    }
}
