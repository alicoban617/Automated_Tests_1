package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deneme_2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver_1.exe" );
        WebDriver wdriver2 = new ChromeDriver();
        wdriver2.get("https://demoqa.com/checkbox");
        wdriver2.manage().window().maximize();

        String homeCheckbox= "label[for='tree-node-home'] span.rct-checkbox svg.rct-icon.rct-icon-uncheck";
        WebElement homeCB = wdriver2.findElement(new By.ByCssSelector(homeCheckbox));
        homeCB.click();

        WebElement homeCBafterCheck = wdriver2.findElement(new By.ByCssSelector("label[for='tree-node-home'] span.rct-checkbox svg"));
        String classCB;
        classCB = homeCBafterCheck.getAttribute("class");

        if (classCB.equals("rct-icon rct-icon-check")){
            System.out.println("Checkbox is selected");
        }
        else if (classCB.equals("rct-icon rct-icon-uncheck")){
            System.out.println("Checkbox is unselected");
        }
        else{
            System.out.println("Checkbox ist fehlerhaft");
        }

    }

}
