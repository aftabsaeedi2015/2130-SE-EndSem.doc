package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class start {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Aftab\\Desktop\\se exam\\selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        Select dropdown = new Select(driver.findElement(By.id("gh-cat")));
        dropdown.selectByVisibleText("Books");
        driver.findElement(By.id("gh-ac")).sendKeys("harry potter");
        System.out.println("Page title is : " + driver.getTitle());
        driver.findElement(By.id("gh-btn")).click();

//        driver.close();
    }
}
