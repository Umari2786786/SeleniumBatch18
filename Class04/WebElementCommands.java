package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
    public static void main(String[] args) throws InterruptedException {
        //Opens up "Driver i.e Chrome"
        WebDriver driver=new ChromeDriver();

        // maximises the window
        //driver.manage().window().maximize();

        //Go to the website
        driver.get("https://syntaxprojects.com/selenium_commands_selector.php");

        //find the text binput box
        WebElement inputBox= driver.findElement(By.xpath("//input[@id='textInput']"));

        //clears the current text in the box
        inputBox.clear();

        //send new input to the text input box
        inputBox.sendKeys("Cleared Text and Re-Entered ");

        //Radio buttons as it little round selected buttons usually options
        //----------------------------------------------------------------------------------------
        //isSelected command checks if its enabled or disabled and returns a Boolean true or false

        WebElement radioButton1 = driver.findElement(By.xpath("//input[@name='radioDemo' and @value='option1']"));
        boolean stateofop1 = radioButton1.isSelected();


        //check id the radio button is SELECTED OR NOT
        if (!stateofop1){
            radioButton1.click();
            System.out.println("The state of the radio button is "+radioButton1.isSelected());
        }


        // Check if the radio button is ENABLED OR NOT
        WebElement radioButton2 = driver.findElement(By.xpath("//input[@name='radioDemo' and @value='option2']"));
        boolean stateofop2 = radioButton2.isEnabled();


        // Check if SELECTED OR NOT and if It's clickable or not
        if (stateofop2){
            System.out.println("the option is enabled and can be selected");
        }else {
            System.out.println("option 2 is not enabled and can not be clicked");
        }


        // Check if the option 3 is DISPLAYED OR NOT
        WebElement option3 = driver.findElement(By.xpath("//input[@name='radioDemo' and @value='option3']"));

        //This will ENABLE the option 3 button then show as displayed
        WebElement SelToggle = driver.findElement(By.xpath("//button[@onclick='toggleHiddenRadio(event)']"));
        SelToggle.click();

        boolean stateofop3 = option3.isDisplayed();
        if (stateofop3){
            System.out.println("its displayed");
        }else {
            System.out.println("not displayed");
        }

        //This will Extract the text from the field
        WebElement Txt = driver.findElement(By.xpath("//div[@id='textElement']"));
        String Extracted = Txt.getText();
        System.out.println(Extracted);

        //This will get the define attribute value from the HTML code and print it.. in this case "id" which is "attributeElement"
        WebElement GetAttribute = driver.findElement(By.xpath("//div[@id='attributeElement']"));
        String value= GetAttribute.getAttribute("id");
        System.out.println(value);


        Thread.sleep(3000); // HOLD THE SITE FOR 3 SECONDS!
        driver.quit(); // CLOSES THE BROWSER!
    }
}
