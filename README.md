# Radha_SDET_Assignment
## 📌 Overview
This repository contains two assignments as part of an SDET evaluation:

- ✅ **Assignment 1**: Java logic to find the longest substring without repeating characters.
- ✅ **Assignment 2**: BDD Automation framework using Java + Selenium + Cucumber with PageFactory.

## ✅ Assignment 1: Longest Substring Without Repeating Characters

### 🔧 Description:
Write a Java program that returns the **longest substring** without repeating characters **along with its length**.

### 🗂 Location:
```
src/main/java/longestSubstring/LengthOfLongestSubstring.java
```

### 💡 Features:
- Accepts user input via console
- Returns longest substring + length
- Includes commented section with hardcoded test cases

### ▶️ Example Output:
```
Enter a string: abcabcbb
Longest Substring: abc, Length: 3


## ✅ Assignment 2: Selenium BDD Framework (with Cucumber + PageFactory)

### 🌐 Scenario:
You are testing a dummy site `https://agrichain.com` which:
- Takes a string input on the homepage
- Displays the longest non-repeating substring on submission

### 🏗 Tech Stack:
- Java
- Maven
- Selenium WebDriver
- Cucumber (BDD)
- JUnit
- PageFactory Design Pattern

### 📁 Folder Structure:
```
src/
├── main/java/
│   └── pages/
│       ├── HomePage.java         # PageFactory used
│       └── ResultPage.java       # PageFactory used
├── test/java/
│   ├── stepDefinitions/
│   │   └── SubstringSteps.java
│   ├── runners/
│   │   └── TestRunner.java
│   └── utils/
│       └── DriverFactory.java    # WebDriver setup
└── test/resources/
    └── substring_longest/
        └── substringLongest.feature
```

### 🧪 Test Features:
- Written in Gherkin (`.feature` file)
- Uses `Scenario Outline` for **data-driven testing**
- Validates both **valid inputs** and **edge/invalid cases**

### 📝 Sample Feature:
```gherkin
Scenario Outline: Validate longest substring output for valid inputs
  Given user is on homepage
  When user enters "<inputString>"
  And clicks on submit
  Then the result should be "<expectedOutput>"

Examples:
  | inputString | expectedOutput |
  | abcabcbb    | abc            |
  | bbbbb       | b              |
```

---




