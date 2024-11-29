package web.pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class GooglePage {

    public GooglePage() {
        step("Open page: " + Configuration.baseUrl,
                () -> open("/"));
    }

    @Step("Enter request: {request}")
    public GooglePage setRequest(String request) {
        $("[name='q']").val(request).pressEnter();
        return this;
    }

    @Step("get Result")
    public SelenideElement getResult() {
        return $("div.g h3");
    }


}
