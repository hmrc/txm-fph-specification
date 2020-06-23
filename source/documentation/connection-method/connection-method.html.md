---
title: What you need to send
weight: 2
description: Page description for search engines
---

# What you need to send

The header data you need to send depends on your application's connection method. For example, your application connects directly to HMRC or via intermediary servers on a certain device.

To check what you need to send, you need to confirm your connection method. If you are not sure, <a href="">check the connection methods</a>.

<div class="filter-container">
    <form method="GET" action="">
        <div class="govuk-form-group">
            <label class="govuk-label" for="conection-method-filter"><h3>Select your connection method</h3></label>
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
            <button class="govuk-button" type="submit">Filter</button>
        </div>
    </form>
</div>
