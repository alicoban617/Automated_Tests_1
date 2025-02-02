package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class Deneme_5 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_1.exe");
        WebDriver webDriver5 = new ChromeDriver();
        webDriver5.get("https://demoqa.com/buttons");
        webDriver5.manage().window().maximize();

        WebElement doubleclickbutton = webDriver5.findElement(new By.ByCssSelector("button[id='doubleClickBtn']"));
        boolean doubleclickbuttonisenabled;
        doubleclickbuttonisenabled = webDriver5.findElement(new By.ByCssSelector("button[id='doubleClickBtn']")).isEnabled();

        if(doubleclickbuttonisenabled){
            Actions action = new Actions(webDriver5);
            try{
                action.doubleClick(doubleclickbutton).perform();
            }catch(ElementClickInterceptedException e){
                System.out.println("Sorun var");
            }

        }
        WebElement doubleclickbuttonText = webDriver5.findElement(new By.ByCssSelector("p[id='doubleClickMessage']"));
        String doubleClickText = doubleclickbuttonText.getText();
        System.out.println(doubleClickText);



        WebElement rightclickmebutton = webDriver5.findElement(new By.ByCssSelector("button[id='rightClickBtn']"));
        boolean rightclickmebuttonisenabled;
        rightclickmebuttonisenabled = rightclickmebutton.isEnabled();

        if(rightclickmebuttonisenabled){
            Actions action = new Actions(webDriver5);
            try{
                action.contextClick(rightclickmebutton).perform();
            }catch(ElementClickInterceptedException e){
                System.out.println("Sorun var");
            }

        }
        WebElement rightclickbuttonText = webDriver5.findElement(new By.ByCssSelector("p[id='rightClickMessage']"));
        String rightClickText = rightclickbuttonText.getText();
        System.out.println(rightClickText);




        // //div/button[starts-with(text() , 'Click Me')]
        // //div[last()]/button
        WebElement clickmebutton = webDriver5.findElement(By.xpath("//div/button[starts-with(text(), 'Click Me')]"));
        boolean clickmebuttonisenabled;
        clickmebuttonisenabled = clickmebutton.isEnabled();

        if(clickmebuttonisenabled){
            Actions action = new Actions(webDriver5);
            try{
                action.click(clickmebutton).perform();
            }catch (ElementClickInterceptedException e){
                System.out.println("Sorun var");
            }
        }
        WebElement clickmebuttonText = webDriver5.findElement(new By.ByCssSelector("p[id='dynamicClickMessage']"));
        String clickmeText = clickmebuttonText.getText();
        System.out.println(clickmeText);

    }
}
