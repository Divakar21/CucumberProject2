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
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
  "status": "passed"
});
formatter.step({
  "name": "User navigates to the add customer page.",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition1.user_navigates_to_the_add_customer_page()"
});
formatter.result({
  "status": "passed"
});
});