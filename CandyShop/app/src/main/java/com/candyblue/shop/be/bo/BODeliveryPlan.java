package com.candyblue.shop.be.bo;

import java.io.Serializable;

/**
 * Created by Andrada Anca on 2/28/2016.
 */
public class BODeliveryPlan implements Serializable{

    private String planIcon;
    private String planName;
    private String planDescription;
    private String planPrice;
    private String planDuration;
    private String planSKU;

    public BODeliveryPlan(String planIcon, String planName, String planDescription, String planPrice, String planDuration, String planSKU) {
        this.planIcon = planIcon;
        this.planName = planName;
        this.planDescription = planDescription;
        this.planPrice = planPrice;
        this.planDuration = planDuration;
        this.planSKU = planSKU;
    }

    public String getPlanIcon() {
        return planIcon;
    }

    public void setPlanIcon(String planIcon) {
        this.planIcon = planIcon;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getPlanDescription() {
        return planDescription;
    }

    public void setPlanDescription(String planDescription) {
        this.planDescription = planDescription;
    }

    public String getPlanPrice() {
        return planPrice;
    }

    public void setPlanPrice(String planPrice) {
        this.planPrice = planPrice;
    }

    public String getPlanDuration() {
        return planDuration;
    }

    public void setPlanDuration(String planDuration) {
        this.planDuration = planDuration;
    }

    public String getPlanSKU() {
        return planSKU;
    }

    public void setPlanSKU(String planSKU) {
        this.planSKU = planSKU;
    }
}
