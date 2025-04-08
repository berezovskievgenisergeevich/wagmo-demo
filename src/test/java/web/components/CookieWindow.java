package web.components;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class CookieWindow {

    @Step("approve cookie")
    public void approveCookie() {
        $("[data-tid='banner-accept']").click();
    }
}
