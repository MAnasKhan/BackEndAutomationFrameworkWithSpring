package com.nisum.onestopshop.ft.common.function;

import java.util.List;

public interface UiFunction {
    void open(String locator);

    void navigate(String module, String screenId);

    boolean isElementPresent(String locator, int maxAttempts);

    boolean isElementPresent(String locator);

    boolean waitForPageElement(String locator, int maxAttempts);

    boolean waitForPageElement(String locator);

    boolean waitForTextPresent(String text);

    boolean isEditable(String locator);

    String getText(String locator);

    String getValue(String locator);

    String getTextValue(String locator);

    void click(String locator, int maxAttempts);

    void click(String locator);

    void clickHref(String locator);

    void clickAndWait(String locator, int maxAttempts, long delay);

    void clickAndWait(String locator, long delay);

    void clickAndWait(String locator);

    boolean isChildWindowOpen();

    void childWindow(String locator, long delay);

    void childWindow(String locator);

    int findRowIndexByValue(String locator, String value);

    int findRowIndexByValue(String locator, String value, int pageLength);

    boolean clickByValue(String locator, String value);

    boolean check(String locator, String value);

    boolean check(String locator, String value, int pageLength);

    List<String> getSelectOptions(String locator);

    void select(String locator, String value);

    void type(String locator, String value);

    void attachFile(String fieldLocator, String fileLocator);

    String getCurrentURL();

    void getDefaultWindow();

    void waitForPageToLoad(long delay);

    void waitForPageToLoad();

    void mouseOver(String locator);

    String findElementByCSSSelector(String locator);

    String findElementByXpath(String locator);

    String findElementByName(String Name);

    void quit();

    void clickThisHyperLink(String hyperLinkText);

    boolean isCheckBoxSelected(String id);

    List<String> getCheckBoxElementIDs();

    void setTimeout(String timeout);

    void scrollDownEndOfPage();

    String getTooltipText(String moverlocator, String toolTiplocator);

    void typeCapitalLetters(String locator, String text);

    void maximizeBrowser();
}
