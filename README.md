---

# Secure Chat Application

## Overview
This is a full-stack chat application with a **Java backend** and **MongoDB database** for secure and scalable user communication. It supports essential features like **real-time messaging**, **user authentication**, and **end-to-end encryption** for ensuring message privacy.

The backend is written in **pure Java** (no frameworks), and the frontend consists of **HTML**, **CSS**, and **JavaScript**, neatly structured for maintainability and performance.

---

## Features
- **User Registration and Authentication:** Secure signup and login functionality.
- **Real-time Chat:** Handles messaging between users efficiently.
- **End-to-End Encryption:** Ensures that messages remain private and cannot be intercepted.
- **Database Integration:** Stores user credentials and chat logs in **MongoDB**.
- **Lightweight Architecture:** Uses simple Java classes and a minimal HTTP server.

---

## Technologies Used
- **Backend:** Java (no frameworks)
- **Database:** MongoDB
- **Frontend:** HTML, CSS, JavaScript
- **Encryption:** AES and RSA for secure communications

---

## Folder Structure
```
my-chat-app/
├── src/                      # Backend source files
│   ├── MainServer.java       # Main server entry point
│   ├── StaticFileHandler.java# Handles serving static files
│   ├── Registration.java     # Handles user registration
│   ├── Login.java            # Handles user login
│   ├── ChatHandler.java      # Handles chat logic
│   ├── Utils.java            # Common utilities
│
├── public/                   # Frontend files
│   ├── index.html            # Main chat page
│   ├── signup.html           # Signup page
│   ├── login.html            # Login page
│   ├── css/                  # Stylesheets
│   │   ├── main.css          # General styles
│   │   ├── chat.css          # Chat-specific styles
│   │   ├── auth.css          # Authentication page styles
│   ├── js/                   # JavaScript files
│   │   ├── main.js           # General frontend logic
│   │   ├── chat.js           # Chat-specific logic
│   │   ├── auth.js           # Signup/login logic
│   ├── assets/               # Static assets (images, fonts)
│
├── logs/                     # Server logs
│   ├── server.log            # Example log file
│
├── README.md                 # Project documentation
```

---

## Installation and Setup

### Prerequisites
1. **Java Development Kit (JDK)**: Install [JDK 8 or later](https://www.oracle.com/java/technologies/javase-downloads.html).
2. **MongoDB**: Set up a local or cloud MongoDB instance. [Get started here](https://www.mongodb.com/docs/manual/installation/).

---

### Steps to Install and Run

#### 1. Clone the Repository
```bash
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name
```

#### 2. Configure MongoDB
1. Create a MongoDB database and collection for your application.
2. Update the `Utils.java` file with your MongoDB connection string:
   ```java
   public static final String MONGO_URI = "mongodb+srv://<username>:<password>@cluster0.mongodb.net/myChatApp";
   public static final String DATABASE_NAME = "myChatApp";
   public static final String USERS_COLLECTION = "users";
   public static final String MESSAGES_COLLECTION = "messages";
   ```

#### 3. Compile the Java Backend
1. Navigate to the `src` directory:
   ```bash
   cd src
   ```
2. Compile all `.java` files:
   ```bash
   javac *.java
   ```

#### 4. Start the Server
Run the backend server:
```bash
java MainServer
```
The server will start at `http://localhost:8080`.

#### 5. Serve Frontend Files
You can directly open the `public/index.html` file in your browser or serve it using a lightweight HTTP server:
```bash
cd public
python -m http.server 8081
```
Visit `http://localhost:8081` for the frontend.

---

## Testing the App
1. **Signup**:
   - Open `http://localhost:8080/signup.html` in your browser.
   - Create a new user by filling out the form.

2. **Login**:
   - Navigate to `http://localhost:8080/login.html`.
   - Log in with your credentials.

3. **Chat**:
   - Access the main chat page at `http://localhost:8080/index.html`.
   - Send messages and see them in real time.

---

## Logs
Server logs are stored in the `logs/server.log` file. Use this for debugging or monitoring.

---

## Contributing
Feel free to open issues or submit pull requests to enhance the project. Contributions to improve functionality or performance are welcome!

---

## License
This project is licensed under the MIT License.

---
