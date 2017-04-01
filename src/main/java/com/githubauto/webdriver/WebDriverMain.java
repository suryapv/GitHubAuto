package com.githubauto.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverMain {

  public static void main(String[] args) {
    System.setProperty("webdriver.gecko.driver", "C:\\Gecko\\geckodriver.exe");
    System.setProperty("webdriver.firefox.bin",
        "C:\\Program Files (x86)\\Firefox Developer Edition\\firefox.exe");
    WebDriver driver = new FirefoxDriver();
    driver.navigate().to("https://github.com/");
    String appTitle = driver.getTitle();
    System.out.println("Application title is :: " + appTitle);
    driver.quit();// remove this to stop abnormal shutdown


  }

}
