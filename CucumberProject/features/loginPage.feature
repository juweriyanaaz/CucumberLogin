Feature: Loginpage

  Scenario: Successful login with valid credentials
    
    Given:User launch chrome browser
    When:User opens URL "https://admin.demo.nopcommerce.com/login"
    And:User enters Email as "admin@yourstore.com" and password as "admin"
    And:Click on login
    Then:Page title should be "Dashboard/nopcommerce administration"
    When:User click on logout link
    Then:Page title should be "your store.login"
    And:Close browser

