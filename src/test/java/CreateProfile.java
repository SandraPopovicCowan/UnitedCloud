/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import java.util.Random;
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
import pages.LoginPage;

/**
 *
 * @author mac
 */
public class CreateProfile {
    
    private static WebDriver driver;
    private static int sizeBeforeAddProfile;
    private static ChooseProfilePage chooseProfilePage;
    private static CreateProfilePage createProfilePage;
    
    public CreateProfile() {
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
        
    chooseProfilePage = new ChooseProfilePage(driver);
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    List<WebElement> profileList = driver.findElements(By.tagName("img"));
    sizeBeforeAddProfile =profileList.size();
    chooseProfilePage.clickOnNewProfileButton();
    createProfilePage = new CreateProfilePage(driver);
    
           
    }
    
    @After
    public void tearDown() {
        //driver.quit();
    }


    @Test
    public void CreateNewProfileZeroToSix() {
        
   
    JavascriptExecutor js = (JavascriptExecutor) driver; 
    

    String title = "Sandra" + new Random().nextInt(1000);
    createProfilePage.enterNameInputField(title);

    createProfilePage.clickOnZeroToSixLabel();
    
    js.executeScript("window.scrollBy(0,2000)");
    
    createProfilePage.clickOnAvatar();
    
    js.executeScript("window.scrollBy(0,2000)");
    
   
  
    System.out.println("No. of links: "+ sizeBeforeAddProfile);

    createProfilePage.clickOnCreateProfileButton();
    
    List<WebElement> profileList = driver.findElements(By.tagName("img"));
    int sizeAfterAddProfile =profileList.size();
    
    int ExpectedResult = sizeBeforeAddProfile + 1;
    
    
    assertTrue("New profile created", sizeAfterAddProfile==(ExpectedResult));
    
    //if (sizeAfterAddProfile!=sizeBeforeAddProfile +1) {
        //System.out.println("New profile not created");
        
   // } else { 
           // System.out.println("New profile created");
    
     
    
    }
    
    @Test
    public void CreateNewProfileSevenToEleven(){
        
    }
    
    @Test
    public void CreateNewProfileTwelveToFourteen(){
        
    }
    
    @Test
    public void CreateNewProfileFifteenToSeventeen(){
        
    }
    
    @Test
    public void CreateNewProfileEighteenPlus() {
        
   
    
    JavascriptExecutor js = (JavascriptExecutor) driver; 
    

    String title = "Sandra" + new Random().nextInt(1000);
    createProfilePage.enterNameInputField(title);

    createProfilePage.clickOnEighteenPlusLabel();
    
    js.executeScript("window.scrollBy(0,2000)");
    
    createProfilePage.clickOnAvatar();
    
    js.executeScript("window.scrollBy(0,1000)");
    
    createProfilePage.enterBirthYear();
    
    js.executeScript("window.scrollBy(0,1000)");
    
   
    System.out.println("No. of links: "+ sizeBeforeAddProfile);

    createProfilePage.clickOnCreateProfileButton();
    
    List<WebElement> profileList = driver.findElements(By.tagName("img"));
    int sizeAfterAddProfile =profileList.size();
    
    int ExpectedResult = sizeBeforeAddProfile + 1;
    
    
    assertTrue("New profile created", sizeAfterAddProfile==(ExpectedResult));
        
    
        
    }
    
    @Test
    public void CreateNewProfileFutureBirthYear() {
        
    }
    
    
    
    
}