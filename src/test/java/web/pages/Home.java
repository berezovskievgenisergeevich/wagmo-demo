package web.pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class Home {
    public Home() {
        step("Open page: " + Configuration.baseUrl,
                () -> open("/"));
    }

    @Step("get Page Title")
    public SelenideElement getPageTitleElement() {
        return $("[builder-type='blocks'] p");
    }

    @Step("click to 'Get Started' button")
    public GetStarted clickGetStarted() {
        $(byText("Get Started")).click();
        return new GetStarted(false);
    }

    @Step("click to 'For Pet Parents' menu button")
    public ForPetParents clickForPetParents() {
        $(byText("For Pet Parents")).click();
        return new ForPetParents();
    }

    @Step("click to 'For Business' menu button")
    public Business clickForBusiness() {
        $(byText("For Business")).click();
        return new Business();
    }

    @Step("click to 'Support Hub' menu button")
    public Support clickSupportHub() {
        $(byText("Support Hub")).click();
        return new Support();
    }


}
