package web.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import web.pages.GetStarted;

import static com.codeborne.selenide.Condition.text;

public class GetStartedTest extends BaseTest {
    @Test
    @Tags({@Tag("get_started"), @Tag("ui")})
    @DisplayName("Checking title text on 'Get Started' page")
    void checkHomePageTitle() {
        new GetStarted(true).getPageTitleElement().shouldHave(text("How would you like to get started?"));
    }
}
