---
title: Fraud Prevention
weight: 1
description:
---

# Fraud prevention

**Version 3.0 issued Day Month 2020**

Minor versions are backwards compatible - each minor version adds more examples and advice.

***

Transaction Monitoring (TxM) is a key security approach adopted in the UK and globally. Our approach is in line with National Cyber Security Centre (NCSC) and Cabinet Office [recommended guidance](https://assets.publishing.service.gov.uk/government/uploads/system/uploads/attachment_data/file/271268/GPG_53_Transaction_Monitoring_issue_1-1_April_2013.pdf) and industry good practice.

We monitor transactions to protect taxpayers from infringement of their data by criminals or fraudsters. Without the protection offered by TxM, personal data could be compromised, leading to fraud against taxpayers or the UK Exchequer.

You must help us protect our users’ confidential data by sending us particular types of user audit data which we will record.

From 1 April 2019, regulation 2(2) of the [Delivery of Tax Information through Software (Ancillary Metadata) Regulations 2019 (S.I. 360/2019)](http://www.legislation.gov.uk/uksi/2019/360/made) requires this by law.

Our APIs provide HTTP headers that you can use to pass this audit data to us.

These headers can influence the processing of the API call, or support our prosecutions for tax or duty fraud.

## Why you need to send headers

Supplying header information for all our APIs will become mandatory - so we recommend designing it into your applications now.

It is mandatory to provide header information when using the following APIs:

  * [VAT (MTD)](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/vat-api/1.0) from 1st April 2019

We have published our [TxM Data Protection Impact Assessment (DPIA)](https://developer.service.hmrc.gov.uk/api-documentation/assets/content/documentation/3f4c263faa8231bea05c1826b7f6b81c-TxM%20DPIA%20v3%201%20Public.pdf) in line with best practice guidance from the Information Commissioner’s Office. This is to:

  * provide transparency for our end users and software developers who work with us
  * tell the public why we are processing particular personal data
  * help software developers amend their privacy notices in relation to our APIs
