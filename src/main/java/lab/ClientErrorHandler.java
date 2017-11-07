package lab;

public class ClientErrorHandler implements HttpHandler {
    @Override
    public void handleRequest() {
        System.out.println("Client Error 4xx ...");
    }
}
