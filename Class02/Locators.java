package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Locators {
    public static void main(String[] args) {

        // opens chrome browser
        WebDriver driver=new ChromeDriver();

        // maximises the window
        driver.manage().window().maximize();

        //  navigates to facebook
        driver.get("https://www.facebook.com");

        //  find the button to decline the cookies pop up
        WebElement cookies=driver.findElement(By.xpath("//button[contains(text(), 'Decline optional cookies')]"));

        // click the button containing the text mentioned above
        cookies.click();

        //  locate the user name field box for input
        WebElement email=driver.findElement(By.id("email"));

        //  enters text in to the username filed
        email.sendKeys("abcd@gmail.com");

        //  locate the password field box for input
        WebElement password=driver.findElement(By.name("pass"));

        //  enters text in to the password field
        password.sendKeys("abcd");

        //  locates the login button
        WebElement login=driver.findElement(By.name("login"));

        //  click the login button
        login.click();

        // locates the create new account button
        WebElement createAccount = driver.findElement(By.linkText("Create new account"));

        // click the create account button
        createAccount.click();

        driver.quit();
    }
}
