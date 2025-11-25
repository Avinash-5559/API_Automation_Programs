# API Automation Programs 🚀  

![Java](https://img.shields.io/badge/Java-11%2B-blue?logo=openjdk)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ%20IDEA-IDE-000000?logo=intellijidea&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-Build%20Tool-C71A36?logo=apachemaven&logoColor=white)
![Rest Assured](https://img.shields.io/badge/Rest%20Assured-API%20Testing-green)
![TestNG](https://img.shields.io/badge/TestNG-Framework-FF6C37?logo=testng&logoColor=white)
![Allure](https://img.shields.io/badge/Allure-Reports-purple)
![Apache POI](https://img.shields.io/badge/Apache%20POI-Excel%20Integration-yellow)
![Gson](https://img.shields.io/badge/Gson-JSON%20Parser-lightgrey?logo=google)
![Jackson](https://img.shields.io/badge/Jackson-JSON%20Parser-blue)


---

## 🗂️ Overview  

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
API_Automation_Programs/
│
├── .idea/                                                                  # IntelliJ project files
├── .mvn/                                                                   # Maven wrapper files
├── allure-report/                                                          # Allure Report HTML (generated)
├── allure-results/                                                         # Allure results (JSON, attachments, etc.)
│
├── src/
│   ├── main/
│   │   └── java/com.avinashsinha/                                          
│   │
│   └── test/
│       └── java/com.avinashsinha/
│           │
│           ├── AAP01_RA_Basics/                                            # Rest-Assured Basics
│           │   ├── APITesting01.java
│           │   ├── APITesting02.java
│           │   ├── APITesting03_BuilderDesignPattern.java
│           │   └── APITesting04_Multiple_TestCases_Problem.java
│           │
│           ├── AAP02_RA_TestNG_AllureReport/                               # Rest-Assured + TestNG + Allure
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
│           ├── AAP08_testNG_Examples/                                      # TestNG Concepts
│           │   ├── APITesting13_AnnotationWithoutPriority.java
│           │   ├── APITesting14_AnnotationWithPriority.java
│           │   ├── APITesting15_Groups.java
│           │   ├── APITesting16_DependsOnMethod.java
│           │   ├── APITesting17_Parameter.java
│           │   ├── APITesting18_Enabled.java
│           │   ├── APITesting19_AlwaysRun.java
│           │   └── APITesting20_InvocationCount.java
│           │   ├── APITesting21_All_Annotations_1.java
│           │   └── APITesting22_All_Annotations_2.java
│           │
│           ├── AAP09_Assertions/                                           # Assertions
│           │   ├── APITesting23_RestAssured_Assertions.java
│           │   ├── APITesting24_TestNG_Assertions.java
│           │   ├── APITesting25_AssertJ_Assertions.java
│           │   └── APITesting26_All_Assertions.java
│           │
│           ├── AAP10_PayloadManagement/                                    # Payload Using Map
│           │   └── APITesting27_Payload_Map.java
│           │
│           ├── AAP10_PayloadManagement.ByAl_03/                            # POJO Payload (Approach 3)
│           │   ├── Booking.java
│           │   └── BookingDates.java
│           │
│           ├── AAP10_PayloadManagement.ByManual_01/                        # POJO Payload (Approach 1)
│           │   ├── Booking.java
│           │   └── BookingDates.java
│           │
│           ├── AAP10_PayloadManagement.ByTool_02/                          # POJO Payload (Approach 2)
│           │   ├── Booking.java
│           │   └── BookingDates.java
│           │
│           ├── AAP10_PayloadManagement.Gson/                               # Payload with Gson
│           │   ├── APITesting28_Gson.java
│           │   ├── Booking.java
│           │   ├── BookingDates.java
│           │   └── BookingResponse.java
│           │
│           └── AAP10_PayloadManagement.Jackson/                            # Payload with Jackson
│               ├── APITesting29_Jackson.java
│               ├── Booking.java
│               ├── BookingDates.java
│               └── BookingResponse.java
│
├── testng_*.xml                                                            # All TestNG Suite files
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
├── pom.xml                                                                 # Maven dependencies
├── .gitignore
│
└── README.md

```
---
## 📊 Sample Allure Report

Here’s an example of an Allure test report generated from this project:

#### ✅ You can generate your own reports after running tests using:
```bash
mvn clean test
mvn allure:serve
```
<img width="1920" height="919" alt="image" src="https://github.com/user-attachments/assets/3a0cabbf-2998-41a5-b275-1c9f65dab3bb" />

---

## 📌 Author
👤 Avinash Sinha

---
📝 This repository is created exclusively for **educational and practice use**.

---
