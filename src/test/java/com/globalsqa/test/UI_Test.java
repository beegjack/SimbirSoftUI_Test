package com.globalsqa.test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class UI_Test {

    @BeforeAll
    static void configure(){
        Configuration.baseUrl = "https://www.globalsqa.com";
        Configuration.browserSize ="1280x720";
        Configuration.browserPosition = "0x0";
        //Configuration.holdBrowserOpen = true;
    }

    @Test
    void testAddCustomer(){
        open("/angularJs-protractor/BankingProject/#/manager");
        $(byXpath("/html/body/div/div/div[2]/div/div[1]/button[1]")).click();
        $(byXpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).setValue("Anton");
        $(byXpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).setValue("Shugaev");
        $(byXpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).setValue("E99999");
        $(byXpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
    }

    @Test
    void testSortCustomer(){
        open("/angularJs-protractor/BankingProject/#/manager/list");
        $(byXpath("/html/body/div/div/div[2]/div/div[2]/div/div/table/thead/tr/td[1]/a")).doubleClick();
    }

    @Test
    void testSearchCustomer(){
        open("/angularJs-protractor/BankingProject/#/manager/list");
        $(byXpath("/html/body/div/div/div[2]/div/div[2]/div/form/div/div/input")).setValue("Weasly");
    }
}