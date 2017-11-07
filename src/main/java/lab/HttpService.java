package lab;

public class HttpService {
    public void handleHttpCode(int code) {
        HttpStatus httpCode = HttpStatus.findByHttpCode(code);
        httpCode.getHandler().handleRequest();
    }
}

