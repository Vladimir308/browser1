package tests.local;

import org.junit.jupiter.api.*;
import tests.TestBase;

import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static screens.android.WikipediaSearchScreen.*;

@Tag("emulation")
public class OnboardingScreenTest extends TestBase {

    @Test
    @DisplayName("Проверка стартовых страниц Wikipedia")
    public void onboardingScreenTest() {
        String firstText = "The Free Encyclopedia\n…in over 300 languages",
                secondText = "New ways to explore",
                thirdText = "Reading lists with sync",
                fourthText = "Data & Privacy";

        step("Проверяем заголовок первой страницы и переходим на следующую страницу", () -> {
            assertThat(textElement.getText())
                    .isEqualTo(firstText);
            clickContinueButton();
        });

        step("Проверяем заголовок второй страницы и переходим на следующую страницу", () -> {
            assertThat(textElement.getText())
                    .isEqualTo(secondText);
            clickContinueButton();
        });

        step("Проверяем заголовок третьей страницы и переходим на следующую страницу", () -> {
            assertThat(textElement.getText())
                    .isEqualTo(thirdText);
            clickContinueButton();
        });

        step("Проверяем заголовок четвертой страницы и переходим на следующую страницу", () -> {
            assertThat(textElement.getText())
                    .isEqualTo(fourthText);
            clickGetStartButton();
        });

        step("Проверяем, что открылась страница с поиском", () ->
                assertTrue(searchContainer.isEnabled()));
    }
}