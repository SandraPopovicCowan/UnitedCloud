/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author mac
 */
    public class ChooseProfilePage {
     private WebDriver driver;
     
    public ChooseProfilePage    (WebDriver driver) {
        this.driver = driver;
    }

    
    private By createNewProfileButton = By.xpath("/html/body/div/div/div/div[2]/button");
    
    private By avatarOnChooseProfilePage = By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div");
    
   // private By createNewProfileButton = By.xpath("//*[text()=‘Create new profile’]");
    //private By avatar = By.cssSelector("img[alt*='Avatar'][alt*='image']");
    
    //private By avatar = By.cssSelector("img[alt='Avatar image'");
    
//    //public void clickOnAvatar () {
//        driver.findElement(avatar).click();
//    }
     
    public void clickOnNewProfileButton() {
        driver.findElement(createNewProfileButton).click();
    }
    
    public void clickOnAvatarOnChooseProfilePage () {
        driver.findElement(avatarOnChooseProfilePage).click();
    }
     
     
     
     
     
     
     
    
}
