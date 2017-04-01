package com.githubauto.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import com.githubauto.webdriver.pages.GitHubFeatures;
import com.githubauto.webdriver.pages.GithubHomePage;

public class GitHubHomeTest {

  public WebDriver driver;

  public GitHubHomeTest() {
    driver = WebDriverBuilder.getDriver();

  }

  @Test
  public void verifyTitleWithoutLogin() {
    GithubHomePage homePage = new GithubHomePage(driver);
    homePage.load();
    String title = homePage.getTitle();
    Assert.assertEquals("The world's leading software development platform · GitHub", title);
  }

  @Test
  public void verifyTitleFeaturePage() {
    GithubHomePage homePage = new GithubHomePage(driver);
    homePage.load();
    GitHubFeatures featurePage = new GitHubFeatures(driver);
    homePage.gotoFeatures();
    String titleFeature = featurePage.getTitle();
    Assert.assertEquals(
        "Features For Collaborative Coding - Developers Work Better, Together | GitHub · GitHub",
        titleFeature);

  }
}
  


