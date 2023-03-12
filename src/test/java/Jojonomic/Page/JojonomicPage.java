package Jojonomic.Page;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


public class JojonomicPage {

    public static final String NavPage_URL = "https://www.service.nsw.gov.au/";
    public static final By Search = By.xpath("//section[@class='personalised-content']/div[@class='region']/div[1]//input[@name='q']");
    public static final By Button_Search = By.xpath("//section[@class='personalised-content']/div[@class='region']/div[1]//button[@class='button button--primary']");
    public static final By Search_Nav = By.id("main-content");
    public static final By Locate = By.xpath("//ul[@class='MainNav__list-peZtddYtxn']/li[.='Find locations']");
    public static final String Locate_URL = "https://www.service.nsw.gov.au/service-centre";
    public static final By Search_Suburb = By.id("locatorTextSearch");
    public static final By Button_Search_Suburb = By.xpath("//button[@class='button button--primary button--xxlarge']");


    @Step
    public By validateServiceCenterName(String name) {
        getDriver().findElement(By.xpath("//div[@class='locator__results-list']/div[contains(.,'" + name + "')]"));
        return validateServiceCenterName(name);
    }
}

