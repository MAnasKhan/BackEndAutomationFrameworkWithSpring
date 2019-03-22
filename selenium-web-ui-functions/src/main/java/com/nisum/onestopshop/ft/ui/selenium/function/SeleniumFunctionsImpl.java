package com.nisum.onestopshop.ft.ui.selenium.function;


import com.nisum.onestopshop.ft.common.function.UiFunction;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class SeleniumFunctionsImpl implements UiFunction {

    @Autowired
    private WebDriver webDriver;


    public void open(String locator) {

    }

    public void navigate(String module, String screenId) {

    }

    public boolean isElementPresent(String locator, int maxAttempts) {
        return false;
    }

    public boolean isElementPresent(String locator) {
        return false;
    }

    public boolean waitForPageElement(String locator, int maxAttempts) {
        return false;
    }

    public boolean waitForPageElement(String locator) {
        return false;
    }

    public boolean waitForTextPresent(String text) {
        return false;
    }

    public boolean isEditable(String locator) {
        return false;
    }

    public String getText(String locator) {
        return null;
    }

    public String getValue(String locator) {
        return null;
    }

    public String getTextValue(String locator) {
        return null;
    }

    public void click(String locator, int maxAttempts) {

    }

    public void click(String locator) {

    }

    public void clickHref(String locator) {

    }

    public void clickAndWait(String locator, int maxAttempts, long delay) {

    }

    public void clickAndWait(String locator, long delay) {

    }

    public void clickAndWait(String locator) {

    }

    public boolean isChildWindowOpen() {
        return false;
    }

    public void childWindow(String locator, long delay) {

    }

    public void childWindow(String locator) {

    }

    public int findRowIndexByValue(String locator, String value) {
        return 0;
    }

    public int findRowIndexByValue(String locator, String value, int pageLength) {
        return 0;
    }

    public boolean clickByValue(String locator, String value) {
        return false;
    }

    public boolean check(String locator, String value) {
        return false;
    }

    public boolean check(String locator, String value, int pageLength) {
        return false;
    }

    public List<String> getSelectOptions(String locator) {
        return null;
    }

    public void select(String locator, String value) {

    }

    public void type(String locator, String value) {

    }

    public void attachFile(String fieldLocator, String fileLocator) {

    }

    public String getCurrentURL() {
        return null;
    }

    public void getDefaultWindow() {

    }

    public void waitForPageToLoad(long delay) {

    }


    public void waitForPageToLoad() {

    }

    public void mouseOver(String locator) {

    }

    public String findElementByCSSSelector(String locator) {
        return null;
    }

    public String findElementByXpath(String locator) {
        return null;
    }

    public String findElementByName(String Name) {
        return null;
    }

    public void quit() {

    }

    public void clickThisHyperLink(String hyperLinkText) {

    }

    public boolean isCheckBoxSelected(String id) {
        return false;
    }

    public List<String> getCheckBoxElementIDs() {
        return null;
    }

    public WebDriver getWebDriver() {
        return null;
    }

    public void setTimeout(String timeout) {

    }

    public void scrollDownEndOfPage() {

    }

    public String getTooltipText(String moverlocator, String toolTiplocator) {
        return null;
    }

    public void typeCapitalLetters(String locator, String text) {

    }

    public void maximizeBrowser() {
        webDriver.manage().window().maximize();
    }
}
