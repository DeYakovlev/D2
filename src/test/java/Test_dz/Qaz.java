package Test_dz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Qaz {
    @Test
    public void Qaz(){
        System.setProperty("webdriver.chrome.driver", "/Users/torgan/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        driver.get("https://www.youtube.com/");

        WebElement element = driver.findElement(By.name("search_query"));

        element.sendKeys("папич nuts");

        element.submit();

        driver.findElements(By.id("search-icon-legacy")).get(1).click();

        WebElement element1 = driver.findElement(By.xpath(" "));

        element1.click();

        driver.quit();




//        driver.get("https://www.google.com");
//
//        WebElement element = driver.findElement(By.name("q"));
//        element.sendKeys("Java language");
//        element.submit();
//
//        System.out.println(driver.getTitle());
//
//        driver.quit();
    }

}
