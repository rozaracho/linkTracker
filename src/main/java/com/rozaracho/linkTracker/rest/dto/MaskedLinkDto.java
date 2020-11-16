package com.rozaracho.linkTracker.rest.dto;

import java.io.Serializable;

public class MaskedLinkDto implements Serializable {
    private String target;
    private String link;
    private Boolean valid;

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }
}
