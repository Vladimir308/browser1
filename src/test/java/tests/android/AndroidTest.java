package tests.android;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.TestBase;

import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;
import static screens.Wikipedia.*;

public class AndroidTest extends TestBase {
    String result;

    @Tag("android")
    @Test
    void unsuccessfulOpenArticleTest() {
        String searchQuery = "Appium";

        step("Type search", () ->
                searchQuery(searchQuery));

        step("Verify content found", () ->
                assertThat(TEXT_VIEW)
                        .hasSizeGreaterThan(0));

        step("Open a random article", () ->
                result = openRandomArticle());

        step("Check for errors", () ->
                assertThat(result)
                        .isEqualTo("An error occurred"));
    }
}