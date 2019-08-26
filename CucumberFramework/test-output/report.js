$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/features/Login.feature");
formatter.feature({
  "name": "login and logout of FB Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verification of Login functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Open the Chrome and launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.open_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Username and Password",
  "keyword": "When "
});
formatter.match({
  "location": "Login.enter_user_name_pwd()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login should be sucessfull",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.Login_sucess()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verification of Logout",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Scroll down the page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.scroll_down_the_page()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat stepDefinations.Login.scroll_down_the_page(Login.java:67)\r\n\tat ✽.Scroll down the page(src/main/java/features/Login.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Click on User navigation pane link",
  "keyword": "When "
});
formatter.match({
  "location": "Login.click_on_User_navigation_pane_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Logout link",
  "keyword": "And "
});
formatter.match({
  "location": "Login.click_on_Logout_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should be logged out",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_should_be_logged_out()"
});
formatter.result({
  "status": "skipped"
});
});