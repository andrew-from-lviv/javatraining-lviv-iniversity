package lab;

public enum HttpStatus {
    SUCCESS(2, new SuccessHandler()), INFO(3, new InfoHandler());//, SERVER_ERROR(4, new );

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
        code = (int)code/100;
        for(HttpStatus status: statuses){
            if(status.dbCode == code){
                return status;
            }
        }

        throw new RuntimeException(code + " not supported");
    }
}
