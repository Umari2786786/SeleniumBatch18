package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNewAccountFB {
    public static void main(String[] args) throws InterruptedException {

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

        //  locate the username field box for input
        WebElement email=driver.findElement(By.id("email"));

        //  enters text in to the username filed
        email.sendKeys("abcd@gmail.com");

        //  locate the password field box for input
        WebElement password=driver.findElement(By.name("pass"));

        //  enters text in to the password filed
        password.sendKeys("abcd");

        // locates the create new account button
        //this is one way another way below!! --
        //WebElement createAccount = driver.findElement(By.linkText("Create new account"));
        WebElement createAccount=driver.findElement(By.partialLinkText("new account"));
        // click the create account button
        createAccount.click();
        Thread.sleep(50000);

        driver.quit();




    }
}
