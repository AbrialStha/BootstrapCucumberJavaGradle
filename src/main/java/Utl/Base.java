package Utl;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by pav15p on 22/02/2017.
 */
public class Base {
    @SuppressWarnings("unused")
    public WebDriver Driver;

    @SuppressWarnings("unused")
    public WebElement Element;

    @SuppressWarnings("unused")
    public byte[] capture() {
        return ((TakesScreenshot) Driver).getScreenshotAs(OutputType.BYTES);
    }
}
