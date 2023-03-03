package onliner.pageObject.pages;

import framework.BasePage;
import framework.elements.BaseElement;
import framework.elements.Label;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class CatalogPage extends BasePage {
    private static final By PAGE_LOCATOR = By.xpath("//div[@class='catalog-navigation__title' and text()='Каталог']");
    private static final String PAGE_HEADER = "//h1[contains(.,'%s')]";
    private static final String NAVIGATE_MENU = "//span[@class='catalog-navigation-classifier__item-title-wrapper' and " + BaseElement.containsText + "]";
    private static final String NAV_SUBMENU_CATEGORY = "//div[@class='catalog-navigation-list__category']//span[@class='catalog-navigation-list__dropdown-title' and " + BaseElement.containsText + "]";
    private static final String NAV_SUBMENU_ITEM = "//div[@class='catalog-navigation-list__aside-title' and " + BaseElement.containsText + "]";

    public CatalogPage() {
        super(PAGE_LOCATOR, "Catalog main page");
    }

    public CatalogPage(String pageHeader) {
        super(By.xpath(String.format(PAGE_HEADER, pageHeader)), pageHeader);
    }

    @Step("Click on {menuLabel} label")
    public void navigateToSubmenuLabel(String menuLabel) {
        Label navMenuOnCatalogPage = new Label(By.xpath(String.format(NAVIGATE_MENU, menuLabel)));
        navMenuOnCatalogPage.click();
    }

    @Step("Move mouse to {submenuItem}")
    public void moveToSubmenuItem(String submenuItem) {
        Label submenuLabel = new Label(By.xpath(String.format(NAV_SUBMENU_ITEM, submenuItem)));
        submenuLabel.moveTo();
    }

    @Step("Click on {submenuCategory}")
    public void navigateToSubmenuCategory(String submenuCategory) {
        Label submenuCategoryLabel = new Label(By.xpath(String.format(NAV_SUBMENU_CATEGORY, submenuCategory)));
        submenuCategoryLabel.moveAndClickByAction();
    }
}
