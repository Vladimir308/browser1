package tests.android;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.TestBase;

import static org.assertj.core.api.Assertions.assertThat;

@Tag("android")
public class WikipediaTests extends TestBase {

    @Test
    @DisplayName("Verify Successful Search Results in Wikipedia App")
    public void  successfulSearchTest() {
        String query = "Appium";
        searchScreen.searchFor(query);
        assertThat(searchResultsScreen.getResultsCount()).isGreaterThan(0);
    }

    @Test
    @DisplayName("Verify Error Message for Unsuccessful Search in Wikipedia App")
    public void unsuccessfulSearchTest() {
        String query = "Java";
        searchScreen.searchForUnsuccessful(query);
        searchResultsScreen.ResultError();
    }

    @Test
    @DisplayName("Checking the presence of the Log in button")
    public void checkLogInButtonTest() {
        searchScreen.loginButton();
        searchResultsScreen.ResultLogin();
    }
}