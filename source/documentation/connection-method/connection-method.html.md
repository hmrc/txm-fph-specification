---
title: What you need to send
weight: 2
description: Page description for search engines
---

# What you need to send

Your connection method determines the header data you need to send. For example, your application connects directly to HMRC or via intermediary servers.


<<<<<<< Updated upstream
<p class="panel panel-border-wide">It’s important to select the correct connection method for your application. If you're not sure, <a href="/documentation/getting-it-right/getting-it-right.html#getting-it-right">check your connection method</a>.</p>
=======
## Confirm your connection method
>>>>>>> Stashed changes


<<<<<<< Updated upstream
Filter and results go here.
=======
<div class="filter-container">
    <form method="GET" action="">
        <div class="govuk-form-group">
            <label class="govuk-label" for="conection-method-filter"><h3>Your connection method</h3></label>
            <select class="govuk-select" id="connection-method-filter" name="filter">
                <option disabled="" selected="">Select an option</option>
                <option value="BATCH_PROCESS_DIRECT">BATCH_PROCESS_DIRECT</option>
                <option value="DESKTOP_APP_DIRECT">DESKTOP_APP_DIRECT</option>
                <option value="DESKTOP_APP_VIA_SERVER">DESKTOP_APP_VIA_SERVER</option>
                <option value="INVALID_OR_MISSING">INVALID_OR_MISSING</option>
                <option value="MOBILE_APP_DIRECT">MOBILE_APP_DIRECT</option>
                <option value="MOBILE_APP_VIA_SERVER">MOBILE_APP_VIA_SERVER</option>
                <option value="OTHER_DIRECT">OTHER_DIRECT</option>
                <option value="OTHER_VIA_SERVER">OTHER_VIA_SERVER</option>
                <option value="WEB_APP_VIA_SERVER">WEB_APP_VIA_SERVER</option>
            </select>
        </div>
        <div>
            <button class="govuk-button" type="submit">Continue</button>
        </div>
    </form>
</div>

## Connection methods

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

In most connection methods, it’s most likely the device that is physically in the possession of the person initiating the requests.

<p>In <span class="code--slim">BATCH_PROCESS_DIRECT</span>, it might be a vendor’s server.</p>

<p>In <span class="code--slim">DESKTOP_APP_DIRECT</span> or <span class="code--slim">DESKTOP_APP_VIA_SERVER</span>, it might be a hosted desktop environment accessed remotely by the user.</p>
>>>>>>> Stashed changes
