import org.example.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PayFormTest {

    @DisplayName("Название блока")
    @Test
    void testTitle() {
        WebDriver driver = WebDriverManager.getInstance();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        WebElement titleElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='pay__wrapper']/h2")));
        String title = titleElement.getText();
        Assertions.assertEquals("Онлайн пополнение\nбез комиссии", title);
    }

    @DisplayName("Логотипы платежных систем")
    @Test
    void testPaymentSystemsLogos() {
        WebDriver driver = WebDriverManager.getInstance();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        List<WebElement> systemElements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='pay__partners']/ul/li/img")));
        Assertions.assertEquals(5, systemElements.size());

        for (WebElement element : systemElements) {
            String src = element.getDomAttribute("src");
            Assertions.assertTrue(src != null && !src.isEmpty());
        }
    }

    @DisplayName("Ссылка Подробнее о сервисе")
    @Test
    void testMoreDetailsLink() {
        WebDriver driver = WebDriverManager.getInstance();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        WebElement linkElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='pay__wrapper']/a")));
        linkElement.click();

        String url = driver.getCurrentUrl();
        Assertions.assertEquals("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/", url);
    }

    @DisplayName("Заполнение полей и кнопка Продолжить")
    @Test
    void testFieldsFillingAndContinueButton() {
        WebDriver driver = WebDriverManager.getInstance();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        WebElement phoneElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form[@class='pay-form opened']//input[@class='phone']")));
        phoneElement.sendKeys("297777777");

        WebElement sumElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form[@class='pay-form opened']//input[@class='total_rub']")));
        sumElement.sendKeys("100");

        WebElement continueElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form[@class='pay-form opened']//button[@class='button button__default ']")));
        continueElement.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@class='bepaid-iframe']")));
    }

    @BeforeEach
    void get() {
        WebDriver driver = WebDriverManager.getInstance();
        driver.get("https://www.mts.by/");
    }

    @AfterAll
    static void quit() {
        WebDriverManager.quit();
    }

}
