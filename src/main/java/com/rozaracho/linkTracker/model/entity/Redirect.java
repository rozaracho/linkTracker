package com.rozaracho.linkTracker.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "redirects")
public class Redirect{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String url;
    @ManyToOne
    @JoinColumn(insertable = false, updatable = false)
    private MaskedLink maskedLink;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public MaskedLink getMaskedLink() {
        return maskedLink;
    }

    public void setMaskedLink(MaskedLink maskedLink) {
        this.maskedLink = maskedLink;
    }
}