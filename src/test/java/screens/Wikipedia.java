package screens;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.*;
import static io.appium.java_client.AppiumBy.id;

public class Wikipedia {

    public static final SelenideElement
            TEXT_ELEMENT = $(id("org.wikipedia.alpha:id/primaryTextView")),
            SEARCH_CONTAINER = $(id("org.wikipedia.alpha:id/search_container"));
    private static final SelenideElement
            CONTINUE_BUTTON = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")),
            DONE_BUTTON = $(id("org.wikipedia.alpha:id/fragment_onboarding_done_button"));
    private static final SelenideElement SEARCH_BAR_ELEMENT = $(id("org.wikipedia.alpha:id/search_src_text"));
    public static final ElementsCollection TEXT_VIEW = $$(className("android.widget.TextView"));
    private static final ElementsCollection TITLE_LIST = $$(id("org.wikipedia.alpha:id/page_list_item_title"));

    public static void clickContinueButton() {
        CONTINUE_BUTTON.click();
    }

    public static void clickGetStartButton() {
        DONE_BUTTON.click();
    }

    public static void searchQuery(String query) {
        $(accessibilityId("Search Wikipedia")).click();
        SEARCH_BAR_ELEMENT.sendKeys(query);
    }

    public static String openRandomArticle() {

        var numberArticles = getRandomNumber(TITLE_LIST.size());
        TITLE_LIST
                .get(numberArticles)
                .click();
        return TEXT_VIEW
                .get(0)
                .getAttribute("text");
    }

    private static Integer getRandomNumber(Integer maxNumber) {
        return (int) (Math.random() * maxNumber);
    }
}