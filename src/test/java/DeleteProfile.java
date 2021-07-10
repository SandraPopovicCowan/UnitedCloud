

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ChooseProfilePage;
import pages.CreateProfilePage;
import pages.DeleteProfilePage;
import pages.LoginPage;


public class DeleteProfile {
    
    private static WebDriver driver;
    private static ChooseProfilePage chooseProfilePage;
    private static CreateProfilePage createProfilePage;
    private static DeleteProfilePage deleteProfilePage;
    
    
    public DeleteProfile() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    driver = new ChromeDriver();
    driver.get("https://qa-interview.united.cloud/");
    driver.manage().window().maximize();
    LoginPage loginPage = new LoginPage(driver);
    loginPage.enterLoginUsername("sandra.popovic");
    loginPage.enterPassword("Lozinka123");
    loginPage.clickOnLoginButton();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        

    }
    
    @After
    public void tearDown() {
        driver.quit();
    }

    
  
    @Test
    public void deleteProfile() {
        
    JavascriptExecutor js = (JavascriptExecutor) driver; 
    chooseProfilePage = new ChooseProfilePage(driver);
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
   
    
    List<WebElement> list = driver.findElements(By.xpath("//div[@class='profiles']/div"));
    int profileNumberBeforeDelete = list.size();
    System.out.println("Number of profiles: " + profileNumberBeforeDelete);
    
    chooseProfilePage.clickOnAvatarOnChooseProfilePage();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    js.executeScript("window.scrollBy(0,2000)");
    deleteProfilePage.clickOnDeleteButton();
    
    String expectedUrl = "https://qa-interview.united.cloud/choose-profile";
    String actualUrl = driver.getCurrentUrl();
        
    assertTrue("URL does not match", expectedUrl.equals(actualUrl));
    
    int actualProfileNumberAfterDelete = list.size();
    int expectedProfileNumberAfterDelete = profileNumberBeforeDelete - 1;
    
    if (actualProfileNumberAfterDelete == expectedProfileNumberAfterDelete) {
        System.out.println("Profile has been deleted.");
    } else {
        System.out.println("Profile has not been deleted.");
    }
     
     }
}
