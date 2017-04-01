package com.githubauto.webdriver.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GithubAutomator {

  public static void main(String[] args) {
    System.setProperty("webdriver.gecko.driver", "C:\\Gecko\\geckodriver.exe");
    System.setProperty("webdriver.firefox.bin",
        "C:\\Program Files (x86)\\Firefox Developer Edition\\firefox.exe");
      WebDriver driver = new FirefoxDriver();
    GithubHomePage homePage = new GithubHomePage(driver);
    homePage.load();
    GitHubLoginPage loginPage = homePage.singIn();
    loginPage.login("githubtest456", "githubtest123");
    GithubSearchResultsPage searchPage = new GithubSearchResultsPage(driver);
    searchPage.search("hibernate");
    searchPage.numberOfResults();
    searchPage.titleResults();

  }

}