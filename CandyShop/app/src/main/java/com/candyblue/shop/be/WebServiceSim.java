package com.candyblue.shop.be;

import android.os.Bundle;

import com.candyblue.shop.be.bo.BODeliveryPlan;

import java.util.ArrayList;

/**
 * Created by Andrada Anca on 2/28/2016.
 */
public class WebServiceSim implements IWebInterface {
    @Override
    public void getAvailablePlans(final WebServiceResponseCallback c) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                ArrayList<BODeliveryPlan> deliveryPlans = new ArrayList<>(4);

                deliveryPlans.add(new BODeliveryPlan("http://lorempixel.com/99/99/food/",
                        "Candy Shop 7-days",
                        "For our daily customers! \n1 Delivery every day, for 7 days !",
                        "7 silver coins",
                        "7 days",
                        "com.candyblue.shop.1week"));

                deliveryPlans.add(new BODeliveryPlan("http://lorempixel.com/100/100/food/",
                        "Candy Shop 14-days",
                        "For our more accustomed customers! \n1 Delivery every day, for 14 days !",
                        "12 silver coins",
                        "14 days",
                        "com.candyblue.shop.2week"));

                deliveryPlans.add(new BODeliveryPlan("http://lorempixel.com/98/98/food/",
                        "Candy Shop 1-month",
                        "For our customers, that can't have a day without us! \n1 Delivery every day, for 1 month !",
                        "24 silver coins",
                        "30 days",
                        "com.candyblue.shop.1month"));

                deliveryPlans.add(new BODeliveryPlan("http://lorempixel.com/98/98/food/",
                        "Candy Shop 3-months",
                        "For our most loyal customers! \n1 Delivery every day, for 3 months !",
                        "70 silver coins",
                        "90 days",
                        "com.candyblue.shop.3month"));

                Bundle result = new Bundle();
                result.putSerializable(WebService.WEB_SERVICE_RESULT, deliveryPlans);
                result.putBoolean(WebService.WEB_SERVICE_SUCCESS, true);

                c.onComplete(result);
            }
        }).start();
    }
}
