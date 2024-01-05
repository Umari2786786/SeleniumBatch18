package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();

        /* to maximise screen */
        //driver.manage().window().maximize();

        // to open the website
        driver.get("https://syntaxprojects.com/handle-iframe.php");

        // driver to focus on main page via "frame"
        driver.switchTo().frame(0);

        //
        WebElement topic = driver.findElement(By.xpath("//input[@name='Topic']"));
        topic.sendKeys("frame");

        //
        driver.switchTo().defaultContent();
        driver.switchTo().frame("dropdownIframe");

        WebElement DD =driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel =new Select(DD);
        sel.selectByValue("big baby cat");

        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        WebElement frameNested =driver.findElement(By.xpath("//iframe[@id='checkboxIframe']"));
        driver.switchTo().frame((frameNested));

        driver.findElement(By.xpath("//input[@value='Optional-1']")).click();

        Thread.sleep(2000);
        driver.quit();




    }
}
