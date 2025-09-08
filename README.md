[![Published on Vaadin Directory](https://img.shields.io/badge/Vaadin%20Directory-published-00b4f0.svg)](https://vaadin.com/directory/component/whatsapp-button-add-on)
[![Stars on vaadin.com/directory](https://img.shields.io/vaadin-directory/star/whatsapp-button-addon.svg)](https://vaadin.com/directory/component/whatsapp-button-add-on)
[![Build Status](https://jenkins.flowingcode.com/job/WhatsappButton-addon/badge/icon)](https://jenkins.flowingcode.com/job/WhatsappButton-addon)
[![Javadoc](https://img.shields.io/badge/javadoc-00b4f0)](https://javadoc.flowingcode.com/artifact/org.vaadin.addons.flowingcode/whatsapp-button-addon)

# Whatsapp Button Add-on

A simple button component to start Whatsapp conversations easily. It's based on [@flowingcode/fc-whatsapp-button web component](https://github.com/FlowingCode/fc-whatsapp-button). 

## Features

- Set custom label
- Set custom message text
- Set dial code & phone number
- Possibility to share an invite code
- Possibility to show icon on leading or trailing position (trailing by default)
- Set redirect 
- Show dialog on click
- Make responsive

## Online demo

[Online demo here](http://addonsv23.flowingcode.com/whatsappbutton)

## Download release

[Available in Vaadin Directory](https://vaadin.com/directory/component/whatsapp-button-add-on)

### Maven install

Add the following dependencies in your pom.xml file:

```xml
<dependency>
   <groupId>com.flowingcode.vaadin.addons</groupId>
   <artifactId>whatsapp-button-addon</artifactId>
   <version>X.Y.Z</version>
</dependency>
```
<!-- the above dependency should be updated with latest released version information -->

```xml
<repository>
   <id>vaadin-addons</id>
   <url>https://maven.vaadin.com/vaadin-addons</url>
</repository>
```

For SNAPSHOT versions see [here](https://maven.flowingcode.com/snapshots/).

## Building and running demo

- git clone repository
- mvn clean install jetty:run

To see the demo, navigate to http://localhost:8080/

## Release notes

See [here](https://github.com/FlowingCode/WhatsappButton/releases)

## Issue tracking

The issues for this add-on are tracked on its github.com page. All bug reports and feature requests are appreciated. 

## Contributions

Contributions are welcome. There are two primary ways you can contribute: by reporting issues or by submitting code changes through pull requests. To ensure a smooth and effective process for everyone, please follow the guidelines below for the type of contribution you are making.

#### 1. Reporting Bugs and Requesting Features

Creating an issue is a highly valuable contribution. If you've found a bug or have an idea for a new feature, this is the place to start.

* Before creating an issue, please check the existing issues to see if your topic is already being discussed.
* If not, create a new issue, choosing the right option: "Bug Report" or "Feature Request". Try to keep the scope minimal but as detailed as possible.

> **A Note on Bug Reports**
> 
> Please complete all the requested fields to the best of your ability. Each piece of information, like the environment versions and a clear description, helps us understand the context of the issue.
> 
> While all details are important, the **[minimal, reproducible example](https://stackoverflow.com/help/minimal-reproducible-example)** is the most critical part of your report. It's essential because it removes ambiguity and allows our team to observe the problem firsthand, exactly as you are experiencing it.

#### 2. Contributing Code via Pull Requests

As a first step, please refer to our [Development Conventions](https://github.com/FlowingCode/DevelopmentConventions) page to find information about Conventional Commits & Code Style requirements.

Then, follow these steps for creating a contribution:
 
- Fork this project.
- Create an issue to this project about the contribution (bug or feature) if there is no such issue about it already. Try to keep the scope minimal.
- Develop and test the fix or functionality carefully. Only include minimum amount of code needed to fix the issue.
- For commit message, use [Conventional Commits](https://github.com/FlowingCode/DevelopmentConventions/blob/main/conventional-commits.md) to describe your change.
- Send a pull request for the original project.
- Comment on the original issue that you have implemented a fix for it.

## License & Author

This add-on is distributed under Apache License 2.0. For license terms, see LICENSE.txt.

Whatsapp Button Add-on is written by Flowing Code S.A.

# Developer Guide

## Getting started

```java
WhatsappButton whatsappButton = new WhatsappButton();
whatsappButton.setLabel("Contact Us");
whatsappButton.setDialCode("342");
whatsappButton.setPhone("123456789");
whatsappButton.setLeadingIcon(true);
whatsappButton.setText("Hi, how can I help you?");
add(whatsappButton);
```

For not mobile devices, redirect should be enabled:
```java
whatsappButton.setRedirect(true);
```

## Special configuration when using Spring

By default, Vaadin Flow only includes ```com/vaadin/flow/component``` to be always scanned for UI components and views. For this reason, the addon might need to be whitelisted in order to display correctly. 

To do so, just add ```com.flowingcode``` to the ```vaadin.whitelisted-packages``` property in ```src/main/resources/application.properties```, like:

```vaadin.whitelisted-packages = com.vaadin,org.vaadin,dev.hilla,com.flowingcode```
 
More information on Spring whitelisted configuration [here](https://vaadin.com/docs/latest/integrations/spring/configuration/#configure-the-scanning-of-packages).
