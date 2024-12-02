# Secure Chat Application

## Overview
This is a full-stack chat application featuring **end-to-end encryption** to secure user communications. Built with **React.js**, **Node.js**, and **MongoDB**, it emphasizes data privacy and security. The app includes features such as real-time messaging, user authentication, and encrypted data storage, ensuring that user conversations remain confidential.

## Features
- **End-to-End Encryption:** Messages are encrypted from the sender to the receiver, ensuring that no intermediary can access or read them.
- **Real-time Messaging:** Instant updates for all chats using WebSockets.
- **User Authentication:** Secure login and registration using JWT tokens.
- **Responsive Design:** Works seamlessly on desktops and mobile devices.
- **Database:** MongoDB for efficient and scalable data storage.
- **Node.js Backend:** Fast and scalable server using Express.js.

## Technologies Used
- **Frontend:** React.js, Axios, WebSockets
- **Backend:** Node.js, Express.js, WebSocket for real-time updates
- **Database:** MongoDB
- **Encryption:** AES for message encryption, RSA for key exchange

## Installation
To get the project running on your local machine:

1. Clone the repository:
    ```bash
    git clone https://github.com/your-username/your-repo-name.git
    ```

2. Install dependencies for both client and server:
    ```bash
    cd client
    npm install
    cd ../server
    npm install
    ```

3. Create a `.env` file in the server directory with the following keys:
    ```
    MONGODB_URI=<Your MongoDB connection URI>
    JWT_SECRET=<Your JWT secret key>
    ```

4. Start the server:
    ```bash
    cd server
    npm start
    ```

5. Start the React frontend:
    ```bash
    cd client
    npm start
    ```

6. Access the app at `http://localhost:3000`.

## Documentation
For a more in-depth explanation of the app’s architecture and encryption methods, see the **documentation.pdf** file.

## Contributing
Feel free to open issues or submit pull requests to enhance the project.

## License
This project is licensed under the MIT License.
