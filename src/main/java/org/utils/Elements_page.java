package org.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Elements_page {

    /**TEXT BOX*/
    @FindBy(id = "item-0")
    private WebElement text_box;

    @FindBy(id = "userName")
    private WebElement username;

    @FindBy(id = "userEmail")
    private WebElement email;

    @FindBy(id = "currentAddress")
    private WebElement current_address;

    @FindBy(id = "permanentAddress")
    private WebElement permanent_address;

    @FindBy(id = "submit")
    private WebElement submit_button;

    @FindBy(id = "output")
    private WebElement output;

    public WebElement getText_box() {
        return text_box;
    }

    public void setText_box(WebElement text_box) {
        this.text_box = text_box;
    }

    public WebElement getUsername() {
        return username;
    }

    public void setUsername(WebElement username) {
        this.username = username;
    }

    public WebElement getEmail() {
        return email;
    }

    public void setEmail(WebElement email) {
        this.email = email;
    }

    public WebElement getCurrent_address() {
        return current_address;
    }

    public void setCurrent_address(WebElement current_address) {
        this.current_address = current_address;
    }

    public WebElement getPermanent_address() {
        return permanent_address;
    }

    public void setPermanent_address(WebElement permanent_address) {
        this.permanent_address = permanent_address;
    }

    public WebElement getSubmit_button() {
        return submit_button;
    }

    public void setSubmit_button(WebElement submit_button) {
        this.submit_button = submit_button;
    }

    public WebElement getOutput() {
        return output;
    }

    public void setOutput(WebElement output) {
        this.output = output;
    }
}


