package Selenium;

import com.sun.tools.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import  org.testng.annotations.Test;
import static  org.testng.Assert.assertEquals;

class UserRegistration{
    private WebDriver driver;
    public static String fName;

    public static void setfName(String fName) {
        UserRegistration.fName = fName;
        System.out.println("");
    }
    //Define static variable as per requirement

    //Identify the object as per the requirement public
    WebElement  element =driver.findElement(By.xpath(""));
    //*[@id="tbrow"]/td[3]
    //*[@id="tbrow"]/td[3]
    //*[@id="ttab"]/tbody/tr[1]/th[3]
    public UserRegistration(WebDriver driver) {
        this.driver = driver;
    }

    public void testElements(){

        //Store the placeholder text as per requirement
         UserRegistration.fName.concat("Hello");//element.getAttribute("placeholder");
        setfName("Hello");
    }
}

class DriverSetup {
    private WebDriver driver;
    public static String baseUrl = "http://webapps.tekstac.com/Shopify/";

    public WebDriver getDriver() {

        System.out.println("Launching Firefox browser..");
        System.setProperty("webdriver.gecko.driver", "D:\\Documents\\Java\\Modules\\src\\Selenium\\geckodriver.exe");

        //FirefoxBinary firefoxBinary = new FirefoxBinary();
     //   firefoxBinary.addCommandLineOptions("--headless");
       // FirefoxProfile profile=new FirefoxProfile();
       // profile.setPreference("marionette.logging", "TRACE");
        ///FirefoxOptions firefoxOptions = new FirefoxOptions();
        //firefoxOptions.setBinary(firefoxBinary);
        //firefoxOptions.setProfile(profile);

     //   WebDriver driver = new FirefoxDriver();
        driver.navigate().to(DriverSetup.baseUrl);

        return driver;
    }


}
class TestUserRegistration extends DriverSetup{
    private static final String priority = null;

    WebDriver driver;


    public UserRegistration UserRegistration;
    public DriverSetup driverSetup;

    @BeforeClass
    public void setUp() {
        driver = getDriver();
        UserRegistration = new UserRegistration(driver);
    }

    @Test
    public void testObjectIdentification(){
        UserRegistration.testElements();
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }



}

public class Main {
    public static void main(String[] args) {

        TestNG testSuite=new TestNG();
        testSuite.setTestClasses(new Class[]{TestUserRegistration.class});
        testSuite.run();
        System.out.println(UserRegistration.fName);
    }
}
