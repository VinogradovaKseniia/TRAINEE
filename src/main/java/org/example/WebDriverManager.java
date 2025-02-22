package org.example;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverManager {
    private static WebDriver driver;

    private WebDriverManager() {
    }

    public static WebDriver getInstance() {
        if (driver == null) {
            io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();
            options.setPageLoadStrategy(PageLoadStrategy.NONE);
            options.addArguments("--headless");
            driver = new ChromeDriver(options);
        }
        return driver;
    }

    public static void quit() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
