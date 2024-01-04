package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {
    public static void main(String[] args) {

        //  Opens Chrome browser
        WebDriver driver=new ChromeDriver();

        //  Maximises the window
        driver.manage().window().maximize();

        //  Navigates to facebook
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        //  Locates the field for username
        WebElement name= driver.findElement(By.name("ctl00$MainContent$username"));

        //  Enters the text into the username box
        name.sendKeys("Tester");

        //  Locates the field for password
        WebElement pass= driver.findElement(By.id("ctl00_MainContent_password"));

        //  Enters the text into the password box
        pass.sendKeys("test");

        //   Locates the login button
        WebElement loginButton=driver.findElement(By.className("button"));

        //  Clicks the login button
        loginButton.click();
            /*       TO CONFIRM YOU HAVE LOGGED IN           */

        //  Locates the text field in the top right hand side - something unique..i.e welcome user!
        WebElement message = driver.findElement(By.className("login_info"));

        //  copys the text from the message
        String text = message.getText();

        //  prints the txt in console below!
        System.out.println(text);

        //  locates the "title page "
        String title= driver.getTitle();

        //  prints the title in console below!
        System.out.println(title);

        // to close the window
        driver.quit();

    if (title.equals("Web Orders")){
        System.out.println("Test Passed");
    }else {
        System.out.println("Test Failed");
    }

    }
}
