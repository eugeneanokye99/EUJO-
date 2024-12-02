import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.*;
import java.util.Map;

public class Login implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        if ("POST".equals(exchange.getRequestMethod())) {
            // Get request body
            String requestBody = new String(exchange.getRequestBody().readAllBytes());
            String[] credentials = requestBody.split("&");
            String username = credentials[0].split("=")[1];
            String password = credentials[1].split("=")[1];

            // Use Map<String, String> instead of HashMap
            Map<String, String> users = Registration.getUsers();
            if (users.containsKey(username) && users.get(username).equals(password)) {
                String response = "Login successful!";
                exchange.sendResponseHeaders(200, response.length());
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            } else {
                String response = "Invalid username or password.";
                exchange.sendResponseHeaders(401, response.length());
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        } else {
            exchange.sendResponseHeaders(405, -1); // Method not allowed
        }
    }
}
