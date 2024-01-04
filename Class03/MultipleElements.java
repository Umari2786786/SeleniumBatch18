package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MultipleElements {
    public static void main(String[] args) throws InterruptedException {
        //  Opens Chrome browser
        WebDriver driver=new ChromeDriver();

        //  Maximises the window
        //driver.manage().window().maximize();

        //  Navigates to facebook
        driver.get("https://ebay.com");
        //WebElement cookies= driver.findElement(By.xpath("//input[@aria-label='Decline privacy terms and settings']"));
        //cookies.click();


        // *TASK* Get all the links from ebay.com and print on the screen

        //finds all the link in "a tag" a tag is where all the links are saved
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        //for loop to keep finding all links
        for (WebElement link:allLinks) {

            //saves the links in the String variable - get text gets extracts the links from above "a" tag!
            String text = link.getText();
            //prints out the above saved
            System.out.println(text);

            //now more links are saved in "href" - create another variable to save the href links - get attribute extracts the links
            String webLinks = link.getAttribute("href");
            //print the weblinks which have been saved above
            System.out.println(webLinks);

        }



        Thread.sleep(3000); // HOLD THE SITE FOR 6 SECONDS!
        driver.quit(); // CLOSES THE BROWSER!


    }
}
