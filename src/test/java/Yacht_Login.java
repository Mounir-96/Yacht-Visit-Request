import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Point;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Yacht_Login {
    public static void main(String[] args) throws InterruptedException {
        String user = null;
        String pass = null;
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        System.out.println("Enter the site url");
        Scanner input = new Scanner(System.in);
        String url = input.next();
        driver.get(url);
        driver.manage().window().maximize();
        //Login
        driver.findElement(By.id("LoginForm:j_username")).sendKeys(username(user));
        driver.findElement(By.id("LoginForm:j_password")).sendKeys(password(pass));
        driver.findElement(By.id("LoginForm:my2Btn")).click();
        Thread.sleep(1000);

        // Access Yacht Single Window
        WebElement Element = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt152_12\"]/a/span"));
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Element.click();
        Thread.sleep(1000);
        WebElement window = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt152_12_2\"]/a/i[2]"));
        js.executeScript("arguments[0].scrollIntoView();", window);
        Thread.sleep(1000);
        window.click();
        driver.findElement(By.xpath("//*[@id=\"menuform:j_idt152_12_2_0\"]/a")).click();
        Thread.sleep(2000);


        // Add button
        WebElement Talab = driver.findElement(By.xpath("//*[@id=\"searchForm:fromEtdDate\"]/button"));
        js.executeScript("arguments[0].scrollIntoView();", Talab);
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"searchForm:compAdd:addEditButtonId\"]")).click();
        Thread.sleep(1000);

        // Imo ( Seven numbers ) Generation
        driver.findElement(By.xpath("//*[@id=\"mainForm:tabs:shipImoNoInputNum\"]")).sendKeys(Imo() + "");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"mainForm:tabs:YachtPanel_header\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"mainForm:messages\"]/div/a")).click();
        Thread.sleep(2000);

        // Data
        driver.findElement(By.xpath("//*[@id=\"mainForm:tabs:shipNameInputText\"]")).sendKeys("Yacht");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"mainForm:tabs:shipCallSignInputText\"]")).sendKeys("1222");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"mainForm:tabs:countries\"]/div[3]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"mainForm:tabs:countries_1\"]")).click();
        Thread.sleep(500);
        WebElement load = driver.findElement(By.xpath("//*[@id=\"mainForm:tabs:nrt_input\"]"));
        load.sendKeys("1000");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"mainForm:tabs:netCapacity_input\"]")).sendKeys("900");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"mainForm:tabs:loaMt_input\"]")).sendKeys("700");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"mainForm:tabs:beamMt_input\"]")).sendKeys("500");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"mainForm:tabs:depthMt_input\"]")).sendKeys("300");
        Thread.sleep(1000);
        WebElement tab = driver.findElement(By.xpath("//*[@id=\"mainForm:tabs:depthFt_input\"]"));
        js.executeScript("arguments[0].scrollIntoView();", tab);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"mainForm:tabs:j_idt226:yachtOwnersBtn\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"mainForm:tabs:j_idt226:dataTableId_data\"]/tr[1]/td[1]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"mainForm:tabs:j_idt226:dataTableId:selectBtn\"]")).click();
        Thread.sleep(2000);
        WebElement Visit_Data = driver.findElement(By.xpath("//*[@id=\"mainForm:tabs:YachtVisitPanel_header\"]/span"));
        js.executeScript("arguments[0].scrollIntoView()", Visit_Data);


        // Visit Reason
        WebElement reason = driver.findElement(By.xpath("//*[@id=\"mainForm:tabs:visitReasonId_label\"]"));
        reason.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"mainForm:tabs:visitReasonId_3\"]")).click();
        Thread.sleep(500);

        // Radio Button
        WebElement visitor = driver.findElement(By.xpath("//*[@id=\"mainForm:tabs:visitor\"]/div[2]/span"));
        js.executeScript("arguments[0].scrollIntoView();", visitor);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", visitor);

        // Expected arrival

        driver.findElement(By.id("mainForm:tabs:eta_input")).sendKeys("28/11/2023 00:00");
        Thread.sleep(2000);
        driver.findElement(By.id("mainForm:tabs:eta_input")).sendKeys("28/11/2023 00:00");
        driver.findElement(By.xpath("//*[@id=\"mainForm:tabs:etd_input\"]")).click();
        //driver.findElement(By.xpath("//*[@id=\"mainForm:tabs:j_idt308_content\"]/div[1]/div[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"mainForm:tabs:etd_input\"]")).sendKeys("30/12/2023 00:00");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"mainForm:tabs:isArea1\"]/div[2]/span")).click();

        // Agency
      /*  WebElement tawkeel = driver.findElement(By.xpath("//*[@id=\"mainForm:tabs:j_idt292\"]"));
        js.executeScript("arguments[0].scrollIntoView()", tawkeel);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"mainForm:tabs:shippingAgentId\"]/div[3]/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"mainForm:tabs:shippingAgentId_1\"]")).click();
        Thread.sleep(2000);*/

        // Past Ports
        String winHandleBefore = driver.getWindowHandle();
        driver.findElement(By.xpath("//*[@id=\"mainForm:tabs:dlg1\"]")).click();
        Thread.sleep(1000);
        driver.switchTo().frame(0);
        Thread.sleep(500);
        driver.findElement(By.xpath("  //*[@id=\"dlgSearchform:dataTableId_data\"]/tr[1]")).click();
        Thread.sleep(500);
        driver.findElement(By.id("dlgSearchform:dataTableId:selectBtn")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"dlgSearchform:dataTableId1:0:j_idt38\"]/div[2]")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"dlgSearchform:dataTableId1:0:j_idt40\"]/div[2]")).click();
        Thread.sleep(500);
        driver.findElement(By.id("dlgSearchform:j_idt45:saveButtonId")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("dlgSearchform:j_idt45:j_idt49")).click();
        driver.switchTo().window(winHandleBefore);

        // Directions
        driver.findElement(By.id("mainForm:tabs:dlg2")).click();
        Thread.sleep(2500);
        driver.switchTo().frame(0);
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"dlgSearchform:dataTableId_data\"]/tr[1]/td[2]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"dlgSearchform:dataTableId:selectBtn\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"dlgSearchform:dataTableId1_data\"]/tr/td[1]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"dlgSearchform:dataTableId1_data\"]/tr/td[2]")).click();
        Thread.sleep(500);
        driver.findElement(By.id("dlgSearchform:dataTableId1:0:eta_input")).sendKeys("01/12/2023 00:00");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"dlgSearchform:dataTableId1_data\"]/tr/td[3]")).click();
        Thread.sleep(500);
        driver.findElement(By.id("dlgSearchform:dataTableId1:0:etd_input")).sendKeys("31/12/2023 00:00");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"dlgSearchform:dataTableId1_paginator_bottom\"]/span/a")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("dlgSearchform:btnComp:saveButtonId")).click();
        Thread.sleep(4000);
        driver.switchTo().defaultContent();
        driver.findElement(By.id("mainForm:tabs:ComplaintsSuggestionsTextArea")).sendKeys("sssss");

        // Documents
        WebElement add = driver.findElement(By.name("mainForm:tabs:attachYacht:docsDataTableId:addButtonId"));
        js.executeScript("arguments[0].scrollIntoView()", add);
        add.click();
        Thread.sleep(2500);
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//*[@id=\"attchementComposite:addEditAttachmentForm:documentName\"]/div[3]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"attchementComposite:addEditAttachmentForm:documentName_1\"]")).click();
        Thread.sleep(500);
        WebElement upload = driver.findElement(By.name("attchementComposite:addEditAttachmentForm:fileId_input"));
        Thread.sleep(500);
        upload.sendKeys("C:\\Users\\mmaged\\Desktop\\1.png");
        Thread.sleep(1000);
        driver.findElement(By.id("attchementComposite:addEditAttachmentForm:j_idt27:saveButtonId")).click();
        Thread.sleep(800);
        driver.findElement(By.xpath("//*[@id=\"attchementComposite:addEditAttachmentForm:documentName\"]/div[3]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"attchementComposite:addEditAttachmentForm:documentName_7\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.name("attchementComposite:addEditAttachmentForm:fileId_input")).sendKeys("C:\\Users\\mmaged\\Desktop\\1.png");
        Thread.sleep(700);
        driver.findElement(By.id("attchementComposite:addEditAttachmentForm:j_idt27:saveButtonId")).click();
        Thread.sleep(500);
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//*[@id=\"mainForm:tabs:attachYacht:docsDataTableId:addButtonId_dlg\"]/div[1]/a")).click();
        Thread.sleep(600);
        driver.findElement(By.id("mainForm:tabs:saveButtonId")).click();


        driver.quit();
    }

    public static int Imo() {
        int imo = (int) ((Math.random() * 9000000) + 1000000);
        return imo;

    }

    public static String username(String x) {
        System.out.println("Enter Username");
        Scanner input = new Scanner(System.in);
        x = input.next();
        return x;
    }

    public static String password(String y) {
        System.out.println("Enter Password");
        Scanner input = new Scanner(System.in);
        y = input.next();

        return y;
    }


}
