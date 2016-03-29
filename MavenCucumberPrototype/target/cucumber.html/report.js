$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("myFeature.feature");
formatter.feature({
  "line": 1,
  "name": "This is my dummy feature file",
  "description": "",
  "id": "this-is-my-dummy-feature-file",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 15,
  "name": "This is my first dummy step",
  "description": "",
  "id": "this-is-my-dummy-feature-file;this-is-my-first-dummy-step;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Login to Flipart",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Search \"unit\" item",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "then \"unit\" are displayed",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Page is closed",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.this_is_first_step()"
});
formatter.result({
  "duration": 289074200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "unit",
      "offset": 8
    }
  ],
  "location": "StepDefinitions.this_is_second_step(String)"
});
formatter.result({
  "duration": 15461028878,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "unit",
      "offset": 6
    }
  ],
  "location": "StepDefinitions.this_is_third_step(String)"
});
formatter.result({
  "duration": 7011918552,
  "error_message": "junit.framework.AssertionFailedError\r\n\tat junit.framework.Assert.fail(Assert.java:55)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:22)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:31)\r\n\tat com.cucumber.MavenCucumberPrototype.StepDefinitions.this_is_third_step(StepDefinitions.java:57)\r\n\tat ✽.Then then \"unit\" are displayed(myFeature.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinitions.this_is_fourth_step()"
});
formatter.result({
  "status": "skipped"
});
});