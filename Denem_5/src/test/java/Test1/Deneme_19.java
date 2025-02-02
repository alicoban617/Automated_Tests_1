package Test1;

import com.google.common.annotations.VisibleForTesting;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Deneme_19 {

    WebDriver webDriver19;

    @Test
    public void test_1() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_1.exe");
        webDriver19 = new ChromeDriver();
        webDriver19.get("https://demoqa.com/date-picker");
        webDriver19.manage().window().maximize();

        WebElement selectDateField = webDriver19.findElement(new By.ByCssSelector("#datePickerMonthYearInput"));
        selectDateField.click();
    }
    @Test
    public void test_2() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_1.exe");
        webDriver19 = new ChromeDriver();
        webDriver19.get("https://demoqa.com/date-picker");
        webDriver19.manage().window().maximize();

        WebElement selectDateField = webDriver19.findElement(new By.ByCssSelector("#datePickerMonthYearInput"));
        selectDateField.click();

        WebElement monthPickerRef = webDriver19.findElement(new By.ByCssSelector("#datePickerMonthYear > div.react-datepicker__tab-loop > div.react-datepicker-popper > div > div > div.react-datepicker__month-container > div.react-datepicker__header > div.react-datepicker__header__dropdown.react-datepicker__header__dropdown--select > div.react-datepicker__month-dropdown-container.react-datepicker__month-dropdown-container--select > select"));
        monthPickerRef.click();

        List<WebElement> months = webDriver19.findElements(By.cssSelector("select[class='react-datepicker__month-select'] > option"));
        months.get(5).click();

        Thread.sleep(2000);

        WebElement reactMonth = webDriver19.findElement(new By.ByCssSelector("#datePickerMonthYear > div.react-datepicker__tab-loop > div.react-datepicker-popper > div > div > div.react-datepicker__month-container > div.react-datepicker__header > div.react-datepicker__current-month.react-datepicker__current-month--hasYearDropdown.react-datepicker__current-month--hasMonthDropdown"));
        String monthText = reactMonth.getText();


            if(monthText.contains("June")) {
                System.out.println("Der Monat konnte richtig erscheinen");
            }

        else{
            System.out.println("Der Monat konnte nicht erscheinen");
        }




    }

}
