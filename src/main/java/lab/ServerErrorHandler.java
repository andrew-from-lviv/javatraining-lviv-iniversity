package lab;

public class ServerErrorHandler implements HttpHandler {
    @Override
    public void handleRequest() {
        System.out.println("Server Error 5xx ...");
    }
}
