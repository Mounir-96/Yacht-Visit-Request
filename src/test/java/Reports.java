import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Point;

import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Reports {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        System.out.println("Enter the site url");
        Scanner input = new Scanner(System.in);
        String url = input.next();
        driver.get(url);
        driver.findElement(By.id("LoginForm:j_username")).sendKeys("emdbAdmin");
        driver.findElement(By.id("LoginForm:j_password")).sendKeys("Emdb2023");
        driver.findElement(By.id("LoginForm:my2Btn")).click();

        //reports
        WebElement report = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt150_7\"]/a/i[2]"));
        js.executeScript("arguments[0].scrollIntoView()", report);
        report.click();
        Thread.sleep(550);
        driver.findElement(By.xpath("//*[@id=\"menuform:j_idt150_7_1\"]/a/i[2]")).click();
        Thread.sleep(550);
        driver.findElement(By.xpath("//*[@id=\"menuform:j_idt150_7_1_2\"]/a")).click();
        Thread.sleep(500);

        // manzoor 15
        driver.findElement(By.xpath("//*[@id=\"searchForm:container:report\"]/div[3]")).click();
        Thread.sleep(600);
        WebElement takreer = driver.findElement(By.xpath("//*[@id=\"searchForm:container:report_15\"]"));
        js.executeScript("arguments[0].scrollIntoView()", takreer);
        Thread.sleep(600);
        takreer.click();
        Thread.sleep(600);
        driver.findElement(By.xpath("//*[@id=\"searchForm:container:reportView\"]/div[3]")).click();
        Thread.sleep(600);
        driver.findElement(By.xpath("//*[@id=\"searchForm:container:reportView_1\"]")).click();
        Thread.sleep(600);
        driver.findElement(By.xpath("//*[@id=\"searchForm:container:containerStatus\"]/div[3]/ul/li[1]/div/div")).click();
        Thread.sleep(600);
        driver.findElement(By.xpath("//*[@id=\"searchForm:container:containerType\"]/div[3]/ul/li[1]/div/div")).click();
        Thread.sleep(600);
        driver.findElement(By.xpath("//*[@id=\"searchForm:container:cargocategory\"]/div[3]/ul/li[2]/div/div")).click();
        Thread.sleep(600);
        driver.findElement(By.xpath("//*[@id=\"searchForm:container:containerSizes\"]/div[3]/ul/li[2]/div/div")).click();
        Thread.sleep(600);
        driver.findElement(By.id("searchForm:container:fromEtaDate_input")).sendKeys("01/01/2022");
        Thread.sleep(1000);
        driver.findElement(By.id("searchForm:container:toEtaDate_input")).sendKeys("31/12/2022");
        Thread.sleep(600);
        driver.findElement(By.xpath("//*[@id=\"searchForm:container:egyPort_label\"]")).click();
        Thread.sleep(600);
        driver.findElement(By.xpath("//*[@id=\"searchForm:container:egyPort_panel\"]/div[1]/div[1]/div[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"searchForm:container:displayReportButtonID_button\"]")).click();


    }

}
