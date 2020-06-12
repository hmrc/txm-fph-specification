---
title: Getting it right | Fraud prevention
weight: 4
description: Page description for search engines
---

# Getting it right

## Check your connection method

It’s important to use the correct connection method for your application. Your connection method determines which header data you need to send.

<p><span class="code--slim-large">MOBILE_APP_DIRECT</span><br>
Your application is installed on a mobile device connecting directly to HMRC. Mobile devices include phones and tablets.</p>
</li>
<p><span class="code--slim-large">DESKTOP_APP_DIRECT</span><br>
Your application is installed on a desktop connecting directly to HMRC. Desktops include computers and laptops.</p>

<p><span class="code--slim-large">MOBILE_APP_VIA_SERVER</span><br>
Your application is installed on a mobile device connecting to HMRC through intermediary servers. Mobile devices include phones and tablets.

<p><span class="code--slim-large">DESKTOP_APP_VIA_SERVER</span><br>
Your application is installed on a desktop connecting to HMRC through intermediary servers. Desktops include computers and laptops.

<p><span class="code--slim-large">WEB_APP_VIA_SERVER</span><br>
Your application is web based, connecting to HMRC through intermediary servers.

<p><span class="code--slim-large">BATCH_PROCESS_DIRECT</span><br>
Your application uses batch processes, connecting directly to HMRC.


### If your application does not fall into common architectures

You can select <span class="code--slim-large">OTHER_*</span>. We may ask you for more details.  

<p><span class="code--slim-large">OTHER_DIRECT</span><br>
Your application connects directly to HMRC but is not covered by the common connection methods.

<p><span class="code--slim-large">OTHER_VIA_SERVER</span><br>
Your application connects to HMRC through intermediary servers but is not covered by the common connection methods.


### Direct or via intermediary servers

Your application connects directly to HMRC or via intermediary servers. Select a direct connection method if your application connects directly to HMRC.

If your application does not connect directly to HMRC, you need to select a server connection method. This refers to intermediary servers that [are part of your application domain and] are in your control. It does not include third-party servers such as transport layers or internet providers.

Where multiple services manage your intermediary servers, headers must contain data from all services.


### Originating device

Originating device means the device that initiates an action.

In most connection methods, it’s most likely the device that is physically in the possession of the person initiating the requests.

<p>In <span class="code--slim">BATCH_PROCESS_DIRECT</span>, it might be a vendor’s server.</p>

<p>In <span class="code--slim">DESKTOP_APP_DIRECT</span> or <span class="code--slim">DESKTOP_APP_VIA_SERVER</span>, it might be a hosted desktop environment accessed remotely by the user.</p>


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
