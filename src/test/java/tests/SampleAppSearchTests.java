package tests;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.ios.SampleAppSearchResultsScreen;
import screens.ios.SampleAppSearchScreen;

import static org.assertj.core.api.Assertions.assertThat;
@Tag("ios")
public class SampleAppSearchTests extends TestBase {

    SampleAppSearchScreen searchScreen = new SampleAppSearchScreen();
    SampleAppSearchResultsScreen searchResultsScreen = new SampleAppSearchResultsScreen();

    String query = "Appium";

    @Test
    void successfulSearchTest() {
        searchScreen.searchFor(query);
        assertThat(searchResultsScreen.getResult()).isEqualTo(query);
    }
}