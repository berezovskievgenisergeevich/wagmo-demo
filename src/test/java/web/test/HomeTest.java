package web.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import web.pages.Home;

import static com.codeborne.selenide.Condition.text;

public class HomeTest extends BaseTest {

    @Test
    @Tags({@Tag("home"), @Tag("ui")})
    @DisplayName("Checking title text on Home page")
    void checkHomePageTitle() {
        new Home().getPageTitleElement().shouldHave(text("A new breed of pet care"));
    }

    @Test
    @Tags({@Tag("home"), @Tag("ui")})
    @DisplayName("Checking click 'Get Started' button")
    void checkClickGetStartedButton() {
        new Home().clickGetStarted().getPageTitleElement().shouldHave(text("How would you like to get started?"));
    }

    @Test
    @Tags({@Tag("home"), @Tag("ui")})
    @DisplayName("Checking click 'Pet Parents' button")
    void checkClickPetParentsButton() {
        new Home().clickForPetParents().getPageTitleElement().shouldHave(text("Pet care from head to tail"));
    }

    @Test
    @Tags({@Tag("home"), @Tag("ui")})
    @DisplayName("Checking click 'For Business' button")
    void checkClickForBusinessButton() {
        new Home().clickForBusiness().getPageTitleElement().shouldHave(text("Discover Wagmo for your business"));
    }

    @Test
    @Tags({@Tag("home"), @Tag("ui")})
    @DisplayName("Checking click 'Support Hub' button")
    void checkClickSupportButton() {
        new Home().clickSupportHub().getPageTitleElement().shouldHave(text("Support Hub"));
    }
}
