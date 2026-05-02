🚀 QaBrainAutomation_SauceLab

A scalable UI Automation Framework built using Java, Selenium, Cucumber, TestNG, and Maven, integrated with Sauce Labs for cloud-based cross-browser testing.

Designed with real-world QA practices including BDD, Page Object Model (POM), and CI/CD readiness.

📌 Table of Contents
Overview
Features
Tech Stack
Project Structure
Getting Started
Sauce Labs Setup
Running Tests
Reporting
Common Issues
CI/CD Integration
Future Enhancements
Author
📖 Overview

This project is a BDD-based automation framework that supports:

Clean and maintainable test design
Parallel execution
Cross-browser testing via Sauce Labs
CI/CD integration

It follows industry best practices to ensure scalability and readability.

✨ Features
✅ BDD with Cucumber (Gherkin syntax)
✅ Page Object Model (POM)
✅ Selenium WebDriver integration
✅ TestNG for execution & parallel runs
✅ Maven for dependency management
✅ Sauce Labs cloud execution
✅ CI/CD ready (Jenkins & GitHub Actions)
🧰 Tech Stack
Layer	Technology
Language	Java
Automation	Selenium WebDriver
BDD	Cucumber
Test Runner	TestNG
Build Tool	Maven
Cloud Testing	Sauce Labs
Design Pattern	Page Object Model
📂 Project Structure
QaBrainAutomation_SauceLab/
├── src/test/java/
│   ├── stepdefinitions/   # Step Definitions
│   ├── pages/             # Page Objects
│   ├── hooks/             # Setup & Teardown
│   └── runners/           # Test Runners
├── src/test/resources/
│   ├── features/          # Feature Files
│   └── config/            # Configuration Files
├── pom.xml
└── README.md
⚙️ Getting Started
Prerequisites

Make sure you have:

Java JDK 11+
Maven installed
IDE (IntelliJ or Eclipse)
Sauce Labs account
🔧 Installation
git clone https://github.com/your-username/QaBrainAutomation_SauceLab.git
cd QaBrainAutomation_SauceLab
mvn clean install
☁️ Sauce Labs Setup
Create an account on Sauce Labs
Get your Username and Access Key
Set them as environment variables:
export SAUCE_USERNAME=your_username
export SAUCE_ACCESS_KEY=your_access_key
Use Remote WebDriver:
String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
▶️ Running Tests
Run all tests
mvn clean test
Run by tag
mvn test -Dcucumber.filter.tags="@smoke"
Run via TestNG suite
mvn clean test -DsuiteXmlFile=testng.xml
🧪 Sample Test Scenarios
Login functionality
Add to cart
Remove from cart
Checkout flow
Forgot password
User registration
📊 Reporting
📄 TestNG Reports
📄 Cucumber HTML Reports
🎥 Sauce Labs Dashboard (videos, logs, screenshots)
🛠️ Common Issues
❌ NoSuchElementException
Use explicit waits
Verify locators
Check iframe handling
❌ DuplicateStepDefinition
Ensure unique step definitions
Organize step files properly
❌ NullPointerException (Driver)
Initialize driver in Hooks
Use proper driver lifecycle management
❌ Element Not Found (Sauce Labs)
Add wait strategies
Handle dynamic elements carefully
🔄 CI/CD Integration
Jenkins Example
mvn clean test -DsuiteXmlFile=testng.xml

Supports:

Jenkins pipelines
GitHub Actions workflows
🌟 Why This Project Stands Out
Real-world framework design
Cloud-based test execution
Clean architecture (POM + BDD)
Scalable and maintainable
CI/CD ready
🔮 Future Enhancements
API testing with Rest Assured
Docker integration
Advanced parallel execution
Full Jenkins pipeline setup
👨‍💻 Author

Rezaul Karim
QA Automation Engineer
