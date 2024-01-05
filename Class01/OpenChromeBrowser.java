package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {
    public static void main(String[] args) throws InterruptedException {

        /* to open the browser */
        WebDriver driver= new ChromeDriver();

        /* to maximise screen */
        driver.manage().window().maximize();

        // to open the website
        driver.get("https://www.google.com");

        // to make screen full screen
        //driver.manage().window().fullscreen();

        // to open the website and hold for defined time
        // ** delete this code line later
        Thread.sleep(4000);

        // to get the value in the title in html coding
        String title = driver.getTitle();

        // this prints out the title page in intelij
        System.out.println("the title of the page is " + title);

        // to get the URL for the page
        String url= driver.getCurrentUrl();
        System.out.println("the URL is "+url);

        // to close the window
        driver.quit();

    }
}
