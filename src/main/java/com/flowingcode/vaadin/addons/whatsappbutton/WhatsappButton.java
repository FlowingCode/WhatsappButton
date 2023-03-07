/*-
 * #%L
 * Whatsapp Button Add-on
 * %%
 * Copyright (C) 2022 Flowing Code
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

package com.flowingcode.vaadin.addons.whatsappbutton;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@SuppressWarnings("serial")
@Tag("fc-whatsapp-button")
@NpmPackage(value = "@flowingcode/fc-whatsapp-button", version = "1.0.3")
@JsModule("@flowingcode/fc-whatsapp-button/dist/src/fc-whatsapp-button.js")
public class WhatsappButton extends Component {

    public WhatsappButton() {}

    /**
     * Returns the phone number.
     * 
     * @return String return the phone number
     */
    public String getPhone() {
        return this.getElement().getProperty("phone");
    }

    /**
     * Sets a phone number.
     * 
     * @param phone the phone number to set
     */
    public void setPhone(String phone) {
        this.getElement().setProperty("phone", phone);
    }

    /**
     * Returns the dial code.
     * 
     * @return String return the dialCode
     */
    public String getDialCode() {
        return this.getElement().getProperty("dialcode");
    }

    /**
     * Sets a dial code number.
     * 
     * @param dialCode the dialCode to set
     */
    public void setDialCode(String dialCode) {
        this.getElement().setProperty("dialcode", dialCode);
    }

    /**
     * Returns the button's label.
     * 
     * @return String return the label
     */
    public String getLabel() {
        return this.getElement().getProperty("label");
    }

    /**
     * Sets the button's label. Default value is "Let's chat".
     * 
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.getElement().setProperty("label", label);
    }

    /**
     * Returns the message text.
     * 
     * @return String return the text
     */
    public String getText() {
        return this.getElement().getProperty("text");
    }

    /**
     * Sets an invite code.
     * 
     * @param invite code the invite code to set
     */
    public void setInviteCode(String inviteCode) {
        this.getElement().setProperty("invitecode", inviteCode);
    }

    /**
     * Returns an invite code.
     * 
     * @return String return the invite code
     */
    public String getInviteCode() {
        return this.getElement().getProperty("invitecode");
    }

    /**
     * Sets the message text to display. Default value is "Hi!".
     * 
     * @param text the message text to set
     */
    public void setText(String text) {
        this.getElement().setProperty("text", text);
    }

    /***
     * Returns whether the button's icon is leading or not.
     * 
     * @return boolean true if icon is leading
     */
    public boolean isLeadingIcon() {
        return this.getElement().getProperty("leading", false);
    }

    /**
     * Sets if button's icon should be in leading position or not. By default icon is trailing.
     * 
     * @param leading true to enable leading
     */
    public void setLeadingIcon(boolean leading) {
        this.getElement().setProperty("leading", leading);
    }

    /**
     * Returns whether redirect is enabled or not.
     * 
     * @return boolean the redirect value
     */
    public boolean isRedirect() {
        return this.getElement().getProperty("redirect", false);
    }

    /**
     * Sets redirect option. This value should be true when button is use in not mobile devices.
     * 
     * @param redirect true to enable redirect
     */
    public void setRedirect(boolean redirect) {
        this.getElement().setProperty("redirect", redirect);
    }

    /**
     * Returns whether responsive is enabled or not.
     * 
     * @return boolean the responsive value
     */
    public boolean isResponsive() {
        return this.getElement().getProperty("responsive", false);
    }

    /**
     * Sets responsive option.
     * 
     * @param redirect true to enable redirect
     */
    public void setResponsive(boolean responsive) {
        this.getElement().setProperty("responsive", responsive);
    }

    /**
     * Returns whether dialog should be shown on button click.
     * 
     * @return boolean the show dialog value
     */
    public boolean isShowDialog() {
        return this.getElement().getProperty("dialog", false);
    }

    /**
     * Sets dialog option. If true, a dialog will show on button click indicating whatsapp is
     * opening.
     * 
     * @param redirect true to enable redirect
     */
    public void setShowDialog(boolean dialog) {
        this.getElement().setProperty("dialog", dialog);
    }

}
