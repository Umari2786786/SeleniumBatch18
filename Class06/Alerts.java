package Class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();

        /* to maximise screen */
        //driver.manage().window().maximize();

        // to open the website
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");

        // locate the pop up button - aka alert
        WebElement alert1 = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));

        // to click the alert
        alert1.click();

        // hold the site
        Thread.sleep(2000);

        // switched over to the alert so you can control stuff on it
        Alert alertHandler = driver.switchTo().alert();

        //accept the alert
        alertHandler.accept();

        //located the confirm button on the alert
        WebElement alert2 =driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));

        // clicks the alert button
        alert2.click();

        //prints out the text in the alert
        System.out.println(alertHandler.getText());

        //dismissed the alert.
        alertHandler.dismiss();

        driver.quit();

    }
}
