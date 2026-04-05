Feature: search 
@multipleData @search @smoke
Scenario: Verifythe funcationality of searchmodule in flipkart homepage

Given launch an chrome browser
And Navigate to flipkart site
When Enter "Mobile" in search module in homepage
And validate mobile pagehas been open by pagetitle and the title is "Mobile- Buy Products Online at Best Price in India - All Categories | Flipkart.com"
Then close an chrome browser
@singleData @search @regression
Scenario: Verify the functionality of product

Given launch an chrome browser
And Navigate to flipkart site
And search an "mobile" in search module in homepage
When click on a first product
Then close an chrome browser