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
@NpmPackage(value = "@flowingcode/fc-whatsapp-button", version = "1.0.1")
@JsModule("@flowingcode/fc-whatsapp-button/dist/src/fc-whatsapp-button.js")
public class WhatsappButton extends Component {

    public WhatsappButton() {}

    /**
     * @return String return the phone number
     */
    public String getPhone() {
        return this.getElement().getProperty("phone");
    }

    /**
     * @param phone the phone number to set
     */
    public void setPhone(String phone) {
        this.getElement().setProperty("phone", phone);
    }

    /**
     * @return String return the dialCode
     */
    public String getDialCode() {
        return this.getElement().getProperty("dialcode");
    }

    /**
     * @param dialCode the dialCode to set
     */
    public void setDialCode(String dialCode) {
        this.getElement().setProperty("dialcode", dialCode);
    }

    /**
     * @return String return the label
     */
    public String getLabel() {
        return this.getElement().getProperty("label");
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.getElement().setProperty("label", label);
    }

    /**
     * @return String return the text
     */
    public String getText() {
        return this.getElement().getProperty("text");
    }

    /**
     * @param text the text to set
     */
    public void setInviteCode(String inviteCode) {
        this.getElement().setProperty("invitecode", inviteCode);
    }

    public String getInviteCode() {
        return this.getElement().getProperty("invitecode");
    }

    public void setText(String text) {
        this.getElement().setProperty("text", text);
    }

    public boolean isLeadingIcon() {
        return this.getElement().getProperty("leading", false);
    }

    public void setLeadingIcon(boolean leading) {
        this.getElement().setProperty("leading", leading);
    }

    public boolean isRedirect() {
        return this.getElement().getProperty("redirect", false);
    }

    public void setRedirect(boolean redirect) {
        this.getElement().setProperty("redirect", redirect);
    }

    public boolean isResponsive() {
        return this.getElement().getProperty("responsive", false);
    }

    public void setResponsive(boolean responsive) {
        this.getElement().setProperty("responsive", responsive);
    }

    public boolean isShowDialog() {
        return this.getElement().getProperty("dialog", false);
    }

    public void setShowDialog(boolean dialog) {
        this.getElement().setProperty("dialog", dialog);
    }

}
