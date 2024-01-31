package Class11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShots {
    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/simple_context_menu.php");

        TakesScreenshot ss=(TakesScreenshot) driver;
        //takes the ScreenShots
        File screenShot = ss.getScreenshotAs(OutputType.FILE);

        //save to computer (left fold name will be created)
        FileUtils.copyFile(screenShot,new File("screenshot/image2.png"));

        Thread.sleep(4000); // HOLD THE SITE FOR 6 SECONDS!
        driver.quit(); // CLOSES THE BROWSER!

    }
}
