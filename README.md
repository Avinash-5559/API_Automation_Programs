# 🚀 API Automation Programs

> A collection of **API Automation Programs** built using **Java**, **Rest Assured**, **TestNG**, **Maven**, **Allure Reports**, **Gson**, and **Jackson** to learn REST API automation concepts from basic to advanced.

<p align="center">

![Java](https://img.shields.io/badge/Java-11+-blue?logo=openjdk)
![Maven](https://img.shields.io/badge/Maven-Build%20Tool-C71A36?logo=apachemaven&logoColor=white)
![RestAssured](https://img.shields.io/badge/RestAssured-API--Testing-yellowgreen)
![TestNG](https://img.shields.io/badge/TestNG-Framework-brightgreen)
![AssertJ](https://img.shields.io/badge/AssertJ-Assertions-orange)
![Apache POI](https://img.shields.io/badge/Apache%20POI-Excel%20Support-blue)
![Gson](https://img.shields.io/badge/Gson-JSON-lightgrey)
![Jackson](https://img.shields.io/badge/Jackson-JSON-blue)
![Allure](https://img.shields.io/badge/Allure-Reports-ff69b4)

</p>

---

# 🗂️ Overview

This repository contains a collection of **API Automation Programs** developed using **Java**, **Rest Assured**, **TestNG**, and **Maven**.

The project is designed as a **learning repository** that gradually introduces REST API automation concepts—from basic request creation to advanced topics such as payload management, assertions, TestNG features, reporting, and JSON serialization.

It serves as a practical reference for anyone learning API automation using **Rest Assured**.

---

# ✨ Topics Covered

- ✅ Rest Assured Basics
- ✅ GET, POST, PUT, PATCH & DELETE Requests
- ✅ BDD & Non-BDD Style API Testing
- ✅ TestNG Fundamentals
- ✅ TestNG Groups & Parameters
- ✅ TestNG Annotations
- ✅ Assertions (Rest Assured, TestNG & AssertJ)
- ✅ Payload Management
- ✅ Builder Design Pattern
- ✅ POJO Serialization & Deserialization
- ✅ Gson & Jackson
- ✅ Allure Reporting

---

# 🛠️ Tech Stack

| Technology | Usage |
|------------|-------|
| Java 11+ | Programming Language |
| Maven | Dependency & Build Management |
| Rest Assured | API Automation |
| TestNG | Test Framework |
| AssertJ | Fluent Assertions |
| Apache POI | Excel Data Handling |
| Gson | JSON Serialization |
| Jackson | JSON Data Binding |
| Allure Reports | Test Reporting |
| IntelliJ IDEA | Development IDE |

---

# 🏗️ Project Structure

```text
API_Automation_Programs/
│
├── .idea/                                                                  # IntelliJ project files
├── .mvn/                                                                   # Maven wrapper files
├── allure-report/                                                          # Generated Allure report
├── allure-results/                                                         # Allure execution results
│
├── pom.xml                                                                 # Maven dependencies & build configuration
├── .gitignore
│
├── src/
│   ├── main/
│   │   └── java/
│   │
│   └── test/
│       └── java/com.avinashsinha/
│           │
│           ├── AAP01_RA_Basics/                                            # Rest Assured Basics
│           │   ├── APITesting01.java
│           │   ├── APITesting02.java
│           │   ├── APITesting03_BuilderDesignPattern.java
│           │   └── APITesting04_Multiple_TestCases_Problem.java
│           │
│           ├── AAP02_RA_TestNG_AllureReport/                               # Rest Assured + TestNG + Allure
│           │   └── APITesting04_Multiple_TestCases_Fix.java
│           │
│           ├── AAP03_GET_Request/                                          # GET Request Examples
│           │   ├── APITesting05_BDD_Style.java
│           │   ├── APITesting06_Non_BDD_Style.java
│           │   └── APITesting07_GetBookingIds.java
│           │
│           ├── AAP04_POST_Request/                                         # POST Request Examples
│           │   ├── APITesting08_BDD_Style.java
│           │   └── APITesting09_Non_BDD_Style.java
│           │
│           ├── AAP05_PUT_Request/                                          # PUT Request Examples
│           │   └── APITesting10_Non_BDD_Style.java
│           │
│           ├── AAP06_PATCH_Request/                                        # PATCH Request Examples
│           │   └── APITesting11_Non_BDD_Style.java
│           │
│           ├── AAP07_DELETE_Request/                                       # DELETE Request Examples
│           │   └── APITesting12_Non_BDD_Style.java
│           │
│           ├── AAP08_TestNG_Examples/                                      # TestNG Concepts
│           │   ├── APITesting13_AnnotationWithoutPriority.java
│           │   ├── APITesting14_AnnotationWithPriority.java
│           │   ├── APITesting15_Groups.java
│           │   ├── APITesting16_DependsOnMethod.java
│           │   ├── APITesting17_Parameter.java
│           │   ├── APITesting18_Enabled.java
│           │   ├── APITesting19_AlwaysRun.java
│           │   ├── APITesting20_InvocationCount.java
│           │   ├── APITesting21_All_Annotations_1.java
│           │   └── APITesting22_All_Annotations_2.java
│           │
│           ├── AAP09_Assertions/                                           # Assertion Examples
│           │   ├── APITesting23_RestAssured_Assertions.java
│           │   ├── APITesting24_TestNG_Assertions.java
│           │   ├── APITesting25_AssertJ_Assertions.java
│           │   └── APITesting26_All_Assertions.java
│           │
│           ├── AAP10_PayloadManagement/                                    # Map Payload
│           │   └── APITesting27_Payload_Map.java
│           │
│           ├── AAP10_PayloadManagement.ByManual_01/                        # POJO Payload (Approach 1)
│           │   ├── Booking.java
│           │   └── BookingDates.java
│           │
│           ├── AAP10_PayloadManagement.ByTool_02/                          # POJO Payload (Approach 2)
│           │   ├── Booking.java
│           │   └── BookingDates.java
│           │
│           ├── AAP10_PayloadManagement.ByAI_03/                            # POJO Payload (Approach 3)
│           │   ├── Booking.java
│           │   └── BookingDates.java
│           │
│           ├── AAP10_PayloadManagement.Gson/                               # Gson Payload Management
│           │   ├── APITesting28_Gson.java
│           │   ├── Booking.java
│           │   ├── BookingDates.java
│           │   └── BookingResponse.java
│           │
│           └── AAP10_PayloadManagement.Jackson/                            # Jackson Payload Management
│               ├── APITesting29_Jackson.java
│               ├── Booking.java
│               ├── BookingDates.java
│               └── BookingResponse.java
│
├── testng_*.xml                                                            # TestNG Suite Files
│   ├── testng_ai.xml
│   ├── testng_AlwaysRun.xml
│   ├── testng_APITesting09_Non_BDD_Style.xml
│   ├── testng_Enabled.xml
│   ├── testng_Groups_P1.xml
│   ├── testng_Groups_Regression.xml
│   ├── testng_Groups_Sanity.xml
│   ├── testng_manual.xml
│   ├── testng_Parameter_Chrome.xml
│   ├── testng_Parameter_Firefox.xml
│   └── testng_plugin.xml
│
└── README.md
```

---

# 📚 Learning Modules

| Module | Concepts Covered |
|----------|------------------|
| **AAP01** | Rest Assured Basics |
| **AAP02** | TestNG + Allure Integration |
| **AAP03** | GET Requests |
| **AAP04** | POST Requests |
| **AAP05** | PUT Requests |
| **AAP06** | PATCH Requests |
| **AAP07** | DELETE Requests |
| **AAP08** | TestNG Features |
| **AAP09** | Assertions (Rest Assured, TestNG & AssertJ) |
| **AAP10** | Payload Management (Map, POJO, Gson & Jackson) |

---

# ▶️ Running Tests

Execute any TestNG suite using Maven.

### Example

```bash
mvn clean test -DsuiteXmlFile=testng_plugin.xml
```

---

# 📊 Allure Reports

Generate the report using:

```bash
mvn clean test
mvn allure:serve
```

<p align="center">
<img width="1100" src="https://github.com/user-attachments/assets/3a0cabbf-2998-41a5-b275-1c9f65dab3bb" alt="Allure Report">
</p>

The command launches an interactive Allure dashboard in your default browser.

---

# 👨‍💻 Author

**Avinash Sinha**

If you found this repository helpful, consider giving it a ⭐ on GitHub.

---

# 📄 License

This project is intended for **educational** and **learning purposes**.
