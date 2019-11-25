import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Simple {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Devoteam\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver obj = new ChromeDriver();
        obj.get("https://www.gmail.com/");
        obj.findElement(By.id("identifierId")).sendKeys("rkosaraju12");

        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebDriverWait wait=new WebDriverWait(obj, 20);

        obj.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
        obj.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement password = obj.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));

        wait.until(ExpectedConditions.elementToBeClickable(password));

        password.sendKeys("S@!r@m2312");

        obj.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
        //opens the compose inside the gmail
        obj.findElement(By.cssSelector(".T-I.J-J5-Ji.T-I-KE.L3")).click();
        //obj.findElement(By.className("z0")).click();
        obj.findElement(By.className("vO")).sendKeys("ksramya.455555@gmail.com");
        obj.findElement(By.className("aoT")).sendKeys("Test email from selenium");
        obj.findElement(By.className("Am")).sendKeys("THis is ramya");
        obj.findElement(By.className("aoO")).click();
    }
}
