package tests.android;

import org.junit.jupiter.api.Test;
import tests.TestBase;

import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

public class SimpleTest extends TestBase {

    @Test
    void searchTest() {

        step("Type search", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Appium");
        });

        step("Verify content found", () ->
                assertThat($$(className(
                        "android.widget.TextView"))).hasSizeGreaterThan(0));
    }
}