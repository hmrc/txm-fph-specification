---
title: Getting it right - Fraud prevention
weight: 50
description: Page description for search engines
---

# Getting it right

Version 2.9 issued 5 March 2020

## Send data in the correct format

Header data contents must be submitted using the US-ASCII character set, with other characters <a href="https://tools.ietf.org/html/rfc3986#section-2.1"> percent encoded (opens in a new tab)</a>. 

Each header has additional formatting requirements.  


### Key-value encoding

Whenever a header contains a key-value data structure, you must use this format:

<code>&lt;key-1&gt;=&lt;value-1&gt;&amp;&lt;key-2&gt;=&lt;value-2&gt;&amp;&hellip;</code>

Whenever a key is applicable but has no applicable value, you can omit the key-value pair or include the key with an empty value.

Keys and values must be <a href="https://tools.ietf.org/html/rfc3986#section-2.1"> percent encoded (opens in a new tab)</a>.

Key-value pairs can be submitted in any order.


### List encoding

Whenever a header contains a list, you must use this format:

<code>&lt;value-1&gt;,&lt;value-2&gt;,&hellip;</code>

Values must be <a href="https://tools.ietf.org/html/rfc3986#section-2.1"> percent encoded (opens in a new tab)</a>.

Values must not be empty.


## Missing header data

<div class="govuk-warning-text">
  <span class="govuk-warning-text__icon" aria-hidden="true">!</span>
  <strong class="govuk-warning-text__text">
    <span class="govuk-warning-text__assistive">Warning</span>
    You are required by law to submit all header data for your connection method.
  </strong>
</div>

Most organisations are able to send all header data required for their connection method.

In some exceptional cases, you might not be able to collect a value due to restrictions beyond your reasonable control.

* operating system or platform restrictions beyond your reasonable control
* security measures beyond your reasonable control

For example, an application connecting directly to HMRC might not be able to submit a username for Gov-Client-User-IDs if the operating system of the originating device has no concept of user accounts.

<div class="govuk-inset-text">
You can only submit a header with an empty value or omit it entirely in exceptional cases. We may contact you for more details.
</div>

If you leave a header empty, do not submit any value including null values. These examples are not valid:

<ul>
  <li><span class="code--slim">Gov-Client-User-IDs: null</span></li>
  <li><span class="code--slim">Gov-Client-User-IDs: nil</span></li>
  <li><span class="code--slim">Gov-Client-User-IDs: undefined</span></li>
</ul>


### Using third-party software and libraries

If you use or plan to use third-party software and libraries, make sure you can still collect header data. Examples include an extension to an Enterprise Resource Planning (ERP) system or a plug-in to a spreadsheet application.


## Contact us

If you need to contact us, email SDSTeam@hmrc.gov.uk
