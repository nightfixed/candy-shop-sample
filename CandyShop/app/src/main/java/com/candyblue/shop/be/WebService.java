package com.candyblue.shop.be;

/**
 * Created by Andrada Anca on 2/28/2016.
 */
public class WebService {

    public static final String WEB_SERVICE_RESULT = "WEB_SERVICE_RESULT";
    public static final String WEB_SERVICE_SUCCESS = "WEB_SERVICE_SUCCESS";
    public static final String WEB_SERVICE_ERROR = "WEB_SERVICE_ERROR";

    private static final boolean USE_SIMULATOR = true;

    public static IWebInterface getFromWeb(){
        if(USE_SIMULATOR){
            return new WebServiceSim();
        } else {
            return new WebServiceHelper();
        }
    }
}
