package com.githubauto.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBuilder {
  private static WebDriver driver = null;

  public static WebDriver getDriver() {
    if (driver == null) {
      System.setProperty("webdriver.gecko.driver", "C:\\Gecko\\geckodriver.exe");
      System.setProperty("webdriver.firefox.bin",
          "C:\\Program Files (x86)\\Firefox Developer Edition\\firefox.exe");
      driver = new FirefoxDriver();
      return driver;
    }
    return driver;
  }
}
