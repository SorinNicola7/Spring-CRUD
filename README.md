# 🚗 Vehicle Management System – Spring Dependency Injection Project

## 📌 Project Overview

This project is a Java application built using the Spring Framework (v4.2.2) to demonstrate Object-Oriented Programming (OOP) concepts such as inheritance, along with multiple Dependency Injection (DI) techniques.

The application models a hierarchy of vehicles and uses Spring to manage object creation and dependency injection.

---

## 📋 Project Requirements

The application implements the following class hierarchy:

### 🔹 Base Class

* **Vehicle**

  * Properties:

    * `price`
    * `maximumSpeed`

### 🔹 Derived Classes

* **Autovehicle**

  * إضافă:

    * `brand`
    * `yearOfFabrication`

* **Motorcycle**

  * Adds:

    * `type` (e.g., classic, speed, off-road)

* **Truck**

  * Adds:

    * `maximumLoad`

---

## 🧱 Implementation Details

* Each class includes:

  * Private member variables
  * Default and parameterized constructors
  * Getters and setters
  * `toString()` method

* The application creates and displays **5 vehicle objects** of different types.

* ⚠️ **Design Constraint:**

  * The `MainApp` class depends **only on the base class (`Vehicle`)**, not on derived classes.

---

## ⚙️ Dependency Injection Techniques

Based on the `beans_proiect.xml` configuration, the project demonstrates three DI approaches:

### 1. XML Setter Injection

* Used for **Autovehicle** objects (`auto1`, `auto2`)
* Properties injected using:

  ```xml
  <property name="..." value="..." />
  ```

---

### 2. XML Constructor Injection

* Used for **Truck** objects (`truck1`, `truck2`)
* Values injected using:

  ```xml
  <constructor-arg value="..." />
  ```

---

### 3. Annotation-Based Injection

* Used for **Motorcycle**
* Configuration:

  ```xml
  <context:component-scan base-package="proiect2" />
  ```
* Uses:

  * `@Component`
  * `@Value`

---

## 🛠️ Technology Stack

* **Language:** Java 21
* **Framework:** Spring 4.2.2
  (Core, Beans, Context, JDBC, TX, AOP)
* **Database Connector:** MySQL Connector 5.1.20
* **IDE:** Eclipse

---

## 🚀 How to Run

1. **Clone the repository**

   ```bash
   git clone <your-repo-link>
   ```

2. **Import into Eclipse**

   * File → Import → Existing Projects into Workspace

3. **Configure dependencies**

   * Ensure Spring JARs and `commons-logging` are available
   * ⚠️ `.classpath` may contain local absolute paths → update if needed

4. **Run the application**

   * Execute `MainApp.java`
   * The console will display the injected vehicle objects

---

## 📚 Learning Outcomes

* Understanding OOP inheritance in Java
* Working with Spring Dependency Injection
* Comparing multiple DI approaches:

  * Setter Injection
  * Constructor Injection
  * Annotation-Based Injection
* Managing object lifecycle with Spring

---

## 🔧 Possible Improvements

* Upgrade to Spring Boot
* Replace XML configuration with full annotation-based config
* Add REST API layer
* Introduce Maven/Gradle for dependency management

---
