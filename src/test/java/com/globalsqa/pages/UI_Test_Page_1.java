package com.globalsqa.pages;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class UI_Test_Page_1 {
    public UI_Test_Page_1 openPage_1() {
        open("/angularJs-protractor/BankingProject/#/manager");

        return this;
    }

    public UI_Test_Page_1 addCustomer() {
        $(byXpath("/html/body/div/div/div[2]/div/div[1]/button[1]")).click();

        return this;
    }

    public UI_Test_Page_1 setFirstName(String value) {
        $(byXpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).setValue(value);

        return this;
    }
    public UI_Test_Page_1 setLastName(String value) {
        $(byXpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).setValue(value);

        return this;
    }
    public UI_Test_Page_1 setCode(String value) {
        $(byXpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).setValue(value);

        return this;
    }
    public UI_Test_Page_1 submit() {
        $(byXpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();

        return this;
    }

}
