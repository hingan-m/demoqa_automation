package org.utils;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class General {

    String elements_link = "https://demoqa.com/elements";
    String forms_link = "https://demoqa.com/forms";
    String alerts_link = "https://demoqa.com/alertsWindows";
    String widgets_link = "https://demoqa.com/widgets";
    String interactions_link = "https://demoqa.com/interaction";
    String bookApp_link = "https://demoqa.com/books";

    @Getter
    @FindBy(xpath = "/html/body/div[1]/div/div/form/label/svg/path[2]")
    private WebElement close_Ads;

}
