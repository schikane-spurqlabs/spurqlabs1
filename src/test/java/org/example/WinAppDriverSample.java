package org.example;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class WinAppDriverSample {

    public static WindowsDriver driver=null;



    @BeforeClass
            public void setup() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app","C:\\Windows\\System32\\notepad.exe");
        capabilities.setCapability("platformName","Windows");
        capabilities.setCapability("deviceName","WindowsPC");


        try {
            driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), capabilities);
        }
        catch (MalformedURLException m)
        {
            m.printStackTrace();
        }
    }

    @AfterClass
    public void terminate()
    {
        driver.quit();
    }
}
