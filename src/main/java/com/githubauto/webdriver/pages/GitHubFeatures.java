package com.githubauto.webdriver.pages;

import org.openqa.selenium.WebDriver;

public class GitHubFeatures {
  private WebDriver driver;

  public GitHubFeatures(WebDriver driver) {
    this.driver = driver;
  }

  public String getTitle() {
    return driver.getTitle();
  }

}
