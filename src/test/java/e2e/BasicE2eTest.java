package e2e;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.collections.ListSize;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


public class BasicE2eTest {

    void init() {
        // Configuration.downloadsFolder
    }

    @Test
    void userListIsDisplayedE2e() {
        open("/");
        $("a[href='/coffee-shops']").click();
        ElementsCollection coffeshopEls = $$(".coffeeshop-container");
        coffeshopEls.shouldBe(new ListSize(2));
        coffeshopEls.get(0).shouldBe(visible);
    }
}