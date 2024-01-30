package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        //driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/simple_context_menu.php");

        // Draw a boundary around the web element

        WebElement hoverBtn = driver.findElement(By.xpath("//button[text()='Hover me!']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].style.border='3px solid red'",hoverBtn);

        //Scrolling down
        js.executeScript("window.scrollBy(0,1000)");

        Thread.sleep(10000); // HOLD THE SITE FOR 6 SECONDS
        //Scrolling up
        js.executeScript("window.scrollBy(0,-1000)");

        //Get the click button
        WebElement fileupload = driver.findElement(By.xpath("//a[text()='File Upload']"));
        js.executeScript("arguments[0].click();", fileupload);

        //Screen shotting



        Thread.sleep(2000); // HOLD THE SITE FOR 6 SECONDS!
        driver.quit(); // CLOSES THE BROWSER!
    }
}
