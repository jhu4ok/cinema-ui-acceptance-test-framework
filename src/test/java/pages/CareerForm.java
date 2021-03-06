package pages;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Data
public class CareerForm extends BasePage {

    @FindBy(css = "#feedback > div > div.support_option.kariera.cl_bk")
    WebElement careerFeedbackForm;

    @FindBy(css = "body > div.bto.contact_form > div.body_form > form")
    WebElement careerForm;

    public WebElement getCareerFormElement(String elementName) {
        WebElement webElement = null;
        switch (elementName) {
            case "CAREER_FEEDBACK":
                webElement = getCareerFeedbackForm();
                break;
            case "CAREER":
                webElement = getCareerForm();
                break;
            default:
                LOG.error("Unsupported elements type: " + elementName);
        }
        return webElement;
    }
}
