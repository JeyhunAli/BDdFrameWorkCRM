$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature.feature");
formatter.feature({
  "line": 2,
  "name": "Free CRM Login to the Feature",
  "description": "",
  "id": "free-crm-login-to-the-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 5,
      "value": "#without Examples Keyword"
    }
  ],
  "line": 6,
  "name": "Free CRM Login to test Scenario",
  "description": "",
  "id": "free-crm-login-to-the-feature;free-crm-login-to-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user enters username and  password for",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicking  on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 23595338200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 24215700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_username_and_password_for()"
});
formatter.result({
  "duration": 598981200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicking_on_login_button()"
});
formatter.result({
  "duration": 3198298700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 10890900,
  "status": "passed"
});
});