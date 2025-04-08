package web.pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class GetStarted {
    public final String pageUrl = "/get-started";

    public GetStarted(boolean flag) {
        if (flag) {
            step("Open page: " + Configuration.baseUrl + pageUrl,
                    () -> open(pageUrl));
        }

    }

    @Step("get Page Title")
    public SelenideElement getPageTitleElement() {
        return $("[attributes='[object Object]'] p");
    }

    @Step("click to 'Purchase Plan'")
    public Start clickToPurchasePlan() {
        $(byText("Purchase Plan")).click();
        return new Start(false);
    }

}
