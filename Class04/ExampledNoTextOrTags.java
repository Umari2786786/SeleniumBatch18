package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampledNoTextOrTags {
    public static void main(String[] args) throws InterruptedException {
//Opens up "Driver i.e Chrome"
        WebDriver driver=new ChromeDriver();

        // maximises the window
        //driver.manage().window().maximize();

        //Go to the website
        driver.get("https://syntaxprojects.com/advanceXpath.php");


        // FOLLOWING SIBLING ... field after the tag
        WebElement favBook = driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[1]"));
        favBook.sendKeys("aa");

        // BEFORE SIBLING ... field before the tag
        WebElement leastfavBook = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        leastfavBook.sendKeys("bb");

        //CHILD of the tag
        WebElement Child = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        Child.sendKeys("cc");

        //

        Thread.sleep(3000); // HOLD THE SITE FOR 3 SECONDS!
        driver.quit(); // CLOSES THE BROWSER!


    }
}
