package web.pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import web.components.CookieWindow;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class Start {
    public final String pageUrl = "/start";

    public Start(boolean flag) {
        if (flag) {
            step("Open page: " + Configuration.baseUrl + pageUrl,
                    () -> open(pageUrl));
            new CookieWindow().approveCookie();
        }
    }


    @Step("click to 'Next' button")
    public Start clickNext() {
        $("[data-cy='arrow-button']").parent().click();
        return this;
    }

    @Step("get Name Error message")
    public SelenideElement getNameErrorMessageElement() {
        return $("[id=':r0:-helper-text']");

    }

    @Step("get Type Error message")
    public SelenideElement getTypeErrorMessageElement() {
        return $("[id='radio-group-petType']").parent().$(".text-error");
    }

    @Step("get Gender Error message")
    public SelenideElement getGenderErrorMessageElement() {
        return $("[id='radio-group-petGender']").parent().$(".text-error");
    }

}
