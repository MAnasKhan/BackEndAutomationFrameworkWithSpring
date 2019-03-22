package com.nisum.onestopshop.ft.ui;


import com.nisum.onestopshop.ft.common.function.UiFunction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = { Application.class })
public class BaseTest extends AbstractTestNGSpringContextTests {

    private static final Logger log = LoggerFactory.getLogger(BaseTest.class);

    @Value(value = "")
    protected String userName;
    protected String password;
    protected String sso;

    @Autowired
    private UiFunction uiFunction;

    private void maximizeBrowserWindow() {
        try{
            uiFunction.maximizeBrowser();
        }
        catch (Exception e){
            log.error("Unable to Maximize Browse Window.");
            e.printStackTrace();
        }
    }

    public void initialize() throws Exception {
        maximizeBrowserWindow();
        login(userName, password);
    }


    protected void login(String username, String password) {

        if (uiFunction.isElementPresent("username")) {
            uiFunction.type("username", username);
        }

        if (uiFunction.isElementPresent("password")) {
            uiFunction.type("password", password);
        }

    }
}
