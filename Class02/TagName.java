package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
    public static void main(String[] args) throws InterruptedException {

        //  Opens Chrome browser
        WebDriver driver=new ChromeDriver();

        //  Maximises the window
        //driver.manage().window().maximize();

        //  Navigates to facebook
        driver.get("https://syntaxprojects.com/input-form-locator.php");

        //assign to "submitbutton" this will navigate to the submit button
        WebElement submitButton = driver.findElement(By.tagName("button"));

        //click the submit button
        submitButton.click();

        Thread.sleep(6000); // HOLD THE SITE FOR 6 SECONDS!
        driver.quit(); // CLOSES THE BROWSER!

    }
}
