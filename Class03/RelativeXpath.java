package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();


        //driver.manage().window().maximize();
        //Go to Syntax projects.com
        driver.get("https://syntaxprojects.com/Xpath.php");

        //finding the input box - ALWAYS SAVE IT TO DO ANYTHING WITH IT save variable - i.e "userName"
        WebElement userName=driver.findElement(By.xpath("//input[@id='title']"));

        //enter value in username field
        userName.sendKeys("Umzz");

        //finding the button - ALWAYS SAVE IT TO DO ANYTHING WITH IT (variable)- i.e "button"
        WebElement button = driver.findElement(By.xpath("//button[text()='Click Here']"));

        //click the button selected above
        button.click();

        //find the security question
        WebElement q1= driver.findElement(By.xpath("//input[contains(@name,'securityPartial')]"));
        q1.sendKeys("Umzz Ayee");

        //find the box with alot of text but find with partial match
        WebElement textMsg = driver.findElement(By.xpath("//label[contains(text(),'Lorem ipsum')]"));

        //save in string as "text" then get text - it will get the full text from the field on the site
        String text = textMsg.getText();

        //then print out save variable "text"
        System.out.println(text);

        //send api settings to field -DONT FORGET TO SAVE
        WebElement apiSettings = driver.findElement(By.xpath("//input[starts-with(@id,'apiSettings')]"));

        //send the data to field
        apiSettings.sendKeys("123.456.789");

        //send email to email field 2
        WebElement email2 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));

        //send the data to field
        email2.sendKeys("umz123@mail.com");

        //send data to attribute fields two (USING TWO FIELDS TO SEARCH)
        WebElement field2Attributes= driver.findElement(By.xpath("//input[@data-detail='two' and @name='customField']"));

        //send the data to field
        field2Attributes.sendKeys("Hello World");

        //send data to second attribute field ONE (USING TWO FIELDS TO SEARCH)
        WebElement fieldAttributes2= driver.findElement(By.xpath("//input[@name='customField1' and @data-detail='one']"));

        //send the data to field
        fieldAttributes2.sendKeys("Bye world");


        Thread.sleep(6000); // HOLD THE SITE FOR 6 SECONDS!
        driver.quit(); // CLOSES THE BROWSER!
    }
}
