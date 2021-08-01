import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

    private By searchArea = By.xpath("//input[@class='sc-4995aq-0 sc-14oyvky-0 gHqOYK']");
    private By searchButton = By.xpath("//button[@data-cy='search-find-button']");


    protected WebDriver driver ;
    WebDriverWait wait;

    public SearchPage(WebDriver driver)
    {
        this.driver = driver;
        this.wait= new WebDriverWait(driver,90);

    }
    public void searchPage(String searchText) throws InterruptedException {

        Thread.sleep(500);
        driver.findElement(searchArea).sendKeys(searchText);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        driver.findElement(searchButton).click();


    }

}
