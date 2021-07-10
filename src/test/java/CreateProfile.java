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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ChooseProfilePage;
import pages.CreateProfilePage;
import pages.LoginPage;

/**
 *
 * @author mac
 */
public class CreateProfile {
    
    private static WebDriver driver;
    private static WebDriverWait wait;
    private static int sizeBeforeAddProfile;
    private static ChooseProfilePage chooseProfilePage;
    private static CreateProfilePage createProfilePage;
    
    public CreateProfile() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    driver = new ChromeDriver();
    wait = new WebDriverWait(driver,5);
    driver.get("https://qa-interview.united.cloud/");
    driver.manage().window().maximize();
    LoginPage loginPage = new LoginPage(driver);
    loginPage.enterLoginUsername("sandra.popovic");
    loginPage.enterPassword("Lozinka123");
    loginPage.clickOnLoginButton();
    }
    
    @AfterClass
    public static void tearDownClass() {
         driver.quit();
    }
    
    @Before
    public void setUp() {
        
    chooseProfilePage = new ChooseProfilePage(driver);
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    createProfilePage = new CreateProfilePage(driver);
    }
    
    @After
    public void tearDown() {
       
    }


    @Test
    public void CreateNewProfileZeroToSix() {
    
    JavascriptExecutor js = (JavascriptExecutor) driver; 
    
    List<WebElement> list = driver.findElements(By.xpath("//div[@class='profiles']/div"));
    int profileNumberBeforeAdding = list.size();
    System.out.println("Number of profiles: " + profileNumberBeforeAdding);
   
    chooseProfilePage.clickOnNewProfileButton();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    
    String title = "Sandra" + new Random().nextInt(1000);
    createProfilePage.enterNameInputField(title);

    createProfilePage.clickOnZeroToSixLabel();
    
    js.executeScript("window.scrollBy(0,2000)");
   
   // wait.until(ExpectedConditions.avatarToBeClickable(By.xpath("//*[@id=\"app\"]/div/div/div/form/div[3]/div/div[1]/label/div/img"));
    createProfilePage.clickOnAvatar();
    
    js.executeScript("window.scrollBy(0,2000)");
    
    createProfilePage.clickOnCreateProfileButton();
    createProfilePage.clickOnChooseProfileButton();
    
    List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='profiles']/div"));
    int profileNumberAfterAddProfile =list1.size();
   
    int ExpectedResult = profileNumberBeforeAdding + 1;
      
    //assertTrue("New profile created", profileNumberAfterAddProfile==(ExpectedResult));
    
    if (profileNumberAfterAddProfile==profileNumberBeforeAdding +1) {
        System.out.println("New profile created");
        
    } else { 
            System.out.println("New profile not created");
        }

    }
    
    @Test
    public void CreateNewProfileSevenToEleven(){
               
    JavascriptExecutor js = (JavascriptExecutor) driver; 
    
    List<WebElement> list = driver.findElements(By.xpath("//div[@class='profiles']/div"));
    int profileNumberBeforeAdding = list.size();
    System.out.println("Number of profiles: " + profileNumberBeforeAdding);
   
    chooseProfilePage.clickOnNewProfileButton();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
 
    String title = "Sandra" + new Random().nextInt(1000);
    createProfilePage.enterNameInputField(title);

    createProfilePage.clickOnSevenToElevenLabel();
    
    js.executeScript("window.scrollBy(0,2000)");
    
    createProfilePage.clickOnAvatar();
    
    js.executeScript("window.scrollBy(0,2000)");
    
    createProfilePage.clickOnCreateProfileButton();
    createProfilePage.clickOnChooseProfileButton();
    
    List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='profiles']/div"));
    int profileNumberAfterAddProfile =list1.size();
   
    int ExpectedResult = profileNumberBeforeAdding + 1;
       
    //assertTrue("New profile created", profileNumberAfterAddProfile==(ExpectedResult));
    
    if (profileNumberAfterAddProfile==profileNumberBeforeAdding +1) {
        System.out.println("New profile created");
        
    } else { 
            System.out.println("New profile not created");
        }
        
    }
    
    @Test
    public void CreateNewProfileTwelveToFourteen(){
     
    JavascriptExecutor js = (JavascriptExecutor) driver; 
    
    List<WebElement> list = driver.findElements(By.xpath("//div[@class='profiles']/div"));
    int profileNumberBeforeAdding = list.size();
    System.out.println("Number of profiles: " + profileNumberBeforeAdding);
   
    chooseProfilePage.clickOnNewProfileButton();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    String title = "Sandra" + new Random().nextInt(1000);
    createProfilePage.enterNameInputField(title);
    createProfilePage.clickOnTwelveToFourteenLabel();
    
    js.executeScript("window.scrollBy(0,2000)");
    
    createProfilePage.clickOnAvatar();
    
    js.executeScript("window.scrollBy(0,2000)");
    
    createProfilePage.clickOnCreateProfileButton();
    createProfilePage.clickOnChooseProfileButton();
    
    List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='profiles']/div"));
    int profileNumberAfterAddProfile =list1.size();
    
    
    int ExpectedResult = profileNumberBeforeAdding + 1;
 
    //assertTrue("New profile not created", profileNumberAfterAddProfile==(ExpectedResult));
    
    if (profileNumberAfterAddProfile==profileNumberBeforeAdding +1) {
        System.out.println("New profile created");
        
    } else { 
            System.out.println("New profile not created");
        }
        
    }
    
    @Test
    public void CreateNewProfileFifteenToSeventeen(){
             
    JavascriptExecutor js = (JavascriptExecutor) driver; 
    
    List<WebElement> list = driver.findElements(By.xpath("//div[@class='profiles']/div"));
    int profileNumberBeforeAdding = list.size();
    System.out.println("Number of profiles: " + profileNumberBeforeAdding);
   
    chooseProfilePage.clickOnNewProfileButton();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    
    String title = "Sandra" + new Random().nextInt(1000);
    createProfilePage.enterNameInputField(title);

    createProfilePage.clickOnFifteenToSeventeenLabel();
    
    js.executeScript("window.scrollBy(0,2000)");
    
    createProfilePage.clickOnAvatar();
    
    js.executeScript("window.scrollBy(0,2000)");

    createProfilePage.clickOnCreateProfileButton();
    createProfilePage.clickOnChooseProfileButton();
 
    List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='profiles']/div"));
    int profileNumberAfterAddProfile =list1.size();
        
    int ExpectedResult = profileNumberBeforeAdding + 1;

    //assertTrue("New profile not created", profileNumberAfterAddProfile==(ExpectedResult));
    
    if (profileNumberAfterAddProfile==profileNumberBeforeAdding +1) {
        System.out.println("New profile created");
        
    } else { 
            System.out.println("New profile not created");
        }
        
    }
    
    @Test
    public void CreateNewProfileEighteenPlus() {
 
    JavascriptExecutor js = (JavascriptExecutor) driver; 
    
    List<WebElement> list = driver.findElements(By.xpath("//div[@class='profiles']/div"));
    int profileNumberBeforeAdding = list.size();
    System.out.println("Number of profiles: " + profileNumberBeforeAdding);
   
    chooseProfilePage.clickOnNewProfileButton();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

    String title = "Sandra" + new Random().nextInt(1000);
    createProfilePage.enterNameInputField(title);

    createProfilePage.clickOnEighteenPlusLabel();
    
    js.executeScript("window.scrollBy(0,2000)");
    
    createProfilePage.enterBirthYear();
    
    js.executeScript("window.scrollBy(0,1000)");
    
    createProfilePage.clickOnAvatar();
 
    js.executeScript("window.scrollBy(0,1000)");

    createProfilePage.clickOnCreateProfileButton();
    createProfilePage.clickOnChooseProfileButton();
      
    List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='profiles']/div"));
    int profileNumberAfterAddProfile =list1.size();
        
    int ExpectedResult = profileNumberBeforeAdding + 1;
      
    //assertTrue("New profile not created", profileNumberAfterAddProfile==(ExpectedResult));
    
    if (profileNumberAfterAddProfile==profileNumberBeforeAdding +1) {
        System.out.println("New profile created");
        
    } else { 
            System.out.println("New profile not created");
        }
   
    }
    
    @Test
    public void CreateNewProfileFutureBirthYear() {
        
     
    JavascriptExecutor js = (JavascriptExecutor) driver; 
    
    List<WebElement> list = driver.findElements(By.xpath("//div[@class='profiles']/div"));
    int profileNumberBeforeAdding = list.size();
    System.out.println("Number of profiles: " + profileNumberBeforeAdding);
   
    chooseProfilePage.clickOnNewProfileButton();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    
    String title = "Sandra" + new Random().nextInt(1000);
    createProfilePage.enterNameInputField(title);

    createProfilePage.clickOnEighteenPlusLabel();
    
    js.executeScript("window.scrollBy(0,2000)");
    
    createProfilePage.enterFutureBirthYear();
    
    js.executeScript("window.scrollBy(0,1000)");
    
    createProfilePage.clickOnAvatar();
    
    js.executeScript("window.scrollBy(0,1000)");
  
    createProfilePage.clickOnCreateProfileButton();
    createProfilePage.clickOnChooseProfileButton();
       
    String expectedUrl = "https://qa-interview.united.cloud/create-profile";
    String actualUrl = driver.getCurrentUrl();
        
    assertTrue("URL does not match", expectedUrl.equals(actualUrl));
    
    }
 }   
