package com.rozaracho.linkTracker.rest.dto;

import java.io.Serializable;

public class RedirectDto implements Serializable {
    private Integer numberOfRedirects;

    public Integer getNumberOfRedirects() {
        return numberOfRedirects;
    }

    public void setNumberOfRedirects(Integer numberOfRedirects) {
        this.numberOfRedirects = numberOfRedirects;
    }
}
