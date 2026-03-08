Journal App 📝

A backend REST API built using Spring Boot that allows users to create, manage, and organize their personal journal entries.

This project is part of my backend development practice while transitioning from automation engineering to backend development.

🚀 Tech Stack

Java

Spring Boot

Spring Data MongoDB

Maven

REST APIs

Lombok

📌 Features (Current)

Create a journal entry

Get all journal entries

Get journal entry by ID

Update journal entry

Delete journal entry

MongoDB database integration

🏗 Project Structure
src/main/java/com/example/journalApp
│
├── controller
│   └── JournalController.java
│
├── service
│   └── JournalService.java
│
├── repository
│   └── JournalRepository.java
│
└── model
    └── JournalEntry.java
📡 API Endpoints
Create Journal Entry
POST /journal
Get All Journals
GET /journal
Get Journal by ID
GET /journal/{id}
Update Journal
PUT /journal/{id}
Delete Journal
DELETE /journal/{id}
⚙️ How to Run the Project

Clone the repository

git clone https://github.com/harshbhansingh/journalApp.git

Navigate to the project folder

cd journalApp

Run the Spring Boot application

mvn spring-boot:run

Make sure MongoDB is running locally.

Default MongoDB connection:

mongodb://localhost:27017/journaldb
🧪 Future Improvements

Planned features for upcoming updates:

User authentication with JWT

User-specific journals

Pagination

Search functionality

Tags for journals

Exception handling

Unit and integration testing

Docker support

👨‍💻 Author

Harsh Bhan Singh

Backend developer transitioning from automation engineering with experience in test frameworks, CI/CD pipelines, and large-scale systems.
