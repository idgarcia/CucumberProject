$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "loginFeature",
  "description": "",
  "id": "loginfeature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Valid Login",
  "description": "",
  "id": "loginfeature;valid-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I navigate to FreeCrm",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I enter valid username and Pasword",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_open_browser()"
});
formatter.result({
  "duration": 4054364745,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_navigate_to_FreeCrm()"
});
formatter.result({
  "duration": 1506330028,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_enter_valid_username_and_Pasword()"
});
formatter.result({
  "duration": 579212681,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_login_button()"
});
formatter.result({
  "duration": 6225266411,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_successfully_logged_in()"
});
formatter.result({
  "duration": 80213,
  "status": "passed"
});
});