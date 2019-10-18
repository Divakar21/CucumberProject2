$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Demoguru.feature");
formatter.feature({
  "name": "Checks the customer registration functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@FunctionalTest"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on demo guru page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition1.user_is_on_demo_guru_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that user can able to select the telecom project",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User clicks the telecom project",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition1.user_clicks_the_telecom_project()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to the telecom page.",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition1.user_navigates_to_the_telecom_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on demo guru page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition1.user_is_on_demo_guru_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that user can able to select the add customer in the telecom page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "name": "User clicks the add customer",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition1.user_clicks_the_add_customer()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027USER-PC\u0027, ip: \u0027192.168.0.29\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:125)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.demo.stepdefinition.stepDefinition1.user_clicks_the_add_customer(stepDefinition1.java:37)\r\n\tat ✽.User clicks the add customer(src/test/resources/Demoguru.feature:14)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User navigates to the add customer page.",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition1.user_navigates_to_the_add_customer_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});