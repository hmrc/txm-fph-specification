---
title: How to send header data
weight: 2
description: Page description for search engines
---

# How to send header data

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


## Use the Test API

Use our <a href="https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/txm-fph-validator-api">Test Fraud Prevention Headers API (opens in a new tab)</a> to check that the headers submitted by your application are formatted correctly. It can be used during the initial development phase and as part of your regular quality assurance checks.
