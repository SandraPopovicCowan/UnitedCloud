
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class DeleteProfilePage {
    private WebDriver driver;
    
      
    public DeleteProfilePage (WebDriver driver) {
            this.driver = driver;

}
        
    private By deleteButton = By.className("button--delete"); 
    //private By avatarPicture = By.xpath ("//*[@id=\"app\"]/div/div/div[1]/div/div/img");
    private By chooseProfileButton = By.xpath("//*[text()='Choose profile']");
   
    
    public void clickOnDeleteButton () {
        driver.findElement(deleteButton).click();
    }
        
        
}




