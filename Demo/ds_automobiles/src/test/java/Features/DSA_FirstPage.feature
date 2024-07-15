@SmokeFeature
Feature: Validation of Website

  @smoketest
  Scenario Outline: Validation of Ds_Website
    Given DS website is open on Mobile
    Then Click on Menu (top left) and verify DS MODELS, THE DS EXPERIENCE,BUY & RENT and YOUR DS options are available and clickable 
    Then Click the menu items on the left corner of the home page
    Then Check MM paragraphs/items are properly displayed
    Then Click on buttons/links available in Home page
    
