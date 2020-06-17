---
title: What you need to send
weight: 3
description: Page description for search engines
---

# Connection methods

The header data you need to send depends on your connection method. 

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

<p><span class="code--slim-large">BATCH_PROCESS_DIRECT</span></p>
Your application uses batch processes, connecting directly to HMRC.


<a href="">If your application does not fall into common architectures</a>


### Direct or via intermediary servers

Your application connects directly to HMRC or via intermediary servers. Select a direct connection method if your application connects directly to HMRC.

If your application does not connect directly to HMRC, you need to select a server connection method. This refers to intermediary servers that [are part of your application domain and] are in your control. It does not include third-party servers such as transport layers or internet providers.

Where multiple services manage your intermediary servers, headers must contain data from all services.


### Originating device

Originating device means the device that initiates an action.

In most connection methods, it is usually the device that is physically in the possession of the person initiating the requests.

<p>In <span class="code--slim">BATCH_PROCESS_DIRECT</span>, it might be a vendor’s server.</p>

<p>In <span class="code--slim">DESKTOP_APP_DIRECT</span> or <span class="code--slim">DESKTOP_APP_VIA_SERVER</span>, it might be a hosted desktop environment accessed remotely by the user.</p>