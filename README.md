# 🏏 IPL Team and Player Management System

A full-stack web application to manage IPL (Indian Premier League) teams and players. Built with **Java Spring Boot** on the backend and **Angular** on the frontend, with **MySQL** as the database.

---

## 📌 Features

- **Team Management** — Create, view, update, and delete IPL teams
- **Player Management** — Add, update, remove, and list players within teams
- **Full CRUD Operations** — Complete data management across all entities
- **RESTful APIs** — Clean, well-structured API endpoints for all operations
- **Exception Handling** — Global exception handling with meaningful error responses
- **Optimized Queries** — SQL query optimization for fast data retrieval

---

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Backend | Java, Spring Boot, Spring MVC |
| Database | MySQL (JDBC) |
| Frontend | Angular, TypeScript, HTML, CSS |
| API | RESTful APIs |
| Tools | Git, GitHub, VS Code, Postman |

---

## 🗂️ Project Structure

```
Incremental/
├── server/          # Spring Boot backend
│   ├── src/
│   │   ├── main/java/
│   │   │   ├── controller/    # REST API controllers
│   │   │   ├── service/       # Business logic
│   │   │   ├── repository/    # Database layer (JDBC)
│   │   │   ├── model/         # Entity classes
│   │   │   └── exception/     # Global exception handling
│   │   └── resources/
│   │       └── application.properties
│   └── pom.xml
├── client/          # Angular frontend
│   ├── src/
│   │   └── app/
│   │       ├── components/
│   │       └── services/
│   └── package.json
└── test/            # Test cases
```

---

## 🔌 API Endpoints

### Teams

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/teams` | Get all teams |
| GET | `/api/teams/{id}` | Get team by ID |
| POST | `/api/teams` | Create a new team |
| PUT | `/api/teams/{id}` | Update a team |
| DELETE | `/api/teams/{id}` | Delete a team |

### Players

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/players` | Get all players |
| GET | `/api/players/{id}` | Get player by ID |
| GET | `/api/players/team/{teamId}` | Get players by team |
| POST | `/api/players` | Add a new player |
| PUT | `/api/players/{id}` | Update player details |
| DELETE | `/api/players/{id}` | Remove a player |

---

## 🗄️ Database Schema

```sql
CREATE TABLE teams (
    id       INT PRIMARY KEY AUTO_INCREMENT,
    name     VARCHAR(100) NOT NULL,
    city     VARCHAR(100),
    coach    VARCHAR(100),
    owner    VARCHAR(100)
);

CREATE TABLE players (
    id         INT PRIMARY KEY AUTO_INCREMENT,
    name       VARCHAR(100) NOT NULL,
    role       VARCHAR(50),
    nationality VARCHAR(50),
    age        INT,
    team_id    INT,
    FOREIGN KEY (team_id) REFERENCES teams(id)
);
```

---

## 🚀 Getting Started

### Prerequisites

- Java 17+
- Node.js 18+
- MySQL 8+
- Maven

### Backend Setup

```bash
# Clone the repository
git clone https://github.com/bhanupratapsinghthapa/Incremental.git
cd Incremental/server

# Configure database in src/main/resources/application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/ipl_db
spring.datasource.username=your_username
spring.datasource.password=your_password

# Run the Spring Boot app
mvn spring-boot:run
```

The backend will start at `http://localhost:8080`

### Frontend Setup

```bash
cd ../client

# Install dependencies
npm install

# Start the Angular app
ng serve
```

The frontend will be available at `http://localhost:4200`

---

## 📸 Screenshots

> _Coming soon_

---

## 🧪 Testing

```bash
cd test
# Run test cases
mvn test
```

---

## 👤 Author

**Bhanu Pratap Singh Thapa**  
📧 bhanupratapsinghthapa@gmail.com  
🔗 [LinkedIn](https://linkedin.com/in/bhanupratapsinghthapa)

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).
