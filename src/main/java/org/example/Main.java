package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumProject\\chrome-win64\\chrome-win64\\chrome.exe");
//
////Setting up capabilities to run our test script
//        ChromeOptions options = new ChromeOptions();
////Add Adblocker extension to Chrome
////        options.addExtensions(new File(“C:\Users\Downloads\adblocker.crx”));
//        DesiredCapabilities capabilities = new DesiredCapabilities();
////Using Chrome Options with Desired Capabilities Class
//        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//        //        WebDriver driver=new ChromeDriver();
//        ChromeDriver driver = new ChromeDriver(capabilities);
//
//        driver.manage().window().maximize();
//        driver.get("https://www.browserstack.com/users/sign_in");

//        WebDriverManager.chromedriver().setup();
//

        WebDriver driver2 =new ChromeDriver();
//        driver2.get("https://www.browserstack.com/users/sign_in");
        driver2.get("https://www.google.com/");
        driver2.quit();

    }

}