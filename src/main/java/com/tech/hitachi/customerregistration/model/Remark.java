package com.tech.hitachi.customerregistration.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Remark {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int remarkId;
    private int customerId;




    public Remark() {

    }



    public Remark(int remarkId, int customerId) {
        this.remarkId = remarkId;
        this.customerId = customerId;
    }

    public int getRemarkId() {
        return remarkId;
    }

    public void setRemarkId(int remarkId) {
        this.remarkId = remarkId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
