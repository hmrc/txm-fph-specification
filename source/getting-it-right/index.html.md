---
title: Getting it right - Fraud prevention
weight: 50
description: Page description for search engines
---

# Getting it right

<div class="govuk-warning-text">
  <span class="govuk-warning-text__icon" aria-hidden="true">!</span>
  <strong class="govuk-warning-text__text">
    <span class="govuk-warning-text__assistive">Warning</span>
    You are required by law to submit all header data for your connection method.
  </strong>
</div>

## Missing header data

Most organisations are able to send all header data required for their connection method.

In some cases, you might not be able to collect a value due to restrictions beyond your reasonable control. Thi

* operating system or platform restrictions beyond your reasonable control
* security measures beyond your reasonable control

For example, an application connecting directly to HMRC might not be able to submit a username for Gov-Client-User-IDs if the operating system of the originating device has no concept of user accounts.

<p class="panel panel-border-wide">In unusual cases like this, you can submit the header with an empty value or omit it entirely. We may contact you for more details.</p>

If you leave a header empty, do not submit null values. These examples are not valid:

<ul>
  <li><span class="code--slim">Gov-Client-User-IDs: null</span></li>
  <li><span class="code--slim">Gov-Client-User-IDs: nil</span></li>
  <li><span class="code--slim">Gov-Client-User-IDs: undefined</span></li>
</ul>


### Using third-party software and libraries

If you use or plan to use third-party software and libraries, make sure you can still collect header data. Examples include an extension to an Enterprise Resource Planning (ERP) system or a plug-in to a spreadsheet application.


## Contact us

If you need to contact us, email SDSTeam@hmrc.gov.uk
