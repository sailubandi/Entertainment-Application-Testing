# JioHotstar Automation Framework

> A Selenium-based automation testing framework for validating core functionalities of an entertainment streaming application.

---

## Overview

This project automates key user workflows — **login**, **search**, and **playback validation** — for a streaming application inspired by JioHotstar.

Built using Java, Selenium WebDriver, and TestNG, the framework follows the **Page Object Model (POM)** design pattern to ensure clean separation between test logic and UI interactions.

The framework also includes reporting, logging, and utility components to handle real-world automation scenarios.

---

## Objectives

- Automate core user flows of an entertainment application
- Implement a structured automation framework using POM
- Handle dynamic web elements in modern web applications
- Build a maintainable and reusable testing solution

---

## Tech Stack

| Tool | Purpose |
|------|---------|
| **Java** | Programming Language |
| **Selenium WebDriver 4.18.1** | Browser Automation |
| **TestNG 7.8.0** | Test Framework |
| **Maven** | Build & Dependency Management |
| **WebDriverManager 5.6.3** | Automatic ChromeDriver Setup |
| **Extent Reports 5.0.9** | HTML Test Reporting |
| **Git & GitHub** | Version Control |

---

## Framework Design

The framework is designed using the **Page Object Model (POM)** and a layered architecture.

```
+------------------+--------------------------------------+
| Base Layer       | Browser setup & teardown             |
+------------------+--------------------------------------+
| Page Layer       | UI elements & page methods           |
+------------------+--------------------------------------+
| Test Layer       | Test cases & execution               |
+------------------+--------------------------------------+
| Utility Layer    | Driver, reporting, screenshots       |
+------------------+--------------------------------------+
```

---

## Project Structure

```
jiohotstar-automation/
│
├── src/main/java/
│   ├── base/
│   │   └── BaseTest.java               # Browser setup & teardown
│   │
│   ├── pages/
│   │   ├── HomePage.java
│   │   ├── LoginPage.java
│   │   ├── SearchPage.java
│   │   └── PlayerPage.java
│   │
│   └── utils/
│       ├── DriverFactory.java          # Centralized WebDriver init
│       ├── ExtentManager.java          # Extent Reports configuration
│       ├── ScreenshotUtil.java         # Screenshot capture on failure
│       └── TestListener.java           # TestNG listener for reporting
│
├── src/test/java/
│   └── tests/
│       ├── LoginTest.java
│       ├── SearchTest.java
│       └── PlaybackTest.java
│
├── reports/
│   └── ExtentReport.html
├── testng.xml
└── pom.xml
```

---

## Test Scenarios

### Login Flow

Two test methods are implemented:

- **verifyLoginPage** — Navigates directly to the login URL and validates the page loads correctly
- **verifyLoginFlow** — Enters a mobile number, clicks Continue, and validates the login flow executes

> **Note:** OTP verification is not automated due to security constraints.

---

### Search Functionality

- Navigate directly to the search page URL
- Enter search keyword (e.g., `IPL`)
- Validate search execution

> **Note:** Direct navigation is used because the search UI is dynamically rendered.

---

### Playback Validation

- Navigate to homepage
- Click the first available content image
- Validate navigation to the player page using URL and page title checks

> **Note:** Video playback is validated indirectly — streaming platforms use DRM-protected players. Player load is confirmed by checking if the URL contains `watch` or the title contains `hotstar`.

---

## Driver Management

The `DriverFactory` class centralizes WebDriver initialization for reuse across the framework.

**Responsibilities:**
- Centralize browser setup logic
- Avoid code duplication
- Manage driver lifecycle

```java
WebDriver driver = DriverFactory.initDriver();
```

> **Note:** `BaseTest` uses WebDriverManager directly for `@BeforeMethod` setup, which initializes Chrome and navigates to `https://www.hotstar.com/in` before each test.

---

## Reporting and Logging

### Extent Reports

Extent Reports generates a detailed HTML report at `reports/ExtentReport.html` after test execution.

- Displays test status (Pass / Fail)
- Provides execution summary
- Captures failure details with stack trace
- Attaches screenshots on failure

Report location:

```
/reports/ExtentReport.html
```

### Utility Classes

| Class | Purpose |
|-------|---------|
| **ExtentManager.java** | Initializes and configures the Extent Reports instance |
| **ScreenshotUtil.java** | Captures and saves screenshots to `/reports/` on failure |
| **TestListener.java** | TestNG `ITestListener` — logs pass/fail, attaches screenshots |

### TestNG Listener Registration

`TestListener` is registered in `testng.xml` and automatically hooks into every test:

```xml
<listeners>
    <listener class-name="utils.TestListener"/>
</listeners>
```

### Logging

Console logging is used throughout the tests for execution visibility:

- `Login Page Verified`
- `Login flow executed`
- `Search Test Started`
- `Search Completed Successfully`
- `Playback Test Started`
- `Player loaded successfully`

---

## Getting Started

### Step 1 — Clone Repository
```bash
git clone https://github.com/sailubandi/Entertainment-Application-Testing.git
```

### Step 2 — Open Project
Import the project into **Eclipse** as a Maven Project.

### Step 3 — Install Dependencies
```
Right-click project → Maven → Update Project
```

### Step 4 — Run Tests
```
Right-click testng.xml → Run As → TestNG Suite
```

---

## Key Implementation Details

| Feature | Detail |
|---------|--------|
| **Design Pattern** | Page Object Model (POM) |
| **Wait Strategy** | Explicit waits (`WebDriverWait`) |
| **Navigation** | Direct URL navigation for dynamic UI components |
| **Driver Setup** | WebDriverManager (auto ChromeDriver management) |
| **Driver Management** | DriverFactory for reusable initialization |
| **Reporting** | Extent Reports (HTML) |
| **Failure Handling** | Automatic screenshot capture via TestListener |
| **Listener** | TestNG `ITestListener` registered in testng.xml |

---

## Known Limitations

- OTP verification cannot be automated (security constraint)
- Video playback is validated indirectly (DRM protection)
- Some UI elements are dynamic and may behave inconsistently
- `Thread.sleep()` is used in some tests as a temporary wait strategy

---

## Learning Outcomes

- Designing Selenium automation frameworks from scratch
- Handling dynamic elements in modern web applications
- Implementing reusable and scalable test architecture
- Understanding real-world automation limitations
- Integrating Extent Reports and screenshot capture for failure analysis

---

## Author

**Bandi Poorna Sri Sailaja**

---

## Conclusion

This project demonstrates a structured and practical approach to automation testing for an entertainment streaming application. It covers core user workflows, applies industry-standard design patterns, and addresses real-world challenges such as dynamic UI behavior, DRM-protected content, and OTP-restricted login flows.

The framework serves as a strong foundation for building scalable and maintainable automation solutions.
