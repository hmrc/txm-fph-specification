---
title: Getting it right | Fraud prevention
weight: 5
description: Page description for search engines
---

# Getting it right

## Missing header data

[Add exclamation mark]
<strong class="bold-small">It is mandatory to send all header information for your connection method.</strong>

In some cases, while the header itself is required for your connection method, we anticipate you might not be able to collect a value because:

* of operating system or platform restrictions beyond your reasonable control
* of security measures beyond your reasonable control
* the header is not applicable, as called out explicitly by the header documentation

Only in these cases, you must submit the header with an empty value or omit it entirely. You must not supply null values.

In all other cases, you must submit a valid value and not leave the header empty.

[Add exclamation mark]
<strong class="bold-small"> If you are unable to collect a header value, or if you are omitting or leaving a value blank then HMRC may contact you to ask you to give more information. </strong>

For example, an application connecting directly to HMRC might not be able to supply a username for Gov-Client-User-IDs if the operating system of the originating device has no concept of user accounts, so the header can be omitted entirely or left empty as follows:

<p class="code--slim">Gov-Client-User-IDs:</p>

### Using third-party software and libraries

If you use or plan to use third-party software and libraries, make sure you can still access header data. Examples include an extension to an ERP system or a plug-in to a spreadsheet application.

### Headers not required
If a header is not required for your connection method, then you can leave it out entirely when making your submission, or submit it with an empty header value. You must not supply null values, for example, the following are not valid:

<ul>
        <li><span class="code--slim">Gov-Client-User-IDs: null</span></li>
        <li><span class="code--slim">Gov-Client-User-IDs: nil</span></li>
        <li><span class="code--slim">Gov-Client-User-IDs: undefined</span></li>
      </ul>

## Contact us

If you need to contact us, email SDSTeam@hmrc.gov.uk
[Check if we need to say anything more here]
