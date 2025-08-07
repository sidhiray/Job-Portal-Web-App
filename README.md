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
