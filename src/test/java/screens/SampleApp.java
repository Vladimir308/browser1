package screens;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;

public class SampleApp {
    private static final SelenideElement TEXT_BUTTON = $(accessibilityId("Text Button"));
    private static final SelenideElement TEXT_INPUT = $(accessibilityId("Text Input"));
    private static final SelenideElement TEXT_OUTPUT = $(accessibilityId("Text Output"));

    public static String querySearch(String query) {
        TEXT_BUTTON.click();
        TEXT_INPUT.click();
        TEXT_INPUT.sendKeys(query);
        TEXT_INPUT.pressEnter();
        return TEXT_OUTPUT.getText();
    }
}