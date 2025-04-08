package web.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class Business {
    @Step("get Page Title")
    public SelenideElement getPageTitleElement() {
        return $("[attributes='[object Object]'] h1");
    }
}
