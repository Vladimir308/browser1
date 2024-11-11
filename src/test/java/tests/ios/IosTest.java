package tests.ios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import tests.TestBase;

import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;
import static screens.ios.SampleApp.querySearch;

@Tag("ios")
public class IosTest extends TestBase {
    String result;

    @Test
    @DisplayName("Проверить успешные результаты поиска в приложении Wikipedia")
    public void searchTest() {
        String searchQuery = "Appium";

        step("Выполнить поиск", () ->
                result = querySearch(searchQuery));

        step("Успешный результат", () ->
                assertThat(result).isEqualTo(searchQuery));
    }
}