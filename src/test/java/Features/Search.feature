Feature: Search and Place order for product

Scenario Outline: User will verify the text on landing and offer page are same

Given user is on landing page
When user search the <Name> shortname in landing page and extract the product name
Then user search the <Name> shortname in offer page to check if product exist
And validate product name is same as landing page

Examples: 
|Name|
|Tom|

