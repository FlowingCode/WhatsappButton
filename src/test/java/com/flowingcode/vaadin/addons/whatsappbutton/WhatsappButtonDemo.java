package com.flowingcode.vaadin.addons.whatsappbutton;

import com.flowingcode.vaadin.addons.demo.DemoSource;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@DemoSource
@PageTitle("Whatsapp Button Demo")
@SuppressWarnings("serial")
@Route(value="whatsappbutton", layout=WhatsappButtonDemoView.class)
public class WhatsappButtonDemo extends Div {

  public WhatsappButtonDemo() {

    WhatsappButton whatsappButton = new WhatsappButton();
    
    Div buttonContainer = new Div();
    buttonContainer.setClassName("centered button-container");
    buttonContainer.add(whatsappButton);
    add(buttonContainer);

    // button label
    TextField label = createTextField("Enter a label for the button");
    label.addValueChangeListener(e -> whatsappButton.setLabel(e.getValue()));
    
    // message text
    TextArea text = new TextArea();
    text.setPlaceholder("Enter a text message");
    text.setWidthFull();
    text.setClearButtonVisible(true);
    text.addValueChangeListener(e -> whatsappButton.setText(e.getValue()));
    
    // phone number (dial code + phone number)
    FlexLayout phoneLayout = new FlexLayout();
    phoneLayout.setWidthFull();
    NumberField dialCode = createNumberField("Code");
    dialCode.addClassName("dialcode");
    dialCode.addValueChangeListener(e -> whatsappButton.setDialCode(String.valueOf(e.getValue().intValue())));
    NumberField phone = createNumberField("Phone number");
    phone.addClassName("phone");
    phone.addValueChangeListener(e -> whatsappButton.setPhone(String.valueOf(e.getValue().intValue())));
    phoneLayout.add(dialCode, phone);
    phoneLayout.expand(phone);

    // invite code
    TextField inviteCode = createTextField("Enter a invite code");
    inviteCode.addValueChangeListener(e -> whatsappButton.setInviteCode(e.getValue()));
    
    FormLayout formLayout = new FormLayout();
    formLayout.addClassName("centered");
    formLayout.addFormItem(label, "Label");
    formLayout.addFormItem(text, "Message Text");
    formLayout.addFormItem(phoneLayout, "Phone");
    formLayout.addFormItem(inviteCode, "Invite Code");
    add(formLayout);

    formLayout.setResponsiveSteps(
        new ResponsiveStep("0", 1),
        new ResponsiveStep("900px", 2)
    );

    Checkbox leadingIcon = new Checkbox();
    leadingIcon.addValueChangeListener(e -> whatsappButton.setLeadingIcon(e.getValue()));
    Checkbox redirect = new Checkbox();
    redirect.addValueChangeListener(e -> whatsappButton.setRedirect(e.getValue()));
    Checkbox responsive = new Checkbox();
    responsive.addValueChangeListener(e -> whatsappButton.setResponsive(e.getValue()));
    Checkbox dialog = new Checkbox();
    dialog.addValueChangeListener(e -> whatsappButton.setShowDialog(e.getValue()));

    FormLayout checksLayout = new FormLayout();
    checksLayout.addClassName("centered");
    checksLayout.addFormItem(leadingIcon, "Leading Icon");
    checksLayout.addFormItem(redirect, "Redirect");
    checksLayout.addFormItem(responsive, "Responsive");
    checksLayout.addFormItem(dialog, "Dialog");    
    add(checksLayout);    
  }

  private TextField createTextField(String placeholder) {
    TextField textField = new TextField();
    textField.setPlaceholder(placeholder);
    textField.setWidthFull();
    textField.setClearButtonVisible(true);
    return textField;
  }

  private NumberField createNumberField(String placeholder) {
    NumberField numberField = new NumberField();
    numberField.setPlaceholder(placeholder);
    numberField.setClearButtonVisible(true);
    return numberField;
  }

}
