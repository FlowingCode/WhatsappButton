package com.flowingcode.vaadin.addons.whatsappbutton;

import com.flowingcode.vaadin.addons.demo.DemoSource;
import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.textfield.IntegerField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinSession;
import com.vaadin.flow.server.WebBrowser;
import org.apache.commons.lang3.StringUtils;

@DemoSource
@PageTitle("Whatsapp Button Demo")
@Route(value = "whatsappbutton/whatsappbutton", layout = WhatsappButtonDemoView.class)
@SuppressWarnings("serial")
public class WhatsappButtonDemo extends Div {

  private Checkbox redirect;

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
    IntegerField dialCode = createIntegerField("Code");
    dialCode.addClassName("dialcode");
    dialCode.addValueChangeListener(e -> whatsappButton
        .setDialCode(e.getValue() != null ? String.valueOf(e.getValue()) : StringUtils.EMPTY));
    IntegerField phone = createIntegerField("Phone number");
    phone.addClassName("phone");
    phone.addValueChangeListener(e -> whatsappButton
        .setPhone(e.getValue() != null ? String.valueOf(e.getValue()) : StringUtils.EMPTY));
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

    formLayout.setResponsiveSteps(new ResponsiveStep("0", 1), new ResponsiveStep("900px", 2));

    Checkbox leadingIcon = new Checkbox();
    leadingIcon.addValueChangeListener(e -> whatsappButton.setLeadingIcon(e.getValue()));
    redirect = new Checkbox();
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

  private IntegerField createIntegerField(String placeholder) {
    IntegerField integerField = new IntegerField();
    integerField.setPlaceholder(placeholder);
    integerField.setClearButtonVisible(true);
    integerField.setValueChangeMode(ValueChangeMode.ON_BLUR);
    return integerField;
  }

  @Override
  protected void onAttach(AttachEvent attachEvent) {
    super.onAttach(attachEvent);
    this.initializeRedirect();
  }

  private void initializeRedirect() {
    UI.getCurrent().getPage().retrieveExtendedClientDetails(details -> {
      WebBrowser webBrowser = VaadinSession.getCurrent().getBrowser();
      boolean isMobile = webBrowser != null && (webBrowser.isAndroid() || webBrowser.isIPhone()
          || webBrowser.isWindowsPhone() || details.isIPad());
      redirect.setValue(!isMobile);
    });
  }

}
