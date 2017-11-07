package lab;


public class Main {
    public static void main(String[] args) {
        HttpService service = new HttpService();
         int[] codes =  {102, 304, 405, 508, 200, 300, 400, 101};
         for(int code: codes){
             service.handleHttpCode(code);
         }
        }
    }
