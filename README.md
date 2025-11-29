# Airline Management System ✈️

**A comprehensive desktop application for managing flight schedules, passenger bookings, and airline operations.**

This system automates the core functions of an airline, providing a seamless interface for administrators to manage flights and for passengers (or booking agents) to reserve tickets. It focuses on data integrity, efficient retrieval, and user-friendly transaction processing.

---

## 🚀 Key Features

* **🛫 Flight Management:** Add, cancel, or reschedule flights with real-time status updates.
* **🎫 Ticket Booking:** streamlined reservation system for passengers with seat selection.
* **❌ Cancellation & Refund:** Automated handling of ticket cancellations.
* **👨‍✈️ Crew & Staff Management:** Database for pilots and air hostesses linked to specific flights.
* **🔍 Search Functionality:** Find flights by source, destination, and date.
* **📃 Invoicing:** Generate printable tickets and transaction reports.

---

## 🛠️ Tech Stack

* **Frontend:** Java (Swing/AWT) 
* **Backend:** Java
* **Database:** MySQL / PostgreSQL
* **Tools:** NetBeans / IntelliJ IDEA, JDBC

---

## 💾 Database Schema

The system relies on a relational database with the following key entities:

1.  **Flights:** `Flight_Code`, `Source`, `Destination`, `Departure_Time`, `Arrival_Time`, `Capacity`.
2.  **Passengers:** `Passport_No`, `Name`, `Nationality`, `Contact_Info`.
3.  **Bookings:** `PNR`, `Flight_Code`, `Passenger_ID`, `Seat_No`, `Date`, `Price`.
4.  **Payment:** `Transaction_ID`, `PNR`, `Amount`, `Payment_Mode`.

---

## 🛠️ Installation & Setup

Follow these steps to set up the project locally.

### Prerequisites
* [Java JDK](https://www.oracle.com/java/technologies/downloads/)
* [MySQL Server](https://dev.mysql.com/downloads/installer/)

### Steps

1.  **Clone the Repository**
    ```bash
    git clone [https://github.com/candelatesla/AirlineManagementSystem.git](https://github.com/candelatesla/AirlineManagementSystem.git)
    cd AirlineManagementSystem
    ```

2.  **Database Configuration**
    * Import the `airline_db.sql` file (provided in this repo) into your MySQL Workbench.
    * This will create the necessary tables and insert dummy data.

3.  **Update Credentials**
    * Open `Conn.java` (or your database connection file).
    * Update the URL, Username, and Password:
        ```java
        c = DriverManager.getConnection("jdbc:mysql:///airline_db", "root", "your_password");
        ```

4.  **Run the Application**
    * Compile and run the Main class:
        ```bash
        javac Main.java
        java Main
        ```

---

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

```bash
# 1. Fork the Project
# 2. Create your Feature Branch
git checkout -b feature/AmazingFeature

# 3. Commit your Changes
git commit -m 'Add some AmazingFeature'

# 4. Push to the Branch
git push origin feature/AmazingFeature

# 5. Open a Pull Request
```
-----

### 👨‍💻 Contributors

**Yash Chetan Doshi**

-----

## 🔗 Connect

<p align="left">
<a href="https://www.linkedin.com/in/yashdoshi8" target="blank"><img align="center" src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white" alt="Yash Doshi" /></a>
<a href="mailto:yash.doshi@tamu.edu"><img align="center" src="https://img.shields.io/badge/Email-D14836?style=for-the-badge&logo=gmail&logoColor=white" alt="Email" /></a>
</p>

