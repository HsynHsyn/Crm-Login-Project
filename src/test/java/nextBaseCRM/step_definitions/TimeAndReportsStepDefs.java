package nextBaseCRM.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import nextBaseCRM.pages.TimeAndReportsPage;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TimeAndReportsStepDefs {

    TimeAndReportsPage timeAndReportsPage = new TimeAndReportsPage();

    @When("the user navigates to the Time and Reports menu")
    public void the_user_navigates_to_the_time_and_reports_menu() {
        timeAndReportsPage.timeAndReports.click();
    }
    @Then("the user should see the following five modules")
    public void the_user_should_see_the_following_five_modules(List<String> expectedMenuItems) {

        List<WebElement> menuItems = timeAndReportsPage.timeAndReportsMenuItems;
        List<String> actualMenuItems = new ArrayList<>();

        for (WebElement each : menuItems) {
            actualMenuItems.add(each.getText());
        }
        assertEquals(expectedMenuItems, actualMenuItems);
    }

    @When("the user navigates to the Worktime module")
    public void the_user_navigates_to_the_worktime_module() {
        timeAndReportsPage.workTimeModule.click();
    }

    @Then("the user should see {int} checkboxes in the Worktime module")
    public void the_user_should_see_checkboxes_in_the_worktime_module(int expectedNumberOfCheckBoxes) {

        List<WebElement> checkBoxes = timeAndReportsPage.workTimeModuleCheckboxes;
        int actualNumberOfCheckBoxes = checkBoxes.size();
        assertEquals(expectedNumberOfCheckBoxes, actualNumberOfCheckBoxes);

    }

    @Then("the Statistics checkbox should be selected by default")
    public void the_statistics_checkbox_should_be_selected_by_default() {

    }

}
