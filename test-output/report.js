$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login2.feature");
formatter.feature({
  "line": 2,
  "name": "As a user I want a login page so that only authentic",
  "description": "users will be able to login",
  "id": "as-a-user-i-want-a-login-page-so-that-only-authentic",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    },
    {
      "line": 1,
      "name": "@sprint"
    },
    {
      "line": 1,
      "name": "@database"
    }
  ]
});
formatter.before({
  "duration": 11469058500,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Valid users should be able to login",
  "description": "",
  "id": "as-a-user-i-want-a-login-page-so-that-only-authentic;valid-users-should-be-able-to-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on techfios site",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Dashboard page should display",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_am_on_techfios_site()"
});
formatter.result({
  "duration": 317952800,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_enter_username_and_password()"
});
formatter.result({
  "duration": 1469137500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_on_sign_in_button()"
});
formatter.result({
  "duration": 2005155300,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat steps.LoginSteps.i_click_on_sign_in_button(LoginSteps.java:55)\r\n\tat ✽.And I click on sign in button(login2.feature:8)\r\n",
  "status": "pending"
});
formatter.match({
  "location": "LoginSteps.dashboard_page_should_display()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1141242300,
  "status": "passed"
});
});