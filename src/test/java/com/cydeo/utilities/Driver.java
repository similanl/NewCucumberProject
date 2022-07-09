package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

        private Driver(){

        }

//        private static WebDriver driver;
        private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();

        public static WebDriver getDriver() {


                if (driverPool.get() == null){

                        String browserType = ConfigurationReader.getProperty("browser");

                        switch (browserType.toLowerCase()){
                                case "chrome":
                                        WebDriverManager.chromedriver().setup();
                                        driverPool.set(new ChromeDriver());
                                        break;
                                case "firefox":
                                        WebDriverManager.firefoxdriver().setup();
                                        driverPool.set(new FirefoxDriver());
                                        break;
                                case "safari":
                                        WebDriverManager.safaridriver().setup();
                                        driverPool.set(new SafariDriver());
                                        break;
                                default:
                                        System.out.println("Unknown Browser Type" + browserType);
                                        driverPool = null;
                        }

                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        return driverPool.get();


                }
                return driverPool.get();

        }

        public static void closeDriver(){
                if (driverPool.get() != null){
                        driverPool.get().quit();
                        driverPool.remove();
                }
        }

}
