# 🚀 API Automation Programs

> A comprehensive collection of **API Automation Programs** built using **Java**, **Rest Assured**, **TestNG**, **Maven**, **Gson**, **Jackson**, and **Allure Reports** to learn REST API automation concepts from **fundamentals to advanced techniques**.

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

This repository contains a comprehensive collection of **API Automation Programs** developed using **Java**, **Rest Assured**, **TestNG**, and **Maven** to help understand REST API automation through practical examples.

The project covers the complete API testing workflow, including **CRUD operations**, **BDD & Non-BDD approaches**, **payload management**, **TestNG concepts**, **assertions**, **JSON serialization/deserialization**, and **Allure reporting**, making it an excellent learning resource for mastering API automation with **Rest Assured**.

---

# ✨ Repository Highlights

- ✅ REST API Automation with Rest Assured
- ✅ CRUD Operations (GET, POST, PUT, PATCH & DELETE)
- ✅ BDD & Non-BDD Testing Approaches
- ✅ Builder Design Pattern
- ✅ TestNG Fundamentals & Advanced Features
- ✅ TestNG Groups, Parameters & Annotations
- ✅ Assertions using Rest Assured, TestNG & AssertJ
- ✅ Payload Management using Map & POJOs
- ✅ JSON Serialization & Deserialization with Gson & Jackson
- ✅ Interactive Allure Reporting

---

# 🛠️ Tech Stack

| Technology | Usage |
|------------|-------|
| **Java 11+** | Programming Language |
| **Maven** | Dependency & Build Management |
| **Rest Assured** | REST API Automation |
| **TestNG** | Test Framework |
| **AssertJ** | Fluent Assertions |
| **Apache POI** | Excel Data Handling |
| **Gson** | JSON Serialization & Deserialization |
| **Jackson** | JSON Data Binding |
| **Allure Reports** | Test Reporting |
| **IntelliJ IDEA** | Development IDE |

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

| Module | Description |
|----------|-------------|
| **AAP01** | Rest Assured Fundamentals |
| **AAP02** | TestNG & Allure Integration |
| **AAP03** | GET Request Automation |
| **AAP04** | POST Request Automation |
| **AAP05** | PUT Request Automation |
| **AAP06** | PATCH Request Automation |
| **AAP07** | DELETE Request Automation |
| **AAP08** | TestNG Features & Annotations |
| **AAP09** | Assertions using Rest Assured, TestNG & AssertJ |
| **AAP10** | Payload Management using Map, POJOs, Gson & Jackson |

---

# ▶️ Running Tests

Execute any TestNG suite using Maven.

### Example

```bash
mvn clean test -DsuiteXmlFile=testng_plugin.xml
```

### Available TestNG Suites

- `testng_plugin.xml`
- `testng_ai.xml`
- `testng_manual.xml`
- `testng_AlwaysRun.xml`
- `testng_Enabled.xml`
- `testng_Groups_P1.xml`
- `testng_Groups_Sanity.xml`
- `testng_Groups_Regression.xml`
- `testng_Parameter_Chrome.xml`
- `testng_Parameter_Firefox.xml`
- `testng_APITesting09_Non_BDD_Style.xml`

---

# 📊 Allure Reports

Generate the Allure report after executing the test suite:

```bash
mvn clean test
mvn allure:serve
```

<p align="center">
<img width="1100" src="https://github.com/user-attachments/assets/3a0cabbf-2998-41a5-b275-1c9f65dab3bb" alt="Allure Report">
</p>

The command launches an interactive **Allure dashboard** that provides detailed execution reports, test statistics, logs, and insights for every test run.

---

# ⭐ Repository Highlights

- 📘 Covers API automation concepts from beginner to advanced level
- 📡 Demonstrates complete REST API CRUD operations
- 🧪 Includes both BDD and Non-BDD Rest Assured approaches
- 📦 Multiple payload management techniques using Map, POJOs, Gson, and Jackson
- ✔️ Practical examples of TestNG annotations, groups, parameters, and assertions
- 📊 Integrated Allure Reports for rich execution reporting
- 🏗️ Well-organized project structure for easy learning and navigation

---

# 👨‍💻 Author

**Avinash Sinha**

If you found this repository useful, consider giving it a ⭐.

---

# 📄 License

This repository is intended for **educational**, **learning**, and **practice purposes**.
