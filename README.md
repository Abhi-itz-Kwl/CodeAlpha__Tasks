# CodeAlpha__Tasks
Developed project Using Java For codeAlpha Internship
TASK 1
Overview
The Student Grade Tracker is a Java-based application designed to streamline the process of recording and analyzing student grades. It allows teachers to input grades for different subjects and students to view their performance reports. This project demonstrates fundamental concepts of object-oriented programming, file handling, and basic user interface design in Java.

Features
Add, update, and delete student records.
Input grades for multiple subjects.
Calculate average grades and overall performance.
Generate detailed report cards.
Simple and user-friendly command-line interface.
Requirements
Java Development Kit (JDK) 11 or later
IDE (Optional): Eclipse, IntelliJ, or any other preferred Java IDE.
Installation
Clone this repository to your local machine using:
sh
Copy
Edit
git clone https://github.com/your-username/student-grade-tracker.git
Navigate to the project directory:
sh
Copy
Edit
cd student-grade-tracker
Compile the Java files:
sh
Copy
Edit
javac *.java
Run the application:
sh
Copy
Edit
java Main
Usage
Add New Student: Enter student details such as name, roll number, and subjects.
Enter Grades: Input grades for each subject.
View Report Card: Check the report card with calculated averages and grades.
Update or Delete Records: Modify existing student records or remove them.
TASK 2
Online Quiz Platform
This is an Online Quiz Platform developed in Java as part of the CodeAlpha internship. The platform allows users to take quizzes, view scores, and explore different categories of questions. It provides an interactive and user-friendly interface for an engaging quiz experience.

Features
User Registration & Login: Secure authentication system for users to register and log in.
Quiz Categories: Multiple quiz categories to choose from.
Timed Quizzes: Each quiz is timed, enhancing the challenge for users.
Score Tracking: Displays scores at the end of each quiz.
Admin Panel: Admins can add, edit, and delete questions.
Responsive UI: User-friendly and responsive interface for better user experience.
Tech Stack
Programming Language: Java
Framework: Java Swing (for GUI)
Database: MySQL (for storing user data and quiz questions)
IDE: IntelliJ IDEA / Eclipse
Installation
Clone the Repository:

bash
Copy
Edit
git clone https://github.com/your-username/online-quiz-platform.git
Open the Project in IDE:
Open the project in IntelliJ IDEA or Eclipse.

Configure Database:

Install MySQL and create a database named quiz_platform.
Import the database schema from db/quiz_platform.sql.
Update the database configuration in DBConnection.java.
Build and Run the Project:

Compile the project and run the main class: Main.java.
Usage
User Registration:
New users can register using their email and password.

Login:
Registered users can log in to access quizzes.

Select Quiz Category:
Choose from a variety of categories like General Knowledge, Science, Math, etc.

Start Quiz:
Start the quiz, answer the questions within the time limit, and submit.

View Scores:
Scores will be displayed at the end of the quiz.

Admin Features:
Admins can log in to the admin panel to manage quiz questions.

TASK 3
Hotel Reservation System
This project is developed as part of the CodeAlpha Internship. It is a Java-based application that allows users to book, manage, and cancel hotel reservations seamlessly. The system is designed to provide an intuitive user experience while ensuring efficient booking management for hotels.

Features
User Registration & Login

Secure user authentication.
New users can sign up, while existing users can log in.
Room Availability Check

Displays available rooms based on user-selected dates.
Filters by room type (Single, Double, Suite, etc.).
Booking Management

Users can book rooms by selecting check-in and check-out dates.
View booking history and details.
Modify or cancel existing reservations.
Payment Integration

Simulated payment gateway for booking confirmation.
Generates invoices for completed reservations.
Admin Panel

Manage room inventory and pricing.
View and manage all reservations.
Generate reports on booking trends.
Technologies Used
Programming Language: Java (JDK 17 or above)
Database: MySQL
IDE: Eclipse/IntelliJ IDEA
UI Design: Swing (for desktop application) / JavaFX (if implemented)
Build Tool: Maven/Gradle
Installation and Setup
Clone the Repository

bash
Copy
Edit
git clone https://github.com/your-username/hotel-reservation-system.git
cd hotel-reservation-system
Configure Database

Install MySQL and create a database named hotel_reservation.
Import the provided SQL script (database/schema.sql) to create necessary tables.
Update the database connection details in db/DBConnection.java:
java
Copy
Edit
String url = "jdbc:mysql://localhost:3306/hotel_reservation";
String username = "root";
String password = "your_password";
Build and Run the Application

If using Maven:
bash
Copy
Edit
mvn clean install
mvn exec:java
If using an IDE, open the project and run the Main.java file.
Usage
User Flow:

Register or log in.
Search for room availability.
Select room type and dates.
Confirm booking and proceed with payment.
View booking confirmation and invoice.
Admin Flow:

Log in as Admin.
Manage room inventory and pricing.
View all bookings.
Generate reports on bookings and revenue.
