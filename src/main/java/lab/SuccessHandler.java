package lab;

public class SuccessHandler implements HttpHandler{
    @Override
    public void handleRequest() {
        System.out.println("Success 2xx...");
    }
}
