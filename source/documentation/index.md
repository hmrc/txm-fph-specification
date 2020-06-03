---
title: Fraud prevention
weight: 1
description: Page description for search engines
---

# Fraud prevention

**Version 3.0 issued Day Month 2020**

Minor versions are backwards compatible - each minor version adds more examples and advice.

***


## Why you need to send data


We monitor transactions to protect taxpayers from infringement of their data by criminals or fraudsters. Without the protection offered by TxM, personal data could be compromised, leading to fraud against taxpayers or the UK Exchequer.

You must help us protect our users’ confidential data by sending us particular types of user audit data which we will record.

Our APIs provide HTTP headers that you can use to pass this audit data to us.

These headers can influence the processing of the API call, or support our prosecutions for tax or duty fraud.

### Your legal obligations

From 1 April 2019, regulation 2(2) of the <a href="http://www.legislation.gov.uk/uksi/2019/360/made">Delivery of Tax Information through Software (Ancillary Metadata) Regulations 2019 (S.I. 360/2019)</a> requires this by law.

Supplying header information for all our APIs will become mandatory - so we recommend designing it into your applications now.

It is mandatory to provide header information when using the following APIs:

* <a href="/api-documentation/docs/api/service/vat-api/1.0">VAT (MTD)</a> from 1st April 2019

We have published our <a href="/api-documentation/assets/content/documentation/3f4c263faa8231bea05c1826b7f6b81c-TxM DPIA v3 1 Public.pdf">TxM Data Protection Impact Assessment</a> (DPIA) in line with best practice guidance from the Information Commissioner’s Office. This is to:

* provide transparency for our end users and software developers who work with us
* tell the public why we are processing particular personal data
* help software developers amend their privacy notices in relation to our APIs

### Using third-party software and libraries

If you use or plan to use third-party software and libraries, for example an extension to an ERP system or a plugin to a spreadsheet application, make sure you can still access the header data you need to send to HMRC.

### Security

Transaction Monitoring (TxM) is a key security approach adopted in the UK and globally. Our approach is in line with National Cyber Security Centre (NCSC) and Cabinet Office <a href="https://assets.publishing.service.gov.uk/government/uploads/system/uploads/attachment_data/file/271268/GPG_53_Transaction_Monitoring_issue_1-1_April_2013.pdf">recommended guidance</a> and industry good practice.
