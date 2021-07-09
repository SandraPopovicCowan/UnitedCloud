

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ChooseProfilePage;
import pages.CreateProfilePage;
import pages.LoginPage;


public class DeleteProfile {
    
    private static WebDriver driver;
    //private static int sizeBeforeDeleteProfile;
    private static ChooseProfilePage chooseProfilePage;
    private static CreateProfilePage createProfilePage;
    
    
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
    }

    
  
    @Test
    public void deleteProfile() {
    chooseProfilePage = new ChooseProfilePage(driver);
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    List<WebElement> profileList = driver.findElements(By.tagName("img"));
    int i=0;
        for (WebElement Element : profileList) {
            i = i+3;
           

            
        }
        System.out.println("total objects founds " + i);
    //int sizeBeforeAddProfile =profileList.size();
    //System.out.println("Number of profiles: " + sizeBeforeAddProfile);
    //chooseProfilePage.clickOnNewProfileButton();
    //createProfilePage = new CreateProfilePage(driver);
     
     
     }
}
