# Automation Testing Project – E-commerce Web Application

This repository contains a robust, end-to-end automation suite for the [Swag Labs (Sauce Demo)](https://www.saucedemo.com/) e-commerce application. It is designed to validate critical user journeys, including user authentication, product management, and the complete checkout workflow.

## 🚀 Project Overview
The primary goal of this project is to demonstrate a scalable and maintainable automation framework using industry-standard tools and design patterns.

### 🛠 Tech Stack
* **Language:** Java
* **Automation Tool:** Selenium WebDriver
* **Testing Framework:** TestNG
* **Build Tool:** Maven
* **Design Pattern:** Page Object Model (POM)

## 🏗 Framework Architecture
The project follows the **Page Object Model (POM)** to ensure:
* **Maintainability:** UI changes only require updates in the Page classes.
* **Reusability:** Common actions (like logging in or adding to cart) are defined once and reused across tests.
* **Readability:** Test scripts focus on business logic rather than technical locators.

## 🧪 Key Scenarios Automated
1. **Login Workflow:** Validation of standard, locked-out, and problem users.
2. **Product Management:** Sorting items by price/name and adding multiple products to the cart.
3. **Checkout Process:** A full end-to-end flow from personal information entry to order confirmation.
4. **Cart Validations:** Ensuring the cart badge updates correctly and items persist through the session.

## ⚙️ How to Run
1. **Clone the repo:**
   ```bash
   git clone [https://github.com/neeraj-raj-20/Automation-Testing-Project-E-commerce-Web-Application-saucedemo.com-.git](https://github.com/neeraj-raj-20/Automation-Testing-Project-E-commerce-Web-Application-saucedemo.com-.git)
