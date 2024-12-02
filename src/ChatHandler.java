import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.*;
import java.util.*;

public class ChatHandler implements HttpHandler {
    private static List<String> messages = new ArrayList<>();

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        if ("POST".equals(exchange.getRequestMethod())) {
            String message = new String(exchange.getRequestBody().readAllBytes());
            messages.add(message);
            sendResponse(exchange, "Message sent", 200);
        } else if ("GET".equals(exchange.getRequestMethod())) {
            StringBuilder response = new StringBuilder();
            for (String msg : messages) {
                response.append(msg).append("\n");
            }
            sendResponse(exchange, response.toString(), 200);
        } else {
            sendResponse(exchange, "Invalid method", 405);
        }
    }

    private void sendResponse(HttpExchange exchange, String response, int statusCode) throws IOException {
        exchange.sendResponseHeaders(statusCode, response.getBytes().length);
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}
