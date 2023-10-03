package com.globalsqa.pages;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class UI_Test_Page_2 {

    public UI_Test_Page_2 openPage2() {
        open("/angularJs-protractor/BankingProject/#/manager/list");

        return this;
    }
    public UI_Test_Page_2 sortByName() {
        $(byXpath("/html/body/div/div/div[2]/div/div[2]/div/div/table/thead/tr/td[1]/a")).doubleClick();

        return this;
    }
}
