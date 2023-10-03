package com.globalsqa.test;

import com.codeborne.selenide.Configuration;
import com.globalsqa.pages.UI_Test_Page_1;
import com.globalsqa.pages.UI_Test_Page_2;
import com.globalsqa.pages.UI_Test_Page_3;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class UI_Test {
    UI_Test_Page_1 ui_test_page_1 = new UI_Test_Page_1();
    UI_Test_Page_2 ui_test_page_2 = new UI_Test_Page_2();
    UI_Test_Page_3 ui_test_page_3 = new UI_Test_Page_3();

    @BeforeAll
    static void configure(){
        Configuration.baseUrl = "https://www.globalsqa.com";
        Configuration.browserSize ="1280x720";
        Configuration.browserPosition = "0x0";
        //Configuration.holdBrowserOpen = true;
    }

    @Test
    void testAddCustomer(){
        ui_test_page_1.openPage_1()
                .addCustomer()
                .setFirstName("Anton")
                .setLastName("Shugaev")
                .setCode("E99999")
                .submit();
    }

    @Test
    void testSortCustomer(){
        ui_test_page_2.openPage2()
                .sortByName();
    }

    @Test
    void testSearchCustomer(){
        ui_test_page_3.openPage3()
                .searchByName("Weasly");
    }
}