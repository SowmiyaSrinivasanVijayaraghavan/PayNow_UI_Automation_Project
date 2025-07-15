PayNow UI Automation Project

This is a sample test automation project built using Java, Selenium WebDriver and Cucumber BDD.

Features:
- UI test automation for PayNow page simulation
- Positive and negative test scenarios
- BDD with Cucumber `.feature` files
- HTML test report generation (Cucumber built-in)

Project Structure

PayNow_UI_Automation_Project/
pom.xml
src/
   ->test/
        -> java/
               ->stepdefinitions/
        ->resources/
               ->features/
   ->target/
      -> cucumber-report.html (generated after test run)
       -> run_tests.bat / run_tests.sh


How to Run the Tests

1. Import-> the project into Eclipse as a Maven Project
2. Run tests using either:
   - `TestRunner.java` (Right-click > Run As > JUnit Test), or
   - `run_tests.bat` (Windows) or `run_tests.sh` (Linux/Mac)
3. After execution, open the HTML report:
	target/cucumber-report.html


Tools & Technologies
- Java
- Maven
- Selenium WebDriver
- Cucumber BDD
- Eclipse IDE

Author
Sowmiya – QA Automation Portfolio Project
