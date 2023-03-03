package onliner.steps;

import io.cucumber.java.en.*;
import onliner.pageObject.pages.*;

public class NavigationSteps {
    MainPage mainPage = new MainPage();
    CatalogPage catalogPage = new CatalogPage();

    @Given("Go to {string}")
    public void goTo(String arg0) {
        mainPage.assertIsPageOpened();
    }

    @When("User navigates to the {string} page")
    public void userNavigatesToThePage(String arg0) {
        mainPage.navigateWithHeaderLabel(arg0);
    }

    @And("User selects {string} from the navigation menu")
    public void userSelectsFromTheNavigationMenu(String arg0) {catalogPage.navigateToSubmenuLabel(arg0);}

    @And("User hovers mouse over {string} label")
    public void userMovesMouseOnLabel(String arg0) {
        catalogPage.moveToSubmenuItem(arg0);
    }

    @And("User clicks on {string} label")
    public void userClicksOnLabel(String arg0) {
        catalogPage.navigateToSubmenuCategory(arg0);
    }

    @Then("{string} category page opened")
    public void pageOpened(String arg0) {
        CatalogPage categoryPage = new CatalogPage(arg0);
        categoryPage.assertIsPageOpened();
    }
}
