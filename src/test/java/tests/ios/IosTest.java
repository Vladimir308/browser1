package tests.ios;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import tests.TestBase;

import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;
import static screens.SampleApp.querySearch;

public class IosTest extends TestBase {
    String result;

    @Tag("ios")
    @Test
    void searchTest() {
        String searchQuery = "Appium";

        step("Type search", () ->
                result = querySearch(searchQuery));

        step("Verify result", () ->
                assertThat(result).isEqualTo(searchQuery));
    }
}