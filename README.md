# Password Strength Checker

A simple, interactive Java application that evaluates the strength of a user-entered password based on common security criteria.

## Features

- **Length Check:** Ensures the password is at least 8 characters long.
- **Character Diversity Checks:**
  - Presence of at least one uppercase letter (`A-Z`).
  - Presence of at least one lowercase letter (`a-z`).
  - Presence of at least one numerical digit (`0-9`).
  - Presence of at least one special character (e.g., `!@#$%^&*`).
- **Visual Breakdown:** Provides clear `✅` / `❌` status indicators for each individual security rule.
- **Overall Rating:** Categorizes password strength as **Strong**, **Moderate**, or **Weak**.

## How to Run It

### Prerequisites
Make sure you have the Java Development Kit (JDK) installed on your computer.

### Steps

1. **Clone or download the repository:**
   ```bash
   git clone https://github.com/AadiJ20/password-strength-checker.git
2. Compile the Java program:
   javac PasswordChecker.java
3. Run the application:
   java PasswordChecker
