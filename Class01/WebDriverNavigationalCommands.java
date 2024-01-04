package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverNavigationalCommands {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver(); /* name of the driver to open a browsers */

        driver.manage().window().maximize(); /* maximise screen */

        driver.get("https://www.google.com");/* get to the browser to open to this website */
        Thread.sleep(2000);

        driver.navigate().to("https://www.facebook.com"); /* navigate to another website */
        Thread.sleep(2000);

        driver.navigate().back();/* navigate back to page - like back button */
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.quit();

    }
}
