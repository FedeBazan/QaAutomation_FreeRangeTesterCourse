package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage extends BasePage{
    
    private By searchButton = By.className("gNO89b");
    private By searchTextField= By.id("APjFqb");

    public GooglePage() {
        super(driver);
    }

    public void navigateToGoogle(){
        navigateTo("https://www.google.com.ar/");
    }

    public void clickGoogleSearch(){
        clickElement(searchButton);
    }

    public void enterSearchCriteria (String criteria){
        write(searchTextField, criteria);
    }
}
