package onliner.steps;

import io.cucumber.java.en.*;
import onliner.pageObject.pages.AvtobaracholkaPage;
import java.util.HashMap;
import java.util.Map;

public class FiltrationSteps {
    AvtobaracholkaPage avtobaracholkaPage = new AvtobaracholkaPage();
    Map<String,String> testData = new HashMap<>();

    @And("User sets {string} - {string}{string} range for {string} filter")
    public void userSelectsFromTheNavigationMenu(String arg0, String arg1, String arg2, String arg3) {
        avtobaracholkaPage.setRangeForPriceFilter(arg0, arg1, arg2);

        String curr = null;
        if(arg2.equals("USD")) curr = "$";
        if(arg0.equals(""))testData.put(curr+" price lesser",arg1);
    }

    @And("User sets {string} for {string} checkbox filter")
    public void setCheckboxFilter(String arg0, String arg1) {
        avtobaracholkaPage.selectCheckboxForFilter(arg0, arg1);
        testData.put(arg1,arg0);
    }
    @Then("Parameters for all car cards are correct")
    public void pageOpened() {
        avtobaracholkaPage.checkElementsData(testData);
    }
}