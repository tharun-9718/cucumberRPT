$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature/demo1.feature");
formatter.feature({
  "name": "login Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Users enters Username and Password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the login page is opened",
  "keyword": "Given "
});
formatter.match({
  "location": "demo1.the_login_page_is_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users enters lalitha as username",
  "keyword": "When "
});
formatter.match({
  "location": "demo1.users_enters_lalitha_as_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password123 as password",
  "keyword": "And "
});
formatter.match({
  "location": "demo1.user_enters_password_as_password(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will Finds a testmeapp homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "demo1.user_will_Finds_a_testmeapp_homepage()"
});
formatter.result({
  "status": "passed"
});
});