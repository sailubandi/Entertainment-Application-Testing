# Entertainment Application Testing (JioHotstar Automation Framework)

## 1. Project Overview

This project is a Selenium-based automation testing framework developed to validate core functionalities of an entertainment streaming application inspired by JioHotstar.

The framework automates key user workflows such as login, search, and playback validation using Java, Selenium WebDriver, and TestNG. It follows the Page Object Model (POM) design pattern to maintain a clear separation between test logic and UI elements.

---

## 2. Objectives

* Automate core user flows of an entertainment application
* Implement a structured automation framework using POM
* Handle dynamic web elements in modern web applications
* Build a maintainable and reusable testing solution

---

## 3. Tech Stack

* Programming Language: Java
* Automation Tool: Selenium WebDriver
* Test Framework: TestNG
* Build Tool: Maven
* Version Control: Git and GitHub

---

## 4. Framework Design

The framework is designed using the Page Object Model (POM), where each page is represented by a separate class.

### Layers in the Framework:

* **Base Layer**
  Handles browser setup, initialization, and teardown.

* **Page Layer**
  Contains web elements and reusable methods for each page:

  * HomePage.java
  * LoginPage.java
  * SearchPage.java
  * PlayerPage.java

* **Test Layer**
  Contains test cases:

  * LoginTest.java
  * SearchTest.java
  * PlaybackTest.java

---

## 5. Project Structure

jiohotstar-automation
│
├── src/main/java
│   ├── base
│   │     BaseTest.java
│   │
│   ├── pages
│   │     HomePage.java
│   │     LoginPage.java
│   │     SearchPage.java
│   │     PlayerPage.java
│
├── src/test/java
│   └── tests
│         LoginTest.java
│         SearchTest.java
│         PlaybackTest.java
│
├── testng.xml
├── pom.xml

---

## 6. Test Scenarios Covered

### 6.1 Login Flow

* Navigate to login page using direct URL
* Enter mobile number
* Validate login flow execution

**Note:** OTP verification is not automated due to security constraints.

---

### 6.2 Search Functionality

* Navigate to search page directly
* Enter search keyword (example: IPL)
* Validate search execution

**Note:** Direct navigation is used because the search UI is dynamically rendered.

---

### 6.3 Playback Validation

* Navigate to homepage
* Click on available content
* Validate navigation to player page

**Note:** Video playback is not directly tested because streaming platforms use DRM-protected players.

---

## 7. Execution Steps

### Step 1: Clone Repository

git clone https://github.com/sailubandi/Entertainment-Application-Testing.git

### Step 2: Open Project

* Import the project into Eclipse as a Maven Project

### Step 3: Install Dependencies

* Right click project → Maven → Update Project

### Step 4: Run Tests

* Right click `testng.xml`
* Run as TestNG Suite

---

## 8. Key Implementation Details

* Used Page Object Model to separate UI and test logic
* Implemented explicit waits for handling dynamic elements
* Used direct navigation for unstable UI components
* Structured test cases for readability and maintainability

---

## 9. Limitations

* OTP verification is not automated
* Video playback is validated indirectly
* Some UI elements are dynamic and may not be stable for direct interaction

---

## 10. Learning Outcomes

* Understanding of Selenium automation framework design
* Handling dynamic elements in modern web applications
* Implementing structured and reusable test architecture
* Working with real-world testing constraints

---

## 11. Author

Bandi Poorna Sri Sailaja

---

## 12. Conclusion

This project demonstrates a structured approach to building an automation testing framework for an entertainment application. It focuses on core functionalities and follows standard automation practices, making it suitable for demonstrating practical testing skills.



