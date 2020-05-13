---
title: How to send headers
description: Page description for search engines
---

# How to send headers

## Select your connection method

<span class="font-large">It’s important to select the correct connection method for your application. Your connection method determines which header data you need to send.
</span>

### Direct or via  intermediary servers

Your application connects directly to HMRC or via intermediary servers. Select a direct connection method if your application connects directly to HMRC.

If your application does not connect directly to HMRC, you need to select a server connection method. This refers to intermediary servers that [are part of your application domain and] are in your control. It does not include third-party servers such as transport layers or internet providers.

Where multiple services manage your intermediary servers, headers must contain data from all services.

### Connection methods

You need to select 1 of these connection methods:

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


## Check which headers to send

It is mandatory to **send all header information for your connection method**.

In some cases, while the header itself is required for your connection method, we anticipate you might not be able to collect a value because:

- of operating system or platform restrictions beyond your reasonable control
- of security measures beyond your reasonable control
- the header is not applicable, as called out explicitly by the header documentation

Only in these cases, you must submit the header with an empty value or omit it entirely. You must not supply null values.

In all other cases, you must submit a valid value and not leave the header empty.

**If you are unable to collect a header value, or if you are omitting or leaving a value blank** then HMRC may contact you to ask you to give more information.

For example, an application connecting directly to HMRC might not be able to supply a username for Gov-Client-User-IDs if the operating system of the originating device has no concept of user accounts, so the header can be omitted entirely or left empty as follows:

<span class="code--slim">Gov-Client-User-IDs:</span>

## Formatting requirements

Header contents must use the character set US-ASCII, with other characters percent encoded as in [RFC3986](https://tools.ietf.org/html/rfc3986#section-2.1).
