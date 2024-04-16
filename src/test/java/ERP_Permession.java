import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class ERP_Permession {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        System.out.println("Enter the site url");
        Scanner input = new Scanner(System.in);
        String url = input.next();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.id("j_username"));
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Username : ");
        String user = input.next();
        username.sendKeys(user);
        WebElement Password =driver.findElement(By.id("j_password"));
        System.out.println("Enter the Password : ");
        String pass = input.next();
        Password.sendKeys(pass);
        driver.findElement(By.className("login100-form-btn")).click();
        driver.findElement(By.xpath("//*[@id=\"topbar1\"]/div/div/div/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"menuform:sideMenuPh_2\"]/a/i")).click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//*[@id=\"menuform:sideMenuPh_2_0\"]/a")).click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//*[@id=\"menuform:sideMenuPh_2_0_0\"]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"res_form:addButton\"]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"form:per_nat_ddl\"]/div[3]")).click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.id("form:per_nat_ddl_1")).click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.xpath("//*[@id=\"form:per_type_ddl_label\"]")).click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//*[@id=\"form:per_type_ddl_2\"]")).click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement Time = driver.findElement(By.xpath("//*[@id=\"form:from_hour_input\"]"));

        System.out.println("Enter time to leave");
        String sa3a = input.next();
        Time.sendKeys(sa3a);
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/dl/dd[2]/div/span")).click();
        //save***
        // driver.findElement(By.xpath("//*[@id=\"form:saveButton\"]/span[2]")).click();


    }
}
