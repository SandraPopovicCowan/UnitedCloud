
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


    public class ChooseProfilePage {
     private WebDriver driver;
     
    public ChooseProfilePage    (WebDriver driver) {
        this.driver = driver;
    }
    
    private By createNewProfileButton = By.xpath("/html/body/div/div/div/div[2]/button");
    private By avatarOnChooseProfilePage = By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[2]/div/img");
    
    //private By avatarOnChooseProfilePage = By.cssSelector("img[alt^='Avatar']");
   // private By createNewProfileButton = By.xpath("//*[text()=‘Create new profile’]");
    //private By avatar = By.cssSelector("img[alt*='Avatar'][alt*='image']");
    //private By avatar = By.cssSelector("img[alt^='Avatar']");
    //private By avatar = By.cssSelector("img[alt='Avatar image'");
  
    public void clickOnNewProfileButton() {
        driver.findElement(createNewProfileButton).click();
    }
    public void clickOnAvatarOnChooseProfilePage () {
        driver.findElement(avatarOnChooseProfilePage).click();
    }
     
     
     
     
     
     
     
    
}
