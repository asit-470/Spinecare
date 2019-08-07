$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Spinecare.feature");
formatter.feature({
  "line": 1,
  "name": "Spine care test",
  "description": "",
  "id": "spine-care-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "validate spine care login page",
  "description": "",
  "id": "spine-care-test;validate-spine-care-login-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "useron login page",
  "keyword": "Then "
});
formatter.step({
  "line": 5,
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "home page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Loginsteps.user_open_the_browser()"
});
formatter.result({
  "duration": 5782904142,
  "status": "passed"
});
formatter.match({
  "location": "Loginsteps.useron_login_page()"
});
formatter.result({
  "duration": 57915613,
  "status": "passed"
});
formatter.match({
  "location": "Loginsteps.user_enters_username_and_password()"
});
formatter.result({
  "duration": 3008884604,
  "status": "passed"
});
formatter.match({
  "location": "Loginsteps.home_page_is_displayed()"
});
formatter.result({
  "duration": 6826659,
  "status": "passed"
});
formatter.match({
  "location": "Loginsteps.close_the_browser()"
});
formatter.result({
  "duration": 2072807570,
  "status": "passed"
});
});