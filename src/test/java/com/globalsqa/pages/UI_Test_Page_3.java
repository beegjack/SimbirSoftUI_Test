package com.globalsqa.pages;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class UI_Test_Page_3 {

    public UI_Test_Page_3 openPage3(){
        open("/angularJs-protractor/BankingProject/#/manager/list");

        return this;
    }
    public UI_Test_Page_3 searchByName(String value) {
        $(byXpath("/html/body/div/div/div[2]/div/div[2]/div/form/div/div/input")).setValue(value);

        return this;
    }
}
