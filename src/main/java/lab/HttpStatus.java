package lab;

public enum HttpStatus {
    SUCCESS(2, new SuccessHandler()), INFO(1, new InfoHandler()), SERVER_ERROR(5, new ServerErrorHandler()),
        REDIRECTION(3, new RedirectionHandler()), CLIENT_ERROR(4, new ClientErrorHandler());

    private final int dbCode;

    public HttpHandler getHandler() {
        return handler;
    }

    private final HttpHandler handler;



    HttpStatus(int dbCode, HttpHandler handler) {
        this.dbCode = dbCode;
        this.handler = handler;
    }

    public static HttpStatus findByHttpCode(int code) {
        HttpStatus[] statuses = values();
        code = code/100;
        for(HttpStatus status: statuses){
            if(status.dbCode == code){
                return status;
            }
        }

        throw new RuntimeException(code + " not supported");
    }
}
