package com.rozaracho.linkTracker.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "redirects")
public class Redirect{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="masked_link_id")
    private MaskedLink maskedLink;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MaskedLink getMaskedLink() {
        return maskedLink;
    }

    public void setMaskedLink(MaskedLink maskedLink) {
        this.maskedLink = maskedLink;
    }
}