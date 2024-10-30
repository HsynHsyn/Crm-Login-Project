package nextBaseCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TimeAndReportsPage extends BasePage{

    @FindBy(css = "a[title='Time and Reports']")
    public  WebElement timeAndReports;

    @FindBy(xpath = "//div[@id='top_menu_id_timeman']/div[not(position()=6)]")
    public List<WebElement> timeAndReportsMenuItems;

    @FindBy(xpath = "//div[@id='top_menu_id_timeman']/div[2]")
    public  WebElement workTimeModule;

    @FindBy(css = "input[type='checkbox']")
    public List<WebElement> workTimeModuleCheckboxes;

}
