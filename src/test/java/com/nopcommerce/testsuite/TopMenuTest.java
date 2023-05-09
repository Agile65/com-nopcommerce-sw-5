package com.nopcommerce.testsuite;

import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.pages.HomePage;
import com.nopcommerce.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class TopMenuTest extends BaseTest {

    HomePage homePage;


    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyPageNavigation() {

        // Verify Computer page navigation
        homePage.selectMenu("Computers");
        // Verify Computers text
        homePage.verifyComputersPageNavigation("Computers");
        // Verify Electronics page navigation
        homePage.selectMenu("Electronics");
        // Verify Electronic text
        homePage.verifyElectronicsPageNavigation("Electronics");
        // Verify Apparel page navigation
        homePage.selectMenu("Apparel");
        // Verify Apparel text
        homePage.verifyApparelPageNavigation("Apparel");
        // Verify Digital Downloads page navigation
        homePage.selectMenu("Digital Downloads");
        // Verify Digital Downloads Text
        homePage.verifyDigitalDownloadsPageNavigation("Digital downloads");
        // Verify Books page navigation
        homePage.selectMenu("Books");
        // Verify Books page navigation
        homePage.verifyBooksPageNavigation("Books");
        // Verify Jewelry page navigation
        homePage.selectMenu("Jewelry");
        // Verify Jewelry text
        homePage.verifyJewelryPageNavigation("Jewelry");
        // Verify Gift Cards page navigation
        homePage.selectMenu("Gift Cards");
        // Verify Gift Cards text
        homePage.verifyGiftCardsPageNavigation("Gift Cards");
    }
}
