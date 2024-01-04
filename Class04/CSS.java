package Class04;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();


        //driver.manage().window().maximize();
        //Go to Syntax projects.com
        driver.get("https://syntaxprojects.com/cssSelector.php");

        // maximises the window
        driver.manage().window().maximize();

        //find the profile id - ID METHOD
        WebElement inputBox = driver.findElement(By.cssSelector("input[id='profileID']"));
        inputBox.sendKeys("hello");

        //find the profile box - ID METHOD (#)
        WebElement profilebox = driver.findElement(By.cssSelector("input#profileBox"));
        profilebox.sendKeys("World");

        //find the feedback box -  CLASSNAME METHOD (.)
        WebElement feedback = driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        feedback.sendKeys("how are you doing?");

        //find the course topic = STATIC METHOD (*)
        WebElement courseTopic = driver.findElement(By.cssSelector("Input[name*='contentInput'"));
        courseTopic.sendKeys("Selenium");

        //find the advance CSS - STARTS WITH (^)
        WebElement advanceCSS = driver.findElement(By.cssSelector("Input[name^='IntroInput'"));
        advanceCSS.sendKeys("umzyy");

        //find the Conclusion Module END's WITH ($) 
        WebElement conclusionModule = driver.findElement(By.cssSelector("Input[name$='Input'"));
        conclusionModule.sendKeys("Umar");



        Thread.sleep(6000); // HOLD THE SITE FOR 6 SECONDS!
        driver.quit(); // CLOSES THE BROWSER!
    }
}
