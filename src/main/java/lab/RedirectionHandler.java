package lab;

public class RedirectionHandler implements HttpHandler {
    @Override
    public void handleRequest() {
        System.out.println("Redirected ... 3xx");
    }
}
