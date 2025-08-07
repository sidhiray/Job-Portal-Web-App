# 🧳 Job Portal Web App

A simple Job Portal application built using Java and Spring MVC. This project allows users to find jobs and add new job postings dynamically. It's a basic demo for understanding MVC architecture and data flow in a Java web application.

> 📌 Note: This version uses `ArrayList` for in-memory storage — no database connection is implemented yet.

---

## 🛠 Tech Stack

- **Language:** Java
- **Frameworks:** Spring MVC
- **View:** JSP, JSTL, HTML/CSS
- **Backend:** Servlet, Spring MVC Controllers
- **Tools:** IntelliJ IDEA, Git
- **Build Tool:** Maven

---

## 🔍 Features

- 🚀 Add new job postings dynamically  
- 🔎 View jobs opening
- 🧩 Follows MVC pattern (Controller → Service → DTO → View)  
- 📦 Data is passed between layers using DTO objects  
- 📄 Uses `Model` to send data to the JSP view

---

## 📂 Project Structure

```text
src/
├── controller/
│   └── JobController.java
├── service/
│   └── JobService.java
├── model/
│   └── JobPost.java
├── repository/
│   └── JobRepo.java
webapp/
├── WEB-INF/
│   ├── views/
│   │   ├── viewalljobs.jsp
│   │   └── home.jsp
│   │   └── success.jsp
│   │   └── addnewjobs.jsp
├── resources/
│   └── css/
│       └── style.css



How to Run Locally
1. Clone the repository
git clone https://github.com/sidhiray/Job-Portal-Web-App.git

2. Import in Eclipse or IntelliJ
  Import as a Maven Project
  Use Tomcat Server (version 10+)
  Make sure JSP support is enabled

3. Add Dependencies
  Tomcat-Jasper
  Jakarta Standard Tag Library API
  Jakarta Standard Tag Library Implementation

4. Build & Run
    Right-click → Run on Server
    Access the app in browser:
    http://localhost:8080/Job-Portal-Web-App/
