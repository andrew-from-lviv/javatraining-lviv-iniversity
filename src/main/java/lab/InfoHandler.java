package lab;

public class InfoHandler implements HttpHandler {
    @Override
    public void handleRequest() {
        System.out.println("Info 1xx ...");
    }
}
