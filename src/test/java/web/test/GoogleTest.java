package web.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import web.pages.GooglePage;

import static com.codeborne.selenide.Condition.text;

public class GoogleTest extends BaseTest {
    @Test
    @Tags({@Tag("google"), @Tag("ui")})
    @DisplayName("Checking the first search result for the presence of a search name")
    void checkCreateNewCustomerModuleIsExists() {
        new GooglePage().setRequest(testData.SEARCH_SELENIDE)
                .getResult()
                .shouldHave(text(testData.SEARCH_SELENIDE));
    }
}
