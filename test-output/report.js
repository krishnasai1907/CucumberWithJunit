$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("First.feature");
formatter.feature({
  "line": 2,
  "name": "To test the data",
  "description": "\r\nI want to use this template for my feature file",
  "id": "to-test-the-data",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Title of your scenario",
  "description": "",
  "id": "to-test-the-data;title-of-your-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User enters the Url \"https://opensource-demo.orangehrmlive.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User landed on webpage",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enter the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User click on submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User landed on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User close the Browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "to-test-the-data;title-of-your-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 15,
      "id": "to-test-the-data;title-of-your-scenario;;1"
    },
    {
      "cells": [
        "admin",
        "admin123"
      ],
      "line": 16,
      "id": "to-test-the-data;title-of-your-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "Title of your scenario",
  "description": "",
  "id": "to-test-the-data;title-of-your-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    },
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User enters the Url \"https://opensource-demo.orangehrmlive.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User landed on webpage",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enter the \"admin\" and \"admin123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User click on submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User landed on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User close the Browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://opensource-demo.orangehrmlive.com/",
      "offset": 21
    }
  ],
  "location": "LoginPage.user_enters_the_Url(String)"
});
formatter.result({
  "duration": 24485901900,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.user_landed_on_webpage()"
});
formatter.result({
  "duration": 1519462100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 16
    },
    {
      "val": "admin123",
      "offset": 28
    }
  ],
  "location": "LoginPage.user_enter_the_and(String,String)"
});
formatter.result({
  "duration": 7320074900,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.User_clickonsubmitbutton()"
});
formatter.result({
  "duration": 8203687300,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.User_landed_on_home_page()"
});
formatter.result({
  "duration": 1176322300,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.userclosethebrowser()"
});
formatter.result({
  "duration": 352032700,
  "status": "passed"
});
});