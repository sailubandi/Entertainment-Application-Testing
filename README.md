
```md
# Entertainment Application Testing (JioHotstar Automation Framework)

## Project Overview
This project is a Selenium-based automation testing framework developed to validate core functionalities of an entertainment streaming application inspired by JioHotstar.

The framework automates key workflows such as login, search, and playback validation using Java, Selenium WebDriver, and TestNG. It follows the Page Object Model (POM) design pattern to ensure better structure and maintainability.

---

## Objectives
- Automate core user flows of an entertainment application  
- Implement a structured automation framework using POM  
- Handle dynamic web elements  
- Build reusable and maintainable test cases  

---

## Tech Stack
- Java  
- Selenium WebDriver  
- TestNG  
- Maven  
- Git and GitHub  

---

## Framework Design

The framework is structured using the Page Object Model (POM):

- **Base Layer**  
  Handles browser setup and teardown  

- **Page Layer**  
  Contains UI elements and page-specific methods  
  - HomePage.java  
  - LoginPage.java  
  - SearchPage.java  
  - PlayerPage.java  

- **Test Layer**  
  Contains test cases  
  - LoginTest.java  
  - SearchTest.java  
  - PlaybackTest.java  

---

## Project Structure

```

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

```

---

## Test Scenarios

### Login Flow
- Navigate to login page using URL  
- Enter mobile number  
- Validate login execution  

Note: OTP verification is not automated.

---

### Search Functionality
- Navigate to search page  
- Enter search keyword (example: IPL)  
- Validate search execution  

---

### Playback Validation
- Open homepage  
- Click on content  
- Validate navigation to player page  

Note: Video playback is validated indirectly.

---

## How to Run

1. Clone the repository
```

git clone [https://github.com/sailubandi/Entertainment-Application-Testing.git](https://github.com/sailubandi/Entertainment-Application-Testing.git)

```

2. Open in Eclipse as Maven Project  

3. Update dependencies  
Right click project → Maven → Update Project  

4. Run tests  
Right click `testng.xml` → Run as TestNG Suite  

---

## Key Points
- Implemented Page Object Model (POM)  
- Used explicit waits for handling elements  
- Handled dynamic UI using direct navigation  
- Maintained clean and modular code structure  

---

## Limitations
- OTP verification is not automated  
- Video playback is validated indirectly  
- Some UI elements are dynamic  

---

## Author
Bandi Poorna Sri Sailaja
```


