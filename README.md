# 🎬 JioHotstar Automation Framework

> A Selenium-based automation testing framework for validating core functionalities of an entertainment streaming application.

---

## 📌 Overview

This project automates key user workflows — **login**, **search**, and **playback validation** — for a streaming application inspired by JioHotstar. Built with Java, Selenium WebDriver, and TestNG, it follows the **Page Object Model (POM)** design pattern to cleanly separate test logic from UI interactions.

---

## 🎯 Objectives

- ✅ Automate core user flows of an entertainment application
- ✅ Implement a structured automation framework using POM
- ✅ Handle dynamic web elements in modern web applications
- ✅ Build a maintainable and reusable testing solution

---

## 🛠️ Tech Stack

| Tool | Purpose |
|------|---------|
| **Java** | Programming Language |
| **Selenium WebDriver** | Browser Automation |
| **TestNG** | Test Framework |
| **Maven** | Build & Dependency Management |
| **Git & GitHub** | Version Control |

---

## 🏗️ Framework Design

The framework uses the **Page Object Model (POM)** — each page is represented by a dedicated class.

```
┌─────────────────────────────────────────────┐
│               Framework Layers               │
├──────────────┬──────────────────────────────┤
│  Base Layer  │  Browser setup & teardown    │
├──────────────┼──────────────────────────────┤
│  Page Layer  │  UI elements & page methods  │
├──────────────┼──────────────────────────────┤
│  Test Layer  │  Test cases & assertions     │
└──────────────┴──────────────────────────────┘
```

---

## 📁 Project Structure

```
jiohotstar-automation/
│
├── src/main/java/
│   ├── base/
│   │   └── BaseTest.java           # Browser setup & teardown
│   │
│   └── pages/
│       ├── HomePage.java
│       ├── LoginPage.java
│       ├── SearchPage.java
│       └── PlayerPage.java
│
├── src/test/java/
│   └── tests/
│       ├── LoginTest.java
│       ├── SearchTest.java
│       └── PlaybackTest.java
│
├── testng.xml                      # Test suite configuration
└── pom.xml                         # Maven dependencies
```

---

## 🧪 Test Scenarios

### 🔐 Login Flow
- Navigate to login page via direct URL
- Enter mobile number
- Validate login flow execution

> ⚠️ **Note:** OTP verification is not automated due to security constraints.

---

### 🔍 Search Functionality
- Navigate to search page directly
- Enter search keyword (e.g., `IPL`)
- Validate search execution

> ⚠️ **Note:** Direct navigation is used because the search UI is dynamically rendered.

---

### ▶️ Playback Validation
- Navigate to homepage
- Click on available content
- Validate navigation to the player page

> ⚠️ **Note:** Video playback is not directly tested — streaming platforms use DRM-protected players.

---

## 🚀 Getting Started

### Step 1 — Clone the Repository
```bash
git clone https://github.com/sailubandi/Entertainment-Application-Testing.git
```

### Step 2 — Open the Project
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

## ⚙️ Key Implementation Details

| Feature | Detail |
|--------|--------|
| **Design Pattern** | Page Object Model (POM) |
| **Waits** | Explicit waits for dynamic elements |
| **Navigation** | Direct URL navigation for unstable UI components |
| **Structure** | Readable and maintainable test case organization |

---

## ⚠️ Known Limitations

- OTP verification cannot be automated (security constraint)
- Video playback is validated indirectly (DRM protection)
- Some UI elements are dynamic and may behave inconsistently

---

## 📚 Learning Outcomes

- Designing Selenium automation frameworks from scratch
- Handling dynamic elements in modern web applications
- Implementing structured and reusable test architecture
- Working with real-world testing constraints and limitations

---

## 👩‍💻 Author

**Bandi Poorna Sri Sailaja**

---

## ✅ Conclusion

This project demonstrates a structured, practical approach to automation testing for a streaming application. It covers core user flows, applies industry-standard practices like POM, and navigates real-world constraints — making it a strong showcase of automation engineering skills.

---

<p align="center">Made with ☕ and Selenium</p>
