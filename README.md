# API Automation Programs 🚀  

![Java](https://img.shields.io/badge/Java-11%2B-blue?logo=openjdk)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ%20IDEA-Editor-blue?logo=intellijidea)
![Rest Assured](https://img.shields.io/badge/Rest%20Assured-API%20Testing-green)
![TestNG](https://img.shields.io/badge/TestNG-Testing-orange)
![Allure](https://img.shields.io/badge/Allure-Reports-purple)
![Apache POI](https://img.shields.io/badge/Apache%20POI-Excel%20Integration-yellow)
![Gson](https://img.shields.io/badge/Gson-JSON%20Parser-lightgrey?logo=google)
![Jackson](https://img.shields.io/badge/Jackson-JSON%20Parser-blue)
![Maven](https://img.shields.io/badge/Maven-Build%20Tool-red?logo=apachemaven)


---

## 📌 Overview  

This repository contains **API automation programs** to learn and master **REST API testing with Rest Assured** in **Java**.  
It demonstrates how to structure test automation projects using **TestNG**, generate reports with **Allure**, and implement **data-driven testing** with **Apache POI (Excel)**.  

---

## 📚 Lessons Covered  

- ✅ Basics of **Rest Assured**  
- 📡 Performing **CRUD operations**:  
  - `GET` → Retrieve resources  
  - `POST` → Create new resources  
  - `PUT` → Update existing resources  
  - `PATCH` → Partial update of resources  
  - `DELETE` → Remove resources  
- 🧪 Integrating with **TestNG** for test structuring  
- 📊 Generating detailed test reports using **Allure**  
- 📂 Implementing **Data-Driven Testing** with **Apache POI**  
- 🔄 Working with **JSON serialization/deserialization** using **Gson** & **Jackson**  

---

## 🛠️ Technologies Used  

| Technology        | Purpose                                              |
|-------------------|------------------------------------------------------|
| **Java**          |	Core programming language for automation             |
| **IntelliJ IDEA**	| Integrated Development Environment (IDE)             |
| **Maven**	        | Build automation, dependency, and project management |
| **Rest Assured**	| API testing and validation framework                 |
| **TestNG**	      | Test execution, assertions, and test management      |
| **Allure**	      | Test reporting and result visualisation              |
| **Apache POI**	  | Data-driven testing with Excel files                 |
| **Gson**	        | JSON parsing and object serialisation                |
| **Jackson**	      | JSON parsing, data binding, and serialisation        |

---

## 🏗️ Project Structure  

```bash
API-Automation-Programs
│
├── src/test/java/
│   ├── base/                 # Base test setup
│   ├── crud/                 # CRUD test cases
│   ├── utils/                # Utility functions (Excel, Config, JSON, etc.)
│   └── tests/                # TestNG test classes
│
├── testng.xml                # TestNG suite file
├── pom.xml                   # Maven dependencies
└── README.md                 # Project documentation
```
---
## 📊 Sample Allure Report

Here’s an example of an Allure test report generated from this project:

#### ✅ You can generate your own reports after running tests using:
```bash
mvn clean test
mvn allure:serve
```
## 📌 Author
👤 Avinash Sinha

---
📝 This repository is created exclusively for **educational and practice use**.

---
