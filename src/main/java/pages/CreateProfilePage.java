
package pages;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


    public class CreateProfilePage {
        private WebDriver driver;
    
    public CreateProfilePage(WebDriver driver) {
        this.driver = driver;
    }
    
    private By createNewProfileButton = By.className("button--primary");
    private By homeHeaderButton = By.className("header__button");
    private By nameInputField = By.id("profile-name");
    private By zeroToSixAge = By.xpath("//*[@id=\"app\"]/div/div/div/form/div[2]/div/div[1]/label");
    private By sevenToElevenAge = By.xpath("//*[@id=\"app\"]/div/div/div/form/div[2]/div/div[2]/label");
    private By twelveToFourteenAge = By.xpath("//*[@id=\"app\"]/div/div/div/form/div[2]/div/div[3]/label");
    private By fifteenToSeventeeAge = By.xpath("//*[@id=\"app\"]/div/div/div/form/div[2]/div/div[4]/label");
    private By eighteenPlusAge = By.xpath("//*[@id=\"app\"]/div/div/div/form/div[2]/div/div[5]/label");
    private By enterBirthYear = By.className("input-wrapper__label");
    private By submitProfileButton = By.xpath("//*[@id=\"app\"]/div/div/div/form/button");
    //private By avatar = By.xpath("//img[@alt='Avatar']");
    private By avatar = By.xpath("//html/body/div/div/div/div/form/div[3]/div/div[6]/label/div/img");
    private By profileName = By.className("card__profile-name");
    
    public void clickOnCreateNewProfileButton() {
        driver.findElement(createNewProfileButton).click();
    }
    public void clickOnHomeHeaderButton() {
        driver.findElement(homeHeaderButton).click();
    }
    
    
    public void enterNameInputField(String title) {
        driver.findElement(nameInputField).sendKeys(title);
    }
    public void clickOnZeroToSixLabel() {
        driver.findElement(zeroToSixAge).click();
    }
    public void clickOnSevenToElevenLabel() {
        driver.findElement(sevenToElevenAge).click();
    }
    public void clickOnTwelveToFourteenLabel() {
        driver.findElement(twelveToFourteenAge).click();
    }
      public void clickOnFifteenToSeventeenLabel() {
        driver.findElement(fifteenToSeventeeAge).click();
    }
    public void clickOnEighteenPlusLabel() {
        driver.findElement(eighteenPlusAge).click();
    }

    int birthYear = 1900 + new Random().nextInt(104);
    public void enterBirthYear() {
           driver.findElement(enterBirthYear).click();
           driver.findElement(enterBirthYear).sendKeys(Integer.toString(birthYear));
       }
    
    int futureBirthYear = 2021 + new Random().nextInt(10);
    public void enterFutureBirthYear() {
        driver.findElement(enterBirthYear).click();
        driver.findElement(enterBirthYear).sendKeys(Integer.toString(futureBirthYear));
    }
   
    public void clickOnCreateProfileButton () {
        driver.findElement(submitProfileButton).click();
    }
    
    public void clickOnAvatar () {
        driver.findElement(avatar).click();
    }
    
    public String getProfileName() {
       return  driver.findElement(profileName).getText();
    }
 
    
    
    
    
}
