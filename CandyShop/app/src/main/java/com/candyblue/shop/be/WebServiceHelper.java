package com.candyblue.shop.be;

import android.os.Bundle;

/**
 * Created by Andrada Anca on 2/28/2016.
 */
public class WebServiceHelper implements IWebInterface {
    @Override
    public void getAvailablePlans(WebServiceResponseCallback c) {
        c.onComplete(new Bundle());
    }
}
