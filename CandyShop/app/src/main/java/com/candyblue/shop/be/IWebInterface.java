package com.candyblue.shop.be;

import android.os.Bundle;

/**
 * Created by Andrada Anca on 2/28/2016.
 */
public interface IWebInterface {

    void getAvailablePlans(WebServiceResponseCallback c);

    public interface WebServiceResponseCallback{
        void onComplete(Bundle result);
    }
}
