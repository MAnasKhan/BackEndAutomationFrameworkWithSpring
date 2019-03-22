package com.nisum.onestopshop.ft.ui.selenium.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebDriverConfig {

    @Value(value = "${ui.test.web.browser.firefox:firefox}")
    public static final String FIREFOX_BROWSER = "*firefox";
    public static final String IE_BROWSER = "*iexplore";
    public static final String CHROME_BROWSER = "*googlechrome";
    private String selBrowser =CHROME_BROWSER;
    private String browserExe = "";
    private boolean selOnScriptCommandFailureContinue = false;

    @Value(value = "${chorme.web.driver.path}")
    public String chromeDriverPath;
    private long selSeleniumSpeed = 100;
    private long selDelayAfterClick = 5000;
    private long selDelayForPageLoad = 10000;
    private int selElementPresentMaxAttempts = 50;
    private int selWaitForElementMaxAttempts = 100;

    @Value(value = "${store.application.base.url:http://localhost:8080/}")
    private String baseUrl = "http://localhost:8080/";
    private String username = "ROOT";
    private String password = "root";
    private String sso = "None";


    private String dbName = null;
    private String dbDriver = null;
    private String dbClassname = null;
    private String dbURL = null;
    private String dbUsername = null;
    private String dbPassword = null;

    @Bean
    public WebDriver webDriver() {

        WebDriver webDriver;
        if (FIREFOX_BROWSER.equalsIgnoreCase(selBrowser)) {
            webDriver = new FirefoxDriver();
        }
        else if (IE_BROWSER.equalsIgnoreCase(selBrowser)) {
            DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
            webDriver = new InternetExplorerDriver();
        }
        else if (CHROME_BROWSER.equalsIgnoreCase(selBrowser)) {
            //ADD - Please leave this uncommented and set the path in your PATH variable on your PC:
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
            webDriver = new ChromeDriver();
        }
        else {
            throw new IllegalArgumentException("Browser '" + selBrowser + "' Not Supported.");
        }

        return webDriver;
    }

}
