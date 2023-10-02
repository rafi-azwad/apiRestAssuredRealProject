package core.Helper;

import java.util.HashMap;

public class HeaderFormatHelper {

    private static final String CONTENT_TYPE_HEADER_KEY = "Content-Type";
    private static final String AUTHORIZATION_HEADER_KEY = "Authorization";


    private static final String CONTENT_TYPE_VALUE_APPLICATION_JSON =
            "application/json;charset=UTF-8";
     //private static final String AUTHORIZATION_VALUE = "eyJhbGciOiJIUzUxMiIsInppcCI6IkdaSVAifQ.H4sIAAAAAAAA_yXNQQuCQBAF4P8yZwkllcVTQQSCdeoSbYcVpxxYdVlnxRD_e-t6e3zzHrPA6GooYJHgRrSPn0EJhYTz5VbeJUQ7VzihLht_ydJYeKQtJz5gp0iHRafahk49Mc4H6j9DGCtj7DApfdXqG1rPnR23gyUmHL2-3hsxW6odB1nWFSIgxf5JLo5xnKS5iABns4PIMw_rHwAbOS-9AAAA.d943H3Rt8KYCYdx6CICmy3j9sOnsScFdlwZAZzsUdUZ3E-PXHkM2jBHiuUz5AZsR7E6UBGwquuyq4d_sCJD3cA";
     private static final String AUTHORIZATION_VALUE = "fefe0fd2-a67b-4e51-b624-1a312ae4754f-2c7285d0-a354-4d9d-8789-a6ac8397e082";


    //Common Header(which would be used for all)
//    public static HashMap<String, Object> commonHeaders() {
//        HashMap<String, Object> headers = new HashMap<>();
//        headers.put(CONTENT_TYPE_HEADER_KEY, CONTENT_TYPE_VALUE_APPLICATION_JSON);
//        headers.put("unamefull", "Hussain Mahdi");
//        headers.put("unameid", 1);
//        headers.put(AUTHORIZATION_HEADER_KEY,AUTHORIZATION_VALUE);
//        return headers;
//    }

    public static HashMap<String, Object> commonHeadersForNewAgent() {
        HashMap<String, Object> headers = new HashMap<>();
        headers.put(CONTENT_TYPE_HEADER_KEY, CONTENT_TYPE_VALUE_APPLICATION_JSON);
        headers.put("unamefull", "Hussain Mahdi");
        headers.put("unameid", 1);
        headers.put(AUTHORIZATION_HEADER_KEY,"Bearer "+AUTHORIZATION_VALUE);
        return headers;
    }
//    public static HashMap<String, Object> commonHeadersForNewAgent(String AUTHORIZATION_VALUE ) {
//        HashMap<String, Object> headers = new HashMap<>();
//        headers.put(CONTENT_TYPE_HEADER_KEY, CONTENT_TYPE_VALUE_APPLICATION_JSON);
//        headers.put(AUTHORIZATION_HEADER_KEY,"Bearer "+AUTHORIZATION_VALUE);
//        return headers;
//    }
}
