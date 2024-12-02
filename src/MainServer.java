import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.*;
import java.net.InetSocketAddress;
import java.nio.file.*;

public class MainServer {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        // Route requests to appropriate handlers
        server.createContext("/", new StaticFileHandler("public"));
        server.createContext("/signup", new Registration());
        server.createContext("/login", new Login());
        server.createContext("/chat", new ChatHandler());

        server.setExecutor(null); // Default executor
        System.out.println("Server running on http://localhost:8080");
        server.start();
    }
}
