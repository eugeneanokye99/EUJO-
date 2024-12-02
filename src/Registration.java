import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.*;
import java.util.*;

public class Registration implements HttpHandler {
    private static Map<String, String> users = new HashMap<>();

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        if ("POST".equals(exchange.getRequestMethod())) {
            String body = new String(exchange.getRequestBody().readAllBytes());
            String[] credentials = body.split("&");
            String username = credentials[0].split("=")[1];
            String password = credentials[1].split("=")[1];

            if (users.containsKey(username)) {
                sendResponse(exchange, "User already exists", 400);
            } else {
                users.put(username, password);
                sendResponse(exchange, "Signup successful", 200);
            }
        } else {
            sendResponse(exchange, "Invalid method", 405);
        }
    }

    public static boolean registerUser(String username, String password) {
        if (!users.containsKey(username)) {
            users.put(username, password);
            return true;
        }
        return false;
    }

    // Getter method for accessing users
    public static Map<String, String> getUsers() {
        return users;
    }

    private void sendResponse(HttpExchange exchange, String response, int statusCode) throws IOException {
        exchange.sendResponseHeaders(statusCode, response.getBytes().length);
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}
